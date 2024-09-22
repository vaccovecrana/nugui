package vector_tile;

import vector_tile.TileOuterClass.Tile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VectorTileFeature {

  public Map<String, Object> properties = new HashMap<>();
  public int extent;
  public int type = 0; // 0: Unknown, 1: Point, 2: LineString, 3: Polygon
  public Long id = null;

  private Tile tile;

  public VectorTileFeature(Tile tile) {
    this.tile = tile;
    if (!tile.getLayersList().isEmpty()) {
      this.extent = tile.getLayers(0).getExtent(); // Assuming extent is the same for all layers.
    }
  }

  public List<GeoJSONFeature> convertTileToGeoJSON() {
    List<GeoJSONFeature> geojsonFeatures = new ArrayList<>();

    for (Tile.Layer layer : tile.getLayersList()) {
      List<String> keys = layer.getKeysList();
      List<Tile.Value> values = layer.getValuesList();

      for (Tile.Feature feature : layer.getFeaturesList()) {
        GeoJSONFeature geoFeature = new GeoJSONFeature();
        geoFeature.type = "Feature";
        geoFeature.geometry = convertFeatureGeometry(feature);
        geoFeature.properties = convertTagsToProperties(keys, values, feature);
        geoFeature.id = feature.hasId() ? String.valueOf(feature.getId()) : null;
        geojsonFeatures.add(geoFeature);
      }
    }

    return geojsonFeatures;
  }

  private Map<String, Object> convertTagsToProperties(List<String> keys, List<Tile.Value> values, Tile.Feature feature) {
    Map<String, Object> properties = new HashMap<>();
    for (int i = 0; i < feature.getTagsCount(); i += 2) {
      String key = keys.get(feature.getTags(i));
      Tile.Value value = values.get(feature.getTags(i + 1));
      properties.put(key, getValue(value));
    }
    return properties;
  }

  private Object getValue(Tile.Value value) {
    if (value.hasStringValue()) {
      return value.getStringValue();
    } else if (value.hasIntValue()) {
      return value.getIntValue();
    } else if (value.hasDoubleValue()) {
      return value.getDoubleValue();
    } else if (value.hasBoolValue()) {
      return value.getBoolValue();
    }
    return null;
  }

  private GeoJSONGeometry convertFeatureGeometry(Tile.Feature feature) {
    GeoJSONGeometry geometry = new GeoJSONGeometry();
    List<List<Point>> vtCoords = loadGeometry(feature);

    switch (feature.getType().getNumber()) {
      case 1: // Point
        geometry.type = vtCoords.size() == 1 ? "Point" : "MultiPoint";
        geometry.coordinates = convertToCoordinates(vtCoords);
        break;
      case 2: // LineString
        geometry.type = vtCoords.size() == 1 ? "LineString" : "MultiLineString";
        geometry.coordinates = convertToCoordinates(vtCoords);
        break;
      case 3: // Polygon
        geometry.type = vtCoords.size() == 1 ? "Polygon" : "MultiPolygon";
        geometry.coordinates = convertToCoordinates(vtCoords);
        break;
      default:
        throw new IllegalArgumentException("Unknown feature type: " + feature.getType().getNumber());
    }
    return geometry;
  }

  private List<Object> convertToCoordinates(List<List<Point>> vtCoords) {
    List<Object> coordinates = new ArrayList<>();
    for (List<Point> line : vtCoords) {
      List<Object> lineCoordinates = new ArrayList<>();
      for (Point point : line) {
        List<Double> coordinate = new ArrayList<>();
        coordinate.add((double) point.x);
        coordinate.add((double) point.y);
        lineCoordinates.add(coordinate);
      }
      coordinates.add(lineCoordinates);
    }
    return coordinates;
  }

  public List<List<Point>> loadGeometry(Tile.Feature feature) {
    List<List<Point>> lines = new ArrayList<>();
    List<Point> line = null;

    List<Integer> geometry = feature.getGeometryList();
    int cmd = 1;
    int length = 0;
    int x = 0;
    int y = 0;

    for (int i = 0; i < geometry.size(); ) {
      if (length == 0) {
        int cmdLen = geometry.get(i++);
        cmd = cmdLen & 0x7;
        length = cmdLen >> 3;
      }

      length--;

      if (cmd == 1 || cmd == 2) { // MoveTo or LineTo
        x += decodeZigZag(geometry.get(i++));
        y += decodeZigZag(geometry.get(i++));

        if (cmd == 1) { // moveTo
          if (line != null) {
            lines.add(line);
          }
          line = new ArrayList<>();
        }

        if (line != null) {
          line.add(new Point(x, y));
        }

      } else if (cmd == 7) { // closePolygon
        if (line != null) {
          line.add(line.get(0)); // Close the polygon
        }

      } else {
        throw new IllegalArgumentException("Unknown command: " + cmd);
      }
    }

    if (line != null) {
      lines.add(line);
    }

    return lines;
  }

  private int decodeZigZag(int n) {
    return (n >> 1) ^ (-(n & 1));
  }

  // Helper class for GeoJSON feature
  public static class GeoJSONFeature {
    public String type;
    public GeoJSONGeometry geometry;
    public Map<String, Object> properties;
    public String id;
  }

  // Helper class for GeoJSON geometry
  public static class GeoJSONGeometry {
    public String type;
    public List<Object> coordinates;
  }

  // Simple Point class for storing x and y
  public static class Point {
    public int x, y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

}
