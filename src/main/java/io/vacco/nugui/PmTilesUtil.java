package io.vacco.nugui;

import java.io.IOException;

public class PmTilesUtil {

  public static void printMetadata(PMTiles pmt) {
    System.out.println("PMTiles Metadata:");
    System.out.println("PMTiles spec version: " + pmt.header.version);

    String tileType;
    switch (pmt.header.tileType) {
      case 1:
        tileType = "Vector Protobuf (MVT)";
        break;
      case 2:
        tileType = "PNG";
        break;
      case 3:
        tileType = "JPEG";
        break;
      case 4:
        tileType = "WEBP";
        break;
      case 5:
        tileType = "AVIF";
        break;
      default:
        tileType = "Unknown";
        break;
    }

    System.out.println("Tile type: " + tileType);

    // Bounds: interpreted as 32-bit signed integers for microdegrees (1e7)
    double minLon = (double) ((int) (pmt.header.minPosition >> 32)) / 1e7;
    double minLat = (double) ((int) (pmt.header.minPosition & 0xFFFFFFFFL)) / 1e7;
    double maxLon = (double) ((int) (pmt.header.maxPosition >> 32)) / 1e7;
    double maxLat = (double) ((int) (pmt.header.maxPosition & 0xFFFFFFFFL)) / 1e7;

    System.out.printf("Bounds: (long: %f, lat: %f) (long: %f, lat: %f)\n", minLon, minLat, maxLon, maxLat);

    System.out.println("Min zoom: " + pmt.header.minZoom);
    System.out.println("Max zoom: " + pmt.header.maxZoom);

    double centerLon = (double) ((int) (pmt.header.centerPosition >> 32)) / 1e7;
    double centerLat = (double) ((int) (pmt.header.centerPosition & 0xFFFFFFFFL)) / 1e7;

    System.out.printf("Center: (long: %f, lat: %f)\n", centerLon, centerLat);
    System.out.println("Center zoom: " + pmt.header.centerZoom);
    System.out.println("Addressed tiles count: " + pmt.header.numAddressedTiles);
    System.out.println("Tile entries count: " + pmt.header.numTileEntries);
    System.out.println("Tile contents count: " + pmt.header.numTileContents);
    System.out.println("Clustered: " + (pmt.header.clustered == 1 ? "true" : "false"));

    String compression;
    switch (pmt.header.tileCompression) {
      case 1:
        compression = "None";
        break;
      case 2:
        compression = "Gzip";
        break;
      case 3:
        compression = "Brotli";
        break;
      case 4:
        compression = "Zstd";
        break;
      default:
        compression = "Unknown";
        break;
    }

    System.out.println("Tile compression: " + compression);
    System.out.println("Metadata contains binary or compressed data.");
    System.out.println("Metadata length: " + pmt.header.metadataLength);
  }

  public static void printAllTileIds(PMTiles pmt) throws IOException {
    // Loop over all zoom levels (from 0 to 7)
    for (int z = 0; z <= 7; z++) {
      int numTiles = 1 << z; // Number of tiles in each dimension for this zoom level (2^z)
      // Loop over all x and y coordinates for the current zoom level
      for (int x = 0; x < numTiles; x++) {
        for (int y = 0; y < numTiles; y++) {
          // Calculate the Tile ID using the Hilbert curve
          long tileId = pmt.calculateTileId(z, x, y);
          System.out.printf("Tile ID for z=%d, x=%d, y=%d -> Tile ID: %d%n", z, x, y, tileId);
          var data = pmt.getTile(z, x, y);
        }
      }
    }
  }

}
