package io.vacco.nugui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.List;
import vector_tile.TileOuterClass.Tile;

public class VectorTileRenderer {

  public static byte[] renderTileToPNG(Tile tile, int width, int height) throws IOException {
    BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D graphics = bufferedImage.createGraphics();

    // Set up anti-aliasing and rendering quality (similar to AGG rendering)
    graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

    // Clip the rendering area (similar to the clip_box in C++)
    graphics.setClip(0, 0, width, height);

    // Set up background color
    Color backgroundColor = Color.WHITE; // Default white background
    graphics.setColor(backgroundColor);
    graphics.fillRect(0, 0, width, height); // Fill the background

    // Iterate through layers and render each feature
    for (Tile.Layer layer : tile.getLayersList()) {
      startLayerProcessing(layer);
      for (Tile.Feature feature : layer.getFeaturesList()) {
        renderFeature(graphics, feature);
      }
      endLayerProcessing();
    }

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ImageIO.write(bufferedImage, "PNG", byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }

  private static void startLayerProcessing(Tile.Layer layer) {
    // Handle any layer-specific operations such as clipping or setting up new buffers
    System.out.println("Start processing layer: " + layer.getName());
    // Add further processing steps here (e.g., composite operations or layer blending)
  }

  private static void endLayerProcessing() {
    // Finalize any processing for the layer (e.g., merging buffers, composite ops)
    System.out.println("End processing layer");
  }

  private static void renderFeature(Graphics2D graphics, Tile.Feature feature) {
    List<Integer> geometry = feature.getGeometryList();
    int x = 0, y = 0; // Starting position
    int cmd = 0;
    int length = 0;
    Polygon polygon = new Polygon();

    // Decode geometry commands (MoveTo, LineTo, ClosePath, and others)
    for (int i = 0; i < geometry.size(); ) {
      if (length == 0) {
        if (i >= geometry.size()) {
          System.err.println("End of geometry list reached unexpectedly.");
          break;
        }
        int commandInteger = geometry.get(i++);
        cmd = commandInteger & 0x7;
        length = commandInteger >> 3;
        System.out.println("Command: " + cmd + ", Length: " + length + ", Current Index: " + i);
      }

      // Ensure enough data is available to process the current command
      if (length > 0 && (i + 2 * length > geometry.size())) {
        System.err.println("Insufficient data for length. Index: " + i + ", Length: " + length);
        break; // Exit the loop on insufficient data
      }

      switch (cmd) {
        case 1: // MoveTo command
        case 2: // LineTo command
          for (int j = 0; j < length; j++) {
            if (i + 1 >= geometry.size()) {
              System.err.println("Index out of bounds during MoveTo/LineTo. Index: " + i);
              return; // Exit the function to avoid an infinite loop
            }
            int dx = zigZagDecode(geometry.get(i++));
            int dy = zigZagDecode(geometry.get(i++));
            x += dx;
            y += dy;
            if (cmd == 1) { // MoveTo resets the polygon
              polygon.reset();
              polygon.addPoint(x, y);
            } else { // LineTo adds a point to the polygon
              polygon.addPoint(x, y);
            }
          }
          break;

        case 7: // ClosePath command
          graphics.drawPolygon(polygon);
          break;

        default:
          System.err.println("Unknown command encountered: " + cmd + ". Skipping...");
          break;
      }

      length--;
    }

    if (polygon.npoints > 0) {
      graphics.drawPolygon(polygon); // Render the polygon on the graphics context
    }
  }

  private static int zigZagDecode(int value) {
    return (value >> 1) ^ (-(value & 1));
  }
}
