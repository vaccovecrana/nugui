package io.vacco.nugui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class NgIO {

  public static byte[] decompressGzip(byte[] compressedData) throws IOException {
    ByteArrayInputStream byteStream = new ByteArrayInputStream(compressedData);
    GZIPInputStream gzipStream = new GZIPInputStream(byteStream);
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    byte[] buffer = new byte[1024];
    int len;
    while ((len = gzipStream.read(buffer)) > 0) {
      outStream.write(buffer, 0, len);
    }

    return outStream.toByteArray();
  }

  public static long readUnsignedVarInt(InputStream inputStream) throws IOException {
    long value = 0;
    int shift = 0;
    while (true) {
      int b = inputStream.read();
      if (b == -1) {
        throw new IOException("Unexpected end of input");
      }
      value |= (long) (b & 0x7F) << shift;
      if ((b & 0x80) == 0) break;
      shift += 7;
      if (shift > 63) {
        throw new IllegalArgumentException("VarInt too long");
      }
    }
    return value;
  }

}
