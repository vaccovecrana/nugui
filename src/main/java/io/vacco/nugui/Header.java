package io.vacco.nugui;

public class Header {
  public String magicNumber;
  public int version;
  public long rootDirectoryOffset;
  public long rootDirectoryLength;
  public long metadataOffset;
  public long metadataLength;
  public long leafDirectoriesOffset;
  public long leafDirectoriesLength;
  public long tileDataOffset;
  public long tileDataLength;
  public long numAddressedTiles;
  public long numTileEntries;
  public long numTileContents;
  public byte clustered;
  public byte internalCompression;
  public byte tileCompression;
  public byte tileType;
  public byte minZoom;
  public byte maxZoom;
  public long minPosition;
  public long maxPosition;
  public byte centerZoom;
  public long centerPosition;
}
