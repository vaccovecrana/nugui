package vector_tile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MVTToGeoJSONConverter {

  private static final int COMMAND_MOVE_TO = 1;
  private static final int COMMAND_LINE_TO = 2;
  private static final int COMMAND_CLOSE_PATH = 7;

  public static GeoJSONFeatureCollection convertTileToGeoJSON(TileOuterClass.Tile tile) {
    GeoJSONFeatureCollection featureCollection = new GeoJSONFeatureCollection();
    featureCollection.features = new ArrayList<>();

    // Iterate through all layers in the MVT tile
    for (TileOuterClass.Tile.Layer layer : tile.getLayersList()) {
      // Iterate through all features in each layer
      for (TileOuterClass.Tile.Feature feature : layer.getFeaturesList()) {
        GeoJSONFeature geoFeature = new GeoJSONFeature();
        geoFeature.type = "Feature";
        geoFeature.geometry = convertGeometry(feature);
        geoFeature.properties = convertTagsToProperties(layer, feature);
        geoFeature.id = feature.hasId() ? String.valueOf(feature.getId()) : null;
        featureCollection.features.add(geoFeature);
      }
    }

    return featureCollection;
  }

  private static GeoJSONGeometry convertGeometry(TileOuterClass.Tile.Feature feature) {
    GeoJSONGeometry geometry = new GeoJSONGeometry();
    var geometryData = feature.getGeometryList();

    switch (feature.getType()) {
      case POINT: // Point
        geometry.type = "Point";
        geometry.coordinates = parsePoint(geometryData);
        break;
      case LINESTRING: // LineString
        geometry.type = "LineString";
        geometry.coordinates = parseLineString(geometryData);
        break;
      case POLYGON: // Polygon
        geometry.type = "Polygon";
        geometry.coordinates = parsePolygon(geometryData);
        break;
      default:
        throw new IllegalArgumentException("Unsupported geometry type");
    }

    return geometry;
  }

  private static List<Object> parsePoint(List<Integer> geometryData) {
    List<Object> point = new ArrayList<>();
    if (geometryData.size() >= 2) {
      point.add(decodeZigZag(geometryData.get(0)));
      point.add(decodeZigZag(geometryData.get(1)));
    }
    return point;
  }

  private static List<Object> parseLineString(List<Integer> geometryData) {
    List<Object> lineString = new ArrayList<>();
    parseGeometryCommands(geometryData, lineString);
    return lineString;
  }

  private static List<Object> parsePolygon(List<Integer> geometryData) {
    List<Object> polygon = new ArrayList<>();
    List<Object> ring = new ArrayList<>();
    parseGeometryCommands(geometryData, ring);

    // Check orientation and reverse if necessary (apply right-hand rule)
    if (!ring.isEmpty() && !isCounterClockwise(ring)) {
      reverseRing(ring);
    }

    polygon.add(ring);
    return polygon;
  }

  private static boolean isCounterClockwise(List<Object> ring) {
    double signedArea = calculateSignedArea(ring);
    return signedArea > 0;
  }

  private static double calculateSignedArea(List<Object> ring) {
    double area = 0.0;
    for (int i = 0; i < ring.size() - 1; i++) {
      List<Object> point1 = (List<Object>) ring.get(i);
      List<Object> point2 = (List<Object>) ring.get(i + 1);
      double x1 = ((Number) point1.get(0)).doubleValue();
      double y1 = ((Number) point1.get(1)).doubleValue();
      double x2 = ((Number) point2.get(0)).doubleValue();
      double y2 = ((Number) point2.get(1)).doubleValue();
      area += (x2 - x1) * (y2 + y1);
    }
    return area;
  }

  private static void reverseRing(List<Object> ring) {
    int size = ring.size();
    for (int i = 0; i < size / 2; i++) {
      Object temp = ring.get(i);
      ring.set(i, ring.get(size - i - 1));
      ring.set(size - i - 1, temp);
    }
  }

  private static void parseGeometryCommands(List<Integer> geometryData, List<Object> coordinates) {
    int i = 0;
    int x = 0, y = 0;

    while (i < geometryData.size()) {
      int commandInteger = geometryData.get(i++);
      int command = commandInteger & 0x7; // Lower 3 bits are the command type
      int length = commandInteger >> 3;   // Upper bits are the number of points

      switch (command) {
        case COMMAND_MOVE_TO:
          for (int j = 0; j < length; j++) {
            if (i + 1 < geometryData.size()) {
              x += decodeZigZag(geometryData.get(i++));
              y += decodeZigZag(geometryData.get(i++));
              List<Object> point = new ArrayList<>();
              point.add(x);
              point.add(y);
              coordinates.add(point);
            }
          }
          break;

        case COMMAND_LINE_TO:
          for (int j = 0; j < length; j++) {
            if (i + 1 < geometryData.size()) {
              x += decodeZigZag(geometryData.get(i++));
              y += decodeZigZag(geometryData.get(i++));
              List<Object> point = new ArrayList<>();
              point.add(x);
              point.add(y);
              coordinates.add(point);
            }
          }
          break;

        case COMMAND_CLOSE_PATH:
          // Close the polygon by connecting the last point to the first one
          if (!coordinates.isEmpty()) {
            coordinates.add(coordinates.get(0));
          }
          break;

        default:
          throw new IllegalArgumentException("Unknown geometry command: " + command);
      }
    }
  }

  private static int decodeZigZag(int value) {
    return (value >> 1) ^ (-(value & 1));
  }

  private static Map<String, Object> convertTagsToProperties(TileOuterClass.Tile.Layer layer, TileOuterClass.Tile.Feature feature) {
    Map<String, Object> properties = new HashMap<>();
    for (int i = 0; i < feature.getTagsCount(); i += 2) {
      int keyIndex = feature.getTags(i);
      int valueIndex = feature.getTags(i + 1);
      String key = layer.getKeys(keyIndex);
      var value = layer.getValues(valueIndex);
      properties.put(key, getValue(value));
    }
    return properties;
  }

  private static Object getValue(TileOuterClass.Tile.Value value) {
    if (value.hasStringValue()) return value.getStringValue();
    if (value.hasIntValue()) return value.getIntValue();
    if (value.hasDoubleValue()) return value.getDoubleValue();
    if (value.hasBoolValue()) return value.getBoolValue();
    return null;
  }

}
