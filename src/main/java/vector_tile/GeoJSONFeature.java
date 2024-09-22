package vector_tile;

import java.util.Map;

public class GeoJSONFeature {
  public String type = "Feature";
  public GeoJSONGeometry geometry;
  public Map<String, Object> properties;
  public String id;
}