package io.vacco.nugui;

public class DirectoryEntry {

  public long tileId;
  public long offset;
  public long length;
  public long runLength;

  @Override public String toString() {
    return String.format(
      "tile: %d, off: %d, len: %d, rLen: %d",
      tileId, offset, length, runLength
    );
  }
}
