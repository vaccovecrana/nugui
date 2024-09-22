package io.vacco.nugui;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Polygon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import vector_tile.TileOuterClass;

public class MVTRenderer {

  private static final int TILE_SIZE = 256;  // Tile size in pixels
  private static final int EXTENT = 4096;    // Default extent of vector tiles

  public static void renderTileToPNG(TileOuterClass.Tile tile, String outputPath) throws IOException {
    // Create a BufferedImage for rendering
    BufferedImage image = new BufferedImage(TILE_SIZE, TILE_SIZE, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = image.createGraphics();

    // Set rendering hints for quality
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Fill the background with a white color
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, TILE_SIZE, TILE_SIZE);

    // Render each layer in the tile
    for (var layer : tile.getLayersList()) {
      renderLayer(g, layer);
    }

    // Save the image as a PNG file
    ImageIO.write(image, "png", new File(outputPath));

    // Dispose the graphics object
    g.dispose();
  }

  private static void renderLayer(Graphics2D g, TileOuterClass.Tile.Layer layer) {
    // Differentiate layers by color
    Color layerColor = getLayerColor(layer.getName());
    g.setColor(layerColor);

    for (var feature : layer.getFeaturesList()) {
      switch (feature.getType()) {
        case POLYGON:
          renderPolygon(g, feature, layer.getExtent());
          break;
        case LINESTRING:
          renderLineString(g, feature, layer.getExtent());
          break;
        case POINT:
          renderPoint(g, feature, layer.getExtent());
          break;
      }
    }
  }

  private static void renderPolygon(Graphics2D g, TileOuterClass.Tile.Feature feature, int extent) {
    // Convert the geometry into pixel coordinates and draw it on the canvas
    int[][] geometry = decodeGeometry(feature.getGeometryList());

    Polygon polygon = new Polygon();
    for (int[] coord : geometry) {
      int x = scaleToTileSize(coord[0], extent);
      int y = scaleToTileSize(coord[1], extent);
      polygon.addPoint(x, y);
    }

    // Fill the polygon
    g.fillPolygon(polygon);
  }

  private static void renderLineString(Graphics2D g, TileOuterClass.Tile.Feature feature, int extent) {
    int[][] geometry = decodeGeometry(feature.getGeometryList());

    for (int i = 0; i < geometry.length - 1; i++) {
      int x1 = scaleToTileSize(geometry[i][0], extent);
      int y1 = scaleToTileSize(geometry[i][1], extent);
      int x2 = scaleToTileSize(geometry[i + 1][0], extent);
      int y2 = scaleToTileSize(geometry[i + 1][1], extent);

      // Draw the line between points
      g.drawLine(x1, y1, x2, y2);
    }
  }

  private static void renderPoint(Graphics2D g, TileOuterClass.Tile.Feature feature, int extent) {
    int[][] geometry = decodeGeometry(feature.getGeometryList());

    for (int[] coord : geometry) {
      int x = scaleToTileSize(coord[0], extent);
      int y = scaleToTileSize(coord[1], extent);
      g.fillOval(x - 2, y - 2, 4, 4); // Draw a small circle for the point
    }
  }

  private static int[][] decodeGeometry(List<Integer> geometryList) {
    List<int[]> decodedGeometry = new ArrayList<>();
    int x = 0, y = 0; // Initial coordinates are (0,0)

    int i = 0;
    while (i < geometryList.size()) {
      // Decode the command integer
      int commandInteger = geometryList.get(i++);
      int command = commandInteger & 0x7; // Lower 3 bits
      int repeatCount = commandInteger >> 3; // Upper bits specify how many pairs follow

      switch (command) {
        case 1: // MoveTo command
        case 2: // LineTo command
          for (int j = 0; j < repeatCount; j++) {
            int dx = decodeZigZag(geometryList.get(i++));
            int dy = decodeZigZag(geometryList.get(i++));
            x += dx;
            y += dy;
            decodedGeometry.add(new int[]{x, y});
          }
          break;
        case 7: // ClosePath command
          // Close the current path; usually no coordinates follow
          break;
        default:
          throw new IllegalArgumentException("Unknown command: " + command);
      }
    }

    // Convert the list to an array for rendering
    return decodedGeometry.toArray(new int[decodedGeometry.size()][]);
  }

  // Decode ZigZag encoding for integers
  private static int decodeZigZag(int n) {
    return (n >> 1) ^ (-(n & 1)); // ZigZag decoding as per protocol buffer spec
  }

  private static int scaleToTileSize(int coord, int extent) {
    int scaled = Math.round((float) coord * TILE_SIZE / extent);
    return Math.max(0, Math.min(scaled, TILE_SIZE - 1)); // Clamp to 0–255 range
  }

  private static Color getLayerColor(String layerName) {
    switch (layerName) {
      case "water":
        return Color.BLUE;
      case "landuse":
        return Color.GREEN;
      case "roads":
        return Color.BLACK;
      default:
        return Color.GRAY; // Default color for unhandled layers
    }
  }

}
