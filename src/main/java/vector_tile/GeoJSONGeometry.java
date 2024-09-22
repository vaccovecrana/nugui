package vector_tile;

import java.util.List;

public class GeoJSONGeometry {
  public String type; // "Point", "LineString", "Polygon", etc.
  public List<Object> coordinates; // Can be List of Lists (for LineString, Polygon, etc.) or single coordinate (for Point)
}