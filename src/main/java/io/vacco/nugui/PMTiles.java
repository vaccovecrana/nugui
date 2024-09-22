package io.vacco.nugui;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipException;

import static io.vacco.nugui.NgIO.*;

public class PMTiles {

  private RandomAccessFile pmtilesFile;
  public Header header = new Header();
  public byte[] metadata;

  // Open the file for reading without loading it into memory
  public PMTiles loadFromFile(String filePath) throws IOException {
    pmtilesFile = new RandomAccessFile(filePath, "r");
    loadHeader();
    loadMetadata();
    return this;
  }

  private void loadHeader() throws IOException {
    // Read the first 127 bytes of the file (header)
    byte[] headerData = new byte[127];
    pmtilesFile.seek(0); // Go to the beginning of the file
    pmtilesFile.readFully(headerData);

    ByteBuffer buffer = ByteBuffer.wrap(headerData);
    buffer.order(ByteOrder.LITTLE_ENDIAN);

    byte[] magic = new byte[7];
    buffer.get(magic);
    header.magicNumber = new String(magic);
    header.version = buffer.get() & 0xFF;
    header.rootDirectoryOffset = buffer.getLong();
    header.rootDirectoryLength = buffer.getLong();
    header.metadataOffset = buffer.getLong();
    header.metadataLength = buffer.getLong();
    header.leafDirectoriesOffset = buffer.getLong();
    header.leafDirectoriesLength = buffer.getLong();
    header.tileDataOffset = buffer.getLong();
    header.tileDataLength = buffer.getLong();
    header.numAddressedTiles = buffer.getLong();
    header.numTileEntries = buffer.getLong();
    header.numTileContents = buffer.getLong();
    header.clustered = buffer.get();
    header.internalCompression = buffer.get();
    header.tileCompression = buffer.get();
    header.tileType = buffer.get();
    header.minZoom = buffer.get();
    header.maxZoom = buffer.get();
    header.minPosition = buffer.getLong();
    header.maxPosition = buffer.getLong();
    header.centerZoom = buffer.get();
    header.centerPosition = buffer.getLong();
  }

  private void loadMetadata() throws IOException {
    pmtilesFile.seek(header.metadataOffset); // Go to the metadata offset
    metadata = new byte[(int) header.metadataLength];
    pmtilesFile.readFully(metadata);
  }

  public List<DirectoryEntry> deserializeEntries(byte[] data) throws IOException {
    List<DirectoryEntry> entries = new ArrayList<>();
    InputStream inputStream = new ByteArrayInputStream(data);

    // Read the number of entries
    long numEntries = readUnsignedVarInt(inputStream);
    long lastTileId = 0;

    // Read tile IDs (delta-encoded)
    for (int i = 0; i < numEntries; i++) {
      long deltaTileId = readUnsignedVarInt(inputStream);
      lastTileId += deltaTileId;

      DirectoryEntry entry = new DirectoryEntry();
      entry.tileId = lastTileId;
      entries.add(entry);
    }

    // Read run lengths
    for (int i = 0; i < numEntries; i++) {
      long runLength = readUnsignedVarInt(inputStream);
      entries.get(i).runLength = (int) runLength;
    }

    // Read lengths
    for (int i = 0; i < numEntries; i++) {
      long length = readUnsignedVarInt(inputStream);
      entries.get(i).length = (int) length;
    }

    // Read offsets
    for (int i = 0; i < numEntries; i++) {
      long offset = readUnsignedVarInt(inputStream);
      if (i > 0 && offset == 0) {
        // Calculate the offset based on the previous entry
        DirectoryEntry prevEntry = entries.get(i - 1);
        entries.get(i).offset = prevEntry.offset + prevEntry.length;
      } else {
        // Subtract 1 as the Go code adds 1 to avoid conflict with 0
        entries.get(i).offset = offset - 1;
      }
    }

    return entries;
  }

  public byte[] getTile(int z, int x, int y) throws IOException {
    long tileId = calculateTileId(z, x, y);
    System.out.println("Retrieving tile with ID: " + tileId);

    // Initial values for directory offset and length
    long dirOffset = header.rootDirectoryOffset;
    long dirLength = header.rootDirectoryLength;

    for (int depth = 0; depth <= 3; depth++) {
      // Step 1: Read the directory from the file (root or leaf based on depth)
      pmtilesFile.seek(dirOffset);
      byte[] dirData = new byte[(int) dirLength];
      pmtilesFile.readFully(dirData);

      List<DirectoryEntry> directory;
      if (header.internalCompression == 2) { // Gzip compression
        var decompressedData = decompressGzip(dirData);
        directory = deserializeEntries(decompressedData);
      } else {
        directory = deserializeEntries(dirData);
      }

      // Step 2: Find the tile or directory entry in the current directory
      DirectoryEntry tileEntry = findTile(directory, tileId);

      if (tileEntry != null) {
        if (tileEntry.runLength > 0) {
          // Tile data is found. Fetch and return the tile.
          long tileOffset = header.tileDataOffset + tileEntry.offset;
          byte[] tileData = new byte[(int) tileEntry.length];

          pmtilesFile.seek(tileOffset);
          pmtilesFile.readFully(tileData);

          System.out.println("Tile Entry Offset: " + tileOffset + ", Length: " + tileEntry.length);

          // Step 3: If compressed, decompress the tile
          if (header.tileCompression == 2) { // Gzip compression
            try {
              tileData = decompressGzip(tileData);
              System.out.println("Decompressed tile data size: " + tileData.length);
            } catch (ZipException e) {
              throw new IOException("Tile data not in GZIP format. Failed to decompress.");
            }
          }
          return tileData; // Return the tile data if found
        } else {
          // This is a directory entry. Update the offset and length for the next iteration.
          dirOffset = header.leafDirectoriesOffset + tileEntry.offset;
          dirLength = tileEntry.length;
        }
      } else {
        throw new FileNotFoundException("Tile not found for z=" + z + ", x=" + x + ", y=" + y);
      }
    }

    // If we exit the loop without finding the tile, it's not in the archive.
    throw new FileNotFoundException("Tile not found after descending directories.");
  }

  // Convert (z, x, y) tile coordinates to a Hilbert curve-based Tile ID
  public long calculateTileId(int z, int x, int y) {
    long tileId = 0;
    long n = 1L << z;  // Size of the grid (2^z by 2^z)
    long rx, ry;
    long s, d = 0;

    long lx = x;
    long ly = y;

    for (s = n / 2; s > 0; s /= 2) {
      rx = (lx & s) > 0 ? 1 : 0;
      ry = (ly & s) > 0 ? 1 : 0;
      d += s * s * ((3 * rx) ^ ry);
      long[] rotated = rotate(s, lx, ly, rx, ry);
      lx = rotated[0];
      ly = rotated[1];
    }

    return tileId + d;
  }

  private long[] rotate(long n, long x, long y, long rx, long ry) {
    if (ry == 0) {
      if (rx == 1) {
        x = n - 1 - x;
        y = n - 1 - y;
      }
      long temp = x;
      x = y;
      y = temp;
    }
    return new long[]{x, y};
  }

  private DirectoryEntry findTile(List<DirectoryEntry> entries, long tileId) {
    int low = 0;
    int high = entries.size() - 1;

    while (low <= high) {
      int mid = (low + high) >>> 1;
      DirectoryEntry midEntry = entries.get(mid);

      if (tileId < midEntry.tileId) {
        high = mid - 1;
      } else if (tileId > midEntry.tileId) {
        low = mid + 1;
      } else {
        return midEntry; // Exact match
      }
    }

    if (high >= 0) {
      DirectoryEntry entry = entries.get(high);
      if (entry.runLength == 0 || tileId < entry.tileId + entry.runLength) {
        return entry; // tileId is within the range
      }
    }

    return null;
  }

}
