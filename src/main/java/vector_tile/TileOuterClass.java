package vector_tile;

public final class TileOuterClass {
  private TileOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      TileOuterClass.class.getName());
  }
  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
      (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vector_tile.Tile)
    com.google.protobuf.GeneratedMessage.
      ExtendableMessageOrBuilder<Tile> {

    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    java.util.List<vector_tile.TileOuterClass.Tile.Layer>
    getLayersList();
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    vector_tile.TileOuterClass.Tile.Layer getLayers(int index);
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    int getLayersCount();
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    java.util.List<? extends vector_tile.TileOuterClass.Tile.LayerOrBuilder>
    getLayersOrBuilderList();
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    vector_tile.TileOuterClass.Tile.LayerOrBuilder getLayersOrBuilder(
      int index);
  }
  /**
   * Protobuf type {@code vector_tile.Tile}
   */
  public static final class Tile extends
    com.google.protobuf.GeneratedMessage.ExtendableMessage<Tile> implements
    // @@protoc_insertion_point(message_implements:vector_tile.Tile)
    TileOrBuilder {
    private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        Tile.class.getName());
    }
    // Use Tile.newBuilder() to construct.
    private Tile(com.google.protobuf.GeneratedMessage.ExtendableBuilder<vector_tile.TileOuterClass.Tile, ?> builder) {
      super(builder);
    }
    private Tile() {
      layers_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          vector_tile.TileOuterClass.Tile.class, vector_tile.TileOuterClass.Tile.Builder.class);
    }

    /**
     * <pre>
     * GeomType is described in section 4.3.4 of the specification
     * </pre>
     *
     * Protobuf enum {@code vector_tile.Tile.GeomType}
     */
    public enum GeomType
      implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>POINT = 1;</code>
       */
      POINT(1),
      /**
       * <code>LINESTRING = 2;</code>
       */
      LINESTRING(2),
      /**
       * <code>POLYGON = 3;</code>
       */
      POLYGON(3),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 28,
          /* patch= */ 1,
          /* suffix= */ "",
          GeomType.class.getName());
      }
      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>POINT = 1;</code>
       */
      public static final int POINT_VALUE = 1;
      /**
       * <code>LINESTRING = 2;</code>
       */
      public static final int LINESTRING_VALUE = 2;
      /**
       * <code>POLYGON = 3;</code>
       */
      public static final int POLYGON_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static GeomType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GeomType forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return POINT;
          case 2: return LINESTRING;
          case 3: return POLYGON;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GeomType>
      internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
        GeomType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GeomType>() {
          public GeomType findValueByNumber(int number) {
            return GeomType.forNumber(number);
          }
        };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
        return vector_tile.TileOuterClass.Tile.getDescriptor().getEnumTypes().get(0);
      }

      private static final GeomType[] VALUES = values();

      public static GeomType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private GeomType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:vector_tile.Tile.GeomType)
    }

    public interface ValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:vector_tile.Tile.Value)
      com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<Value> {

      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return Whether the stringValue field is set.
       */
      boolean hasStringValue();
      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return The stringValue.
       */
      java.lang.String getStringValue();
      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return The bytes for stringValue.
       */
      com.google.protobuf.ByteString
      getStringValueBytes();

      /**
       * <code>optional float float_value = 2;</code>
       * @return Whether the floatValue field is set.
       */
      boolean hasFloatValue();
      /**
       * <code>optional float float_value = 2;</code>
       * @return The floatValue.
       */
      float getFloatValue();

      /**
       * <code>optional double double_value = 3;</code>
       * @return Whether the doubleValue field is set.
       */
      boolean hasDoubleValue();
      /**
       * <code>optional double double_value = 3;</code>
       * @return The doubleValue.
       */
      double getDoubleValue();

      /**
       * <code>optional int64 int_value = 4;</code>
       * @return Whether the intValue field is set.
       */
      boolean hasIntValue();
      /**
       * <code>optional int64 int_value = 4;</code>
       * @return The intValue.
       */
      long getIntValue();

      /**
       * <code>optional uint64 uint_value = 5;</code>
       * @return Whether the uintValue field is set.
       */
      boolean hasUintValue();
      /**
       * <code>optional uint64 uint_value = 5;</code>
       * @return The uintValue.
       */
      long getUintValue();

      /**
       * <code>optional sint64 sint_value = 6;</code>
       * @return Whether the sintValue field is set.
       */
      boolean hasSintValue();
      /**
       * <code>optional sint64 sint_value = 6;</code>
       * @return The sintValue.
       */
      long getSintValue();

      /**
       * <code>optional bool bool_value = 7;</code>
       * @return Whether the boolValue field is set.
       */
      boolean hasBoolValue();
      /**
       * <code>optional bool bool_value = 7;</code>
       * @return The boolValue.
       */
      boolean getBoolValue();
    }
    /**
     * <pre>
     * Variant type encoding
     * The use of values is described in section 4.1 of the specification
     * </pre>
     *
     * Protobuf type {@code vector_tile.Tile.Value}
     */
    public static final class Value extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Value> implements
      // @@protoc_insertion_point(message_implements:vector_tile.Tile.Value)
      ValueOrBuilder {
      private static final long serialVersionUID = 0L;
      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 28,
          /* patch= */ 1,
          /* suffix= */ "",
          Value.class.getName());
      }
      // Use Value.newBuilder() to construct.
      private Value(com.google.protobuf.GeneratedMessage.ExtendableBuilder<vector_tile.TileOuterClass.Tile.Value, ?> builder) {
        super(builder);
      }
      private Value() {
        stringValue_ = "";
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Value_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            vector_tile.TileOuterClass.Tile.Value.class, vector_tile.TileOuterClass.Tile.Value.Builder.class);
      }

      private int bitField0_;
      public static final int STRING_VALUE_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private volatile java.lang.Object stringValue_ = "";
      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return Whether the stringValue field is set.
       */
      @java.lang.Override
      public boolean hasStringValue() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return The stringValue.
       */
      @java.lang.Override
      public java.lang.String getStringValue() {
        java.lang.Object ref = stringValue_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            stringValue_ = s;
          }
          return s;
        }
      }
      /**
       * <pre>
       * Exactly one of these values must be present in a valid message
       * </pre>
       *
       * <code>optional string string_value = 1;</code>
       * @return The bytes for stringValue.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
      getStringValueBytes() {
        java.lang.Object ref = stringValue_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          stringValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int FLOAT_VALUE_FIELD_NUMBER = 2;
      private float floatValue_ = 0F;
      /**
       * <code>optional float float_value = 2;</code>
       * @return Whether the floatValue field is set.
       */
      @java.lang.Override
      public boolean hasFloatValue() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional float float_value = 2;</code>
       * @return The floatValue.
       */
      @java.lang.Override
      public float getFloatValue() {
        return floatValue_;
      }

      public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
      private double doubleValue_ = 0D;
      /**
       * <code>optional double double_value = 3;</code>
       * @return Whether the doubleValue field is set.
       */
      @java.lang.Override
      public boolean hasDoubleValue() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional double double_value = 3;</code>
       * @return The doubleValue.
       */
      @java.lang.Override
      public double getDoubleValue() {
        return doubleValue_;
      }

      public static final int INT_VALUE_FIELD_NUMBER = 4;
      private long intValue_ = 0L;
      /**
       * <code>optional int64 int_value = 4;</code>
       * @return Whether the intValue field is set.
       */
      @java.lang.Override
      public boolean hasIntValue() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int64 int_value = 4;</code>
       * @return The intValue.
       */
      @java.lang.Override
      public long getIntValue() {
        return intValue_;
      }

      public static final int UINT_VALUE_FIELD_NUMBER = 5;
      private long uintValue_ = 0L;
      /**
       * <code>optional uint64 uint_value = 5;</code>
       * @return Whether the uintValue field is set.
       */
      @java.lang.Override
      public boolean hasUintValue() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional uint64 uint_value = 5;</code>
       * @return The uintValue.
       */
      @java.lang.Override
      public long getUintValue() {
        return uintValue_;
      }

      public static final int SINT_VALUE_FIELD_NUMBER = 6;
      private long sintValue_ = 0L;
      /**
       * <code>optional sint64 sint_value = 6;</code>
       * @return Whether the sintValue field is set.
       */
      @java.lang.Override
      public boolean hasSintValue() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional sint64 sint_value = 6;</code>
       * @return The sintValue.
       */
      @java.lang.Override
      public long getSintValue() {
        return sintValue_;
      }

      public static final int BOOL_VALUE_FIELD_NUMBER = 7;
      private boolean boolValue_ = false;
      /**
       * <code>optional bool bool_value = 7;</code>
       * @return Whether the boolValue field is set.
       */
      @java.lang.Override
      public boolean hasBoolValue() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional bool bool_value = 7;</code>
       * @return The boolValue.
       */
      @java.lang.Override
      public boolean getBoolValue() {
        return boolValue_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!extensionsAreInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        com.google.protobuf.GeneratedMessage
          .ExtendableMessage.ExtensionSerializer
          extensionWriter = newExtensionSerializer();
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessage.writeString(output, 1, stringValue_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeFloat(2, floatValue_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          output.writeDouble(3, doubleValue_);
        }
        if (((bitField0_ & 0x00000008) != 0)) {
          output.writeInt64(4, intValue_);
        }
        if (((bitField0_ & 0x00000010) != 0)) {
          output.writeUInt64(5, uintValue_);
        }
        if (((bitField0_ & 0x00000020) != 0)) {
          output.writeSInt64(6, sintValue_);
        }
        if (((bitField0_ & 0x00000040) != 0)) {
          output.writeBool(7, boolValue_);
        }
        extensionWriter.writeUntil(536870912, output);
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessage.computeStringSize(1, stringValue_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeFloatSize(2, floatValue_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeDoubleSize(3, doubleValue_);
        }
        if (((bitField0_ & 0x00000008) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(4, intValue_);
        }
        if (((bitField0_ & 0x00000010) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(5, uintValue_);
        }
        if (((bitField0_ & 0x00000020) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeSInt64Size(6, sintValue_);
        }
        if (((bitField0_ & 0x00000040) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBoolSize(7, boolValue_);
        }
        size += extensionsSerializedSize();
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
          return true;
        }
        if (!(obj instanceof vector_tile.TileOuterClass.Tile.Value)) {
          return super.equals(obj);
        }
        vector_tile.TileOuterClass.Tile.Value other = (vector_tile.TileOuterClass.Tile.Value) obj;

        if (hasStringValue() != other.hasStringValue()) return false;
        if (hasStringValue()) {
          if (!getStringValue()
            .equals(other.getStringValue())) return false;
        }
        if (hasFloatValue() != other.hasFloatValue()) return false;
        if (hasFloatValue()) {
          if (java.lang.Float.floatToIntBits(getFloatValue())
            != java.lang.Float.floatToIntBits(
            other.getFloatValue())) return false;
        }
        if (hasDoubleValue() != other.hasDoubleValue()) return false;
        if (hasDoubleValue()) {
          if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
            other.getDoubleValue())) return false;
        }
        if (hasIntValue() != other.hasIntValue()) return false;
        if (hasIntValue()) {
          if (getIntValue()
            != other.getIntValue()) return false;
        }
        if (hasUintValue() != other.hasUintValue()) return false;
        if (hasUintValue()) {
          if (getUintValue()
            != other.getUintValue()) return false;
        }
        if (hasSintValue() != other.hasSintValue()) return false;
        if (hasSintValue()) {
          if (getSintValue()
            != other.getSintValue()) return false;
        }
        if (hasBoolValue() != other.hasBoolValue()) return false;
        if (hasBoolValue()) {
          if (getBoolValue()
            != other.getBoolValue()) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        if (!getExtensionFields().equals(other.getExtensionFields()))
          return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasStringValue()) {
          hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + getStringValue().hashCode();
        }
        if (hasFloatValue()) {
          hash = (37 * hash) + FLOAT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFloatValue());
        }
        if (hasDoubleValue()) {
          hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        }
        if (hasIntValue()) {
          hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIntValue());
        }
        if (hasUintValue()) {
          hash = (37 * hash) + UINT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getUintValue());
        }
        if (hasSintValue()) {
          hash = (37 * hash) + SINT_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSintValue());
        }
        if (hasBoolValue()) {
          hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        }
        hash = hashFields(hash, getExtensionFields());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static vector_tile.TileOuterClass.Tile.Value parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
      }

      public static vector_tile.TileOuterClass.Tile.Value parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Value parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(vector_tile.TileOuterClass.Tile.Value prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Variant type encoding
       * The use of values is described in section 4.1 of the specification
       * </pre>
       *
       * Protobuf type {@code vector_tile.Tile.Value}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          vector_tile.TileOuterClass.Tile.Value, Builder> implements
        // @@protoc_insertion_point(builder_implements:vector_tile.Tile.Value)
        vector_tile.TileOuterClass.Tile.ValueOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Value_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Value_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              vector_tile.TileOuterClass.Tile.Value.class, vector_tile.TileOuterClass.Tile.Value.Builder.class);
        }

        // Construct using vector_tile.TileOuterClass.Tile.Value.newBuilder()
        private Builder() {

        }

        private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          stringValue_ = "";
          floatValue_ = 0F;
          doubleValue_ = 0D;
          intValue_ = 0L;
          uintValue_ = 0L;
          sintValue_ = 0L;
          boolValue_ = false;
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Value_descriptor;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Value getDefaultInstanceForType() {
          return vector_tile.TileOuterClass.Tile.Value.getDefaultInstance();
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Value build() {
          vector_tile.TileOuterClass.Tile.Value result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Value buildPartial() {
          vector_tile.TileOuterClass.Tile.Value result = new vector_tile.TileOuterClass.Tile.Value(this);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartial0(vector_tile.TileOuterClass.Tile.Value result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.stringValue_ = stringValue_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.floatValue_ = floatValue_;
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            result.doubleValue_ = doubleValue_;
            to_bitField0_ |= 0x00000004;
          }
          if (((from_bitField0_ & 0x00000008) != 0)) {
            result.intValue_ = intValue_;
            to_bitField0_ |= 0x00000008;
          }
          if (((from_bitField0_ & 0x00000010) != 0)) {
            result.uintValue_ = uintValue_;
            to_bitField0_ |= 0x00000010;
          }
          if (((from_bitField0_ & 0x00000020) != 0)) {
            result.sintValue_ = sintValue_;
            to_bitField0_ |= 0x00000020;
          }
          if (((from_bitField0_ & 0x00000040) != 0)) {
            result.boolValue_ = boolValue_;
            to_bitField0_ |= 0x00000040;
          }
          result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof vector_tile.TileOuterClass.Tile.Value) {
            return mergeFrom((vector_tile.TileOuterClass.Tile.Value)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(vector_tile.TileOuterClass.Tile.Value other) {
          if (other == vector_tile.TileOuterClass.Tile.Value.getDefaultInstance()) return this;
          if (other.hasStringValue()) {
            stringValue_ = other.stringValue_;
            bitField0_ |= 0x00000001;
            onChanged();
          }
          if (other.hasFloatValue()) {
            setFloatValue(other.getFloatValue());
          }
          if (other.hasDoubleValue()) {
            setDoubleValue(other.getDoubleValue());
          }
          if (other.hasIntValue()) {
            setIntValue(other.getIntValue());
          }
          if (other.hasUintValue()) {
            setUintValue(other.getUintValue());
          }
          if (other.hasSintValue()) {
            setSintValue(other.getSintValue());
          }
          if (other.hasBoolValue()) {
            setBoolValue(other.getBoolValue());
          }
          this.mergeExtensionFields(other);
          this.mergeUnknownFields(other.getUnknownFields());
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!extensionsAreInitialized()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  stringValue_ = input.readBytes();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 10
                case 21: {
                  floatValue_ = input.readFloat();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 21
                case 25: {
                  doubleValue_ = input.readDouble();
                  bitField0_ |= 0x00000004;
                  break;
                } // case 25
                case 32: {
                  intValue_ = input.readInt64();
                  bitField0_ |= 0x00000008;
                  break;
                } // case 32
                case 40: {
                  uintValue_ = input.readUInt64();
                  bitField0_ |= 0x00000010;
                  break;
                } // case 40
                case 48: {
                  sintValue_ = input.readSInt64();
                  bitField0_ |= 0x00000020;
                  break;
                } // case 48
                case 56: {
                  boolValue_ = input.readBool();
                  bitField0_ |= 0x00000040;
                  break;
                } // case 56
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private java.lang.Object stringValue_ = "";
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @return Whether the stringValue field is set.
         */
        public boolean hasStringValue() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @return The stringValue.
         */
        public java.lang.String getStringValue() {
          java.lang.Object ref = stringValue_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              stringValue_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @return The bytes for stringValue.
         */
        public com.google.protobuf.ByteString
        getStringValueBytes() {
          java.lang.Object ref = stringValue_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            stringValue_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @param value The stringValue to set.
         * @return This builder for chaining.
         */
        public Builder setStringValue(
          java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          stringValue_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearStringValue() {
          stringValue_ = getDefaultInstance().getStringValue();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Exactly one of these values must be present in a valid message
         * </pre>
         *
         * <code>optional string string_value = 1;</code>
         * @param value The bytes for stringValue to set.
         * @return This builder for chaining.
         */
        public Builder setStringValueBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          stringValue_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }

        private float floatValue_ ;
        /**
         * <code>optional float float_value = 2;</code>
         * @return Whether the floatValue field is set.
         */
        @java.lang.Override
        public boolean hasFloatValue() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional float float_value = 2;</code>
         * @return The floatValue.
         */
        @java.lang.Override
        public float getFloatValue() {
          return floatValue_;
        }
        /**
         * <code>optional float float_value = 2;</code>
         * @param value The floatValue to set.
         * @return This builder for chaining.
         */
        public Builder setFloatValue(float value) {

          floatValue_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <code>optional float float_value = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearFloatValue() {
          bitField0_ = (bitField0_ & ~0x00000002);
          floatValue_ = 0F;
          onChanged();
          return this;
        }

        private double doubleValue_ ;
        /**
         * <code>optional double double_value = 3;</code>
         * @return Whether the doubleValue field is set.
         */
        @java.lang.Override
        public boolean hasDoubleValue() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>optional double double_value = 3;</code>
         * @return The doubleValue.
         */
        @java.lang.Override
        public double getDoubleValue() {
          return doubleValue_;
        }
        /**
         * <code>optional double double_value = 3;</code>
         * @param value The doubleValue to set.
         * @return This builder for chaining.
         */
        public Builder setDoubleValue(double value) {

          doubleValue_ = value;
          bitField0_ |= 0x00000004;
          onChanged();
          return this;
        }
        /**
         * <code>optional double double_value = 3;</code>
         * @return This builder for chaining.
         */
        public Builder clearDoubleValue() {
          bitField0_ = (bitField0_ & ~0x00000004);
          doubleValue_ = 0D;
          onChanged();
          return this;
        }

        private long intValue_ ;
        /**
         * <code>optional int64 int_value = 4;</code>
         * @return Whether the intValue field is set.
         */
        @java.lang.Override
        public boolean hasIntValue() {
          return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <code>optional int64 int_value = 4;</code>
         * @return The intValue.
         */
        @java.lang.Override
        public long getIntValue() {
          return intValue_;
        }
        /**
         * <code>optional int64 int_value = 4;</code>
         * @param value The intValue to set.
         * @return This builder for chaining.
         */
        public Builder setIntValue(long value) {

          intValue_ = value;
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <code>optional int64 int_value = 4;</code>
         * @return This builder for chaining.
         */
        public Builder clearIntValue() {
          bitField0_ = (bitField0_ & ~0x00000008);
          intValue_ = 0L;
          onChanged();
          return this;
        }

        private long uintValue_ ;
        /**
         * <code>optional uint64 uint_value = 5;</code>
         * @return Whether the uintValue field is set.
         */
        @java.lang.Override
        public boolean hasUintValue() {
          return ((bitField0_ & 0x00000010) != 0);
        }
        /**
         * <code>optional uint64 uint_value = 5;</code>
         * @return The uintValue.
         */
        @java.lang.Override
        public long getUintValue() {
          return uintValue_;
        }
        /**
         * <code>optional uint64 uint_value = 5;</code>
         * @param value The uintValue to set.
         * @return This builder for chaining.
         */
        public Builder setUintValue(long value) {

          uintValue_ = value;
          bitField0_ |= 0x00000010;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint64 uint_value = 5;</code>
         * @return This builder for chaining.
         */
        public Builder clearUintValue() {
          bitField0_ = (bitField0_ & ~0x00000010);
          uintValue_ = 0L;
          onChanged();
          return this;
        }

        private long sintValue_ ;
        /**
         * <code>optional sint64 sint_value = 6;</code>
         * @return Whether the sintValue field is set.
         */
        @java.lang.Override
        public boolean hasSintValue() {
          return ((bitField0_ & 0x00000020) != 0);
        }
        /**
         * <code>optional sint64 sint_value = 6;</code>
         * @return The sintValue.
         */
        @java.lang.Override
        public long getSintValue() {
          return sintValue_;
        }
        /**
         * <code>optional sint64 sint_value = 6;</code>
         * @param value The sintValue to set.
         * @return This builder for chaining.
         */
        public Builder setSintValue(long value) {

          sintValue_ = value;
          bitField0_ |= 0x00000020;
          onChanged();
          return this;
        }
        /**
         * <code>optional sint64 sint_value = 6;</code>
         * @return This builder for chaining.
         */
        public Builder clearSintValue() {
          bitField0_ = (bitField0_ & ~0x00000020);
          sintValue_ = 0L;
          onChanged();
          return this;
        }

        private boolean boolValue_ ;
        /**
         * <code>optional bool bool_value = 7;</code>
         * @return Whether the boolValue field is set.
         */
        @java.lang.Override
        public boolean hasBoolValue() {
          return ((bitField0_ & 0x00000040) != 0);
        }
        /**
         * <code>optional bool bool_value = 7;</code>
         * @return The boolValue.
         */
        @java.lang.Override
        public boolean getBoolValue() {
          return boolValue_;
        }
        /**
         * <code>optional bool bool_value = 7;</code>
         * @param value The boolValue to set.
         * @return This builder for chaining.
         */
        public Builder setBoolValue(boolean value) {

          boolValue_ = value;
          bitField0_ |= 0x00000040;
          onChanged();
          return this;
        }
        /**
         * <code>optional bool bool_value = 7;</code>
         * @return This builder for chaining.
         */
        public Builder clearBoolValue() {
          bitField0_ = (bitField0_ & ~0x00000040);
          boolValue_ = false;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:vector_tile.Tile.Value)
      }

      // @@protoc_insertion_point(class_scope:vector_tile.Tile.Value)
      private static final vector_tile.TileOuterClass.Tile.Value DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new vector_tile.TileOuterClass.Tile.Value();
      }

      public static vector_tile.TileOuterClass.Tile.Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<Value>
        PARSER = new com.google.protobuf.AbstractParser<Value>() {
        @java.lang.Override
        public Value parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<Value> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Value> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface FeatureOrBuilder extends
      // @@protoc_insertion_point(interface_extends:vector_tile.Tile.Feature)
      com.google.protobuf.MessageOrBuilder {

      /**
       * <code>optional uint64 id = 1 [default = 0];</code>
       * @return Whether the id field is set.
       */
      boolean hasId();
      /**
       * <code>optional uint64 id = 1 [default = 0];</code>
       * @return The id.
       */
      long getId();

      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @return A list containing the tags.
       */
      java.util.List<java.lang.Integer> getTagsList();
      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @return The count of tags.
       */
      int getTagsCount();
      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The tags at the given index.
       */
      int getTags(int index);

      /**
       * <pre>
       * The type of geometry stored in this feature.
       * </pre>
       *
       * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
       * @return Whether the type field is set.
       */
      boolean hasType();
      /**
       * <pre>
       * The type of geometry stored in this feature.
       * </pre>
       *
       * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
       * @return The type.
       */
      vector_tile.TileOuterClass.Tile.GeomType getType();

      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @return A list containing the geometry.
       */
      java.util.List<java.lang.Integer> getGeometryList();
      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @return The count of geometry.
       */
      int getGeometryCount();
      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The geometry at the given index.
       */
      int getGeometry(int index);
    }
    /**
     * <pre>
     * Features are described in section 4.2 of the specification
     * </pre>
     *
     * Protobuf type {@code vector_tile.Tile.Feature}
     */
    public static final class Feature extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:vector_tile.Tile.Feature)
      FeatureOrBuilder {
      private static final long serialVersionUID = 0L;
      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 28,
          /* patch= */ 1,
          /* suffix= */ "",
          Feature.class.getName());
      }
      // Use Feature.newBuilder() to construct.
      private Feature(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
      }
      private Feature() {
        tags_ = emptyIntList();
        type_ = 0;
        geometry_ = emptyIntList();
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Feature_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            vector_tile.TileOuterClass.Tile.Feature.class, vector_tile.TileOuterClass.Tile.Feature.Builder.class);
      }

      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private long id_ = 0L;
      /**
       * <code>optional uint64 id = 1 [default = 0];</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint64 id = 1 [default = 0];</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }

      public static final int TAGS_FIELD_NUMBER = 2;
      @SuppressWarnings("serial")
      private com.google.protobuf.Internal.IntList tags_ =
        emptyIntList();
      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @return A list containing the tags.
       */
      @java.lang.Override
      public java.util.List<java.lang.Integer>
      getTagsList() {
        return tags_;
      }
      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @return The count of tags.
       */
      public int getTagsCount() {
        return tags_.size();
      }
      /**
       * <pre>
       * Tags of this feature are encoded as repeated pairs of
       * integers.
       * A detailed description of tags is located in sections
       * 4.2 and 4.4 of the specification
       * </pre>
       *
       * <code>repeated uint32 tags = 2 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The tags at the given index.
       */
      public int getTags(int index) {
        return tags_.getInt(index);
      }
      private int tagsMemoizedSerializedSize = -1;

      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_ = 0;
      /**
       * <pre>
       * The type of geometry stored in this feature.
       * </pre>
       *
       * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
       * @return Whether the type field is set.
       */
      @java.lang.Override public boolean hasType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The type of geometry stored in this feature.
       * </pre>
       *
       * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
       * @return The type.
       */
      @java.lang.Override public vector_tile.TileOuterClass.Tile.GeomType getType() {
        vector_tile.TileOuterClass.Tile.GeomType result = vector_tile.TileOuterClass.Tile.GeomType.forNumber(type_);
        return result == null ? vector_tile.TileOuterClass.Tile.GeomType.UNKNOWN : result;
      }

      public static final int GEOMETRY_FIELD_NUMBER = 4;
      @SuppressWarnings("serial")
      private com.google.protobuf.Internal.IntList geometry_ =
        emptyIntList();
      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @return A list containing the geometry.
       */
      @java.lang.Override
      public java.util.List<java.lang.Integer>
      getGeometryList() {
        return geometry_;
      }
      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @return The count of geometry.
       */
      public int getGeometryCount() {
        return geometry_.size();
      }
      /**
       * <pre>
       * Contains a stream of commands and parameters (vertices).
       * A detailed description on geometry encoding is located in
       * section 4.3 of the specification.
       * </pre>
       *
       * <code>repeated uint32 geometry = 4 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The geometry at the given index.
       */
      public int getGeometry(int index) {
        return geometry_.getInt(index);
      }
      private int geometryMemoizedSerializedSize = -1;

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeUInt64(1, id_);
        }
        if (getTagsList().size() > 0) {
          output.writeUInt32NoTag(18);
          output.writeUInt32NoTag(tagsMemoizedSerializedSize);
        }
        for (int i = 0; i < tags_.size(); i++) {
          output.writeUInt32NoTag(tags_.getInt(i));
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeEnum(3, type_);
        }
        if (getGeometryList().size() > 0) {
          output.writeUInt32NoTag(34);
          output.writeUInt32NoTag(geometryMemoizedSerializedSize);
        }
        for (int i = 0; i < geometry_.size(); i++) {
          output.writeUInt32NoTag(geometry_.getInt(i));
        }
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(1, id_);
        }
        {
          int dataSize = 0;
          for (int i = 0; i < tags_.size(); i++) {
            dataSize += com.google.protobuf.CodedOutputStream
              .computeUInt32SizeNoTag(tags_.getInt(i));
          }
          size += dataSize;
          if (!getTagsList().isEmpty()) {
            size += 1;
            size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
          }
          tagsMemoizedSerializedSize = dataSize;
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(3, type_);
        }
        {
          int dataSize = 0;
          for (int i = 0; i < geometry_.size(); i++) {
            dataSize += com.google.protobuf.CodedOutputStream
              .computeUInt32SizeNoTag(geometry_.getInt(i));
          }
          size += dataSize;
          if (!getGeometryList().isEmpty()) {
            size += 1;
            size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
          }
          geometryMemoizedSerializedSize = dataSize;
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
          return true;
        }
        if (!(obj instanceof vector_tile.TileOuterClass.Tile.Feature)) {
          return super.equals(obj);
        }
        vector_tile.TileOuterClass.Tile.Feature other = (vector_tile.TileOuterClass.Tile.Feature) obj;

        if (hasId() != other.hasId()) return false;
        if (hasId()) {
          if (getId()
            != other.getId()) return false;
        }
        if (!getTagsList()
          .equals(other.getTagsList())) return false;
        if (hasType() != other.hasType()) return false;
        if (hasType()) {
          if (type_ != other.type_) return false;
        }
        if (!getGeometryList()
          .equals(other.getGeometryList())) return false;
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasId()) {
          hash = (37 * hash) + ID_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getId());
        }
        if (getTagsCount() > 0) {
          hash = (37 * hash) + TAGS_FIELD_NUMBER;
          hash = (53 * hash) + getTagsList().hashCode();
        }
        if (hasType()) {
          hash = (37 * hash) + TYPE_FIELD_NUMBER;
          hash = (53 * hash) + type_;
        }
        if (getGeometryCount() > 0) {
          hash = (37 * hash) + GEOMETRY_FIELD_NUMBER;
          hash = (53 * hash) + getGeometryList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static vector_tile.TileOuterClass.Tile.Feature parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
      }

      public static vector_tile.TileOuterClass.Tile.Feature parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Feature parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(vector_tile.TileOuterClass.Tile.Feature prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Features are described in section 4.2 of the specification
       * </pre>
       *
       * Protobuf type {@code vector_tile.Tile.Feature}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:vector_tile.Tile.Feature)
        vector_tile.TileOuterClass.Tile.FeatureOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Feature_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Feature_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              vector_tile.TileOuterClass.Tile.Feature.class, vector_tile.TileOuterClass.Tile.Feature.Builder.class);
        }

        // Construct using vector_tile.TileOuterClass.Tile.Feature.newBuilder()
        private Builder() {

        }

        private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          id_ = 0L;
          tags_ = emptyIntList();
          type_ = 0;
          geometry_ = emptyIntList();
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Feature_descriptor;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Feature getDefaultInstanceForType() {
          return vector_tile.TileOuterClass.Tile.Feature.getDefaultInstance();
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Feature build() {
          vector_tile.TileOuterClass.Tile.Feature result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Feature buildPartial() {
          vector_tile.TileOuterClass.Tile.Feature result = new vector_tile.TileOuterClass.Tile.Feature(this);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartial0(vector_tile.TileOuterClass.Tile.Feature result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.id_ = id_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            tags_.makeImmutable();
            result.tags_ = tags_;
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            result.type_ = type_;
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000008) != 0)) {
            geometry_.makeImmutable();
            result.geometry_ = geometry_;
          }
          result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof vector_tile.TileOuterClass.Tile.Feature) {
            return mergeFrom((vector_tile.TileOuterClass.Tile.Feature)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(vector_tile.TileOuterClass.Tile.Feature other) {
          if (other == vector_tile.TileOuterClass.Tile.Feature.getDefaultInstance()) return this;
          if (other.hasId()) {
            setId(other.getId());
          }
          if (!other.tags_.isEmpty()) {
            if (tags_.isEmpty()) {
              tags_ = other.tags_;
              tags_.makeImmutable();
              bitField0_ |= 0x00000002;
            } else {
              ensureTagsIsMutable();
              tags_.addAll(other.tags_);
            }
            onChanged();
          }
          if (other.hasType()) {
            setType(other.getType());
          }
          if (!other.geometry_.isEmpty()) {
            if (geometry_.isEmpty()) {
              geometry_ = other.geometry_;
              geometry_.makeImmutable();
              bitField0_ |= 0x00000008;
            } else {
              ensureGeometryIsMutable();
              geometry_.addAll(other.geometry_);
            }
            onChanged();
          }
          this.mergeUnknownFields(other.getUnknownFields());
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 8: {
                  id_ = input.readUInt64();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 8
                case 16: {
                  int v = input.readUInt32();
                  ensureTagsIsMutable();
                  tags_.addInt(v);
                  break;
                } // case 16
                case 18: {
                  int length = input.readRawVarint32();
                  int limit = input.pushLimit(length);
                  ensureTagsIsMutable();
                  while (input.getBytesUntilLimit() > 0) {
                    tags_.addInt(input.readUInt32());
                  }
                  input.popLimit(limit);
                  break;
                } // case 18
                case 24: {
                  int tmpRaw = input.readEnum();
                  vector_tile.TileOuterClass.Tile.GeomType tmpValue =
                    vector_tile.TileOuterClass.Tile.GeomType.forNumber(tmpRaw);
                  if (tmpValue == null) {
                    mergeUnknownVarintField(3, tmpRaw);
                  } else {
                    type_ = tmpRaw;
                    bitField0_ |= 0x00000004;
                  }
                  break;
                } // case 24
                case 32: {
                  int v = input.readUInt32();
                  ensureGeometryIsMutable();
                  geometry_.addInt(v);
                  break;
                } // case 32
                case 34: {
                  int length = input.readRawVarint32();
                  int limit = input.pushLimit(length);
                  ensureGeometryIsMutable();
                  while (input.getBytesUntilLimit() > 0) {
                    geometry_.addInt(input.readUInt32());
                  }
                  input.popLimit(limit);
                  break;
                } // case 34
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private long id_ ;
        /**
         * <code>optional uint64 id = 1 [default = 0];</code>
         * @return Whether the id field is set.
         */
        @java.lang.Override
        public boolean hasId() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>optional uint64 id = 1 [default = 0];</code>
         * @return The id.
         */
        @java.lang.Override
        public long getId() {
          return id_;
        }
        /**
         * <code>optional uint64 id = 1 [default = 0];</code>
         * @param value The id to set.
         * @return This builder for chaining.
         */
        public Builder setId(long value) {

          id_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <code>optional uint64 id = 1 [default = 0];</code>
         * @return This builder for chaining.
         */
        public Builder clearId() {
          bitField0_ = (bitField0_ & ~0x00000001);
          id_ = 0L;
          onChanged();
          return this;
        }

        private com.google.protobuf.Internal.IntList tags_ = emptyIntList();
        private void ensureTagsIsMutable() {
          if (!tags_.isModifiable()) {
            tags_ = makeMutableCopy(tags_);
          }
          bitField0_ |= 0x00000002;
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @return A list containing the tags.
         */
        public java.util.List<java.lang.Integer>
        getTagsList() {
          tags_.makeImmutable();
          return tags_;
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @return The count of tags.
         */
        public int getTagsCount() {
          return tags_.size();
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @param index The index of the element to return.
         * @return The tags at the given index.
         */
        public int getTags(int index) {
          return tags_.getInt(index);
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @param index The index to set the value at.
         * @param value The tags to set.
         * @return This builder for chaining.
         */
        public Builder setTags(
          int index, int value) {

          ensureTagsIsMutable();
          tags_.setInt(index, value);
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @param value The tags to add.
         * @return This builder for chaining.
         */
        public Builder addTags(int value) {

          ensureTagsIsMutable();
          tags_.addInt(value);
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @param values The tags to add.
         * @return This builder for chaining.
         */
        public Builder addAllTags(
          java.lang.Iterable<? extends java.lang.Integer> values) {
          ensureTagsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tags_);
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Tags of this feature are encoded as repeated pairs of
         * integers.
         * A detailed description of tags is located in sections
         * 4.2 and 4.4 of the specification
         * </pre>
         *
         * <code>repeated uint32 tags = 2 [packed = true];</code>
         * @return This builder for chaining.
         */
        public Builder clearTags() {
          tags_ = emptyIntList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
          return this;
        }

        private int type_ = 0;
        /**
         * <pre>
         * The type of geometry stored in this feature.
         * </pre>
         *
         * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
         * @return Whether the type field is set.
         */
        @java.lang.Override public boolean hasType() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <pre>
         * The type of geometry stored in this feature.
         * </pre>
         *
         * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
         * @return The type.
         */
        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.GeomType getType() {
          vector_tile.TileOuterClass.Tile.GeomType result = vector_tile.TileOuterClass.Tile.GeomType.forNumber(type_);
          return result == null ? vector_tile.TileOuterClass.Tile.GeomType.UNKNOWN : result;
        }
        /**
         * <pre>
         * The type of geometry stored in this feature.
         * </pre>
         *
         * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
         * @param value The type to set.
         * @return This builder for chaining.
         */
        public Builder setType(vector_tile.TileOuterClass.Tile.GeomType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000004;
          type_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * The type of geometry stored in this feature.
         * </pre>
         *
         * <code>optional .vector_tile.Tile.GeomType type = 3 [default = UNKNOWN];</code>
         * @return This builder for chaining.
         */
        public Builder clearType() {
          bitField0_ = (bitField0_ & ~0x00000004);
          type_ = 0;
          onChanged();
          return this;
        }

        private com.google.protobuf.Internal.IntList geometry_ = emptyIntList();
        private void ensureGeometryIsMutable() {
          if (!geometry_.isModifiable()) {
            geometry_ = makeMutableCopy(geometry_);
          }
          bitField0_ |= 0x00000008;
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @return A list containing the geometry.
         */
        public java.util.List<java.lang.Integer>
        getGeometryList() {
          geometry_.makeImmutable();
          return geometry_;
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @return The count of geometry.
         */
        public int getGeometryCount() {
          return geometry_.size();
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @param index The index of the element to return.
         * @return The geometry at the given index.
         */
        public int getGeometry(int index) {
          return geometry_.getInt(index);
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @param index The index to set the value at.
         * @param value The geometry to set.
         * @return This builder for chaining.
         */
        public Builder setGeometry(
          int index, int value) {

          ensureGeometryIsMutable();
          geometry_.setInt(index, value);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @param value The geometry to add.
         * @return This builder for chaining.
         */
        public Builder addGeometry(int value) {

          ensureGeometryIsMutable();
          geometry_.addInt(value);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @param values The geometry to add.
         * @return This builder for chaining.
         */
        public Builder addAllGeometry(
          java.lang.Iterable<? extends java.lang.Integer> values) {
          ensureGeometryIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, geometry_);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Contains a stream of commands and parameters (vertices).
         * A detailed description on geometry encoding is located in
         * section 4.3 of the specification.
         * </pre>
         *
         * <code>repeated uint32 geometry = 4 [packed = true];</code>
         * @return This builder for chaining.
         */
        public Builder clearGeometry() {
          geometry_ = emptyIntList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:vector_tile.Tile.Feature)
      }

      // @@protoc_insertion_point(class_scope:vector_tile.Tile.Feature)
      private static final vector_tile.TileOuterClass.Tile.Feature DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new vector_tile.TileOuterClass.Tile.Feature();
      }

      public static vector_tile.TileOuterClass.Tile.Feature getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<Feature>
        PARSER = new com.google.protobuf.AbstractParser<Feature>() {
        @java.lang.Override
        public Feature parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<Feature> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Feature> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.Feature getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface LayerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:vector_tile.Tile.Layer)
      com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<Layer> {

      /**
       * <pre>
       * Any compliant implementation must first read the version
       * number encoded in this message and choose the correct
       * implementation for this version number before proceeding to
       * decode other parts of this message.
       * </pre>
       *
       * <code>required uint32 version = 15 [default = 1];</code>
       * @return Whether the version field is set.
       */
      boolean hasVersion();
      /**
       * <pre>
       * Any compliant implementation must first read the version
       * number encoded in this message and choose the correct
       * implementation for this version number before proceeding to
       * decode other parts of this message.
       * </pre>
       *
       * <code>required uint32 version = 15 [default = 1];</code>
       * @return The version.
       */
      int getVersion();

      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      boolean hasName();
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      java.lang.String getName();
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      com.google.protobuf.ByteString
      getNameBytes();

      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      java.util.List<vector_tile.TileOuterClass.Tile.Feature>
      getFeaturesList();
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      vector_tile.TileOuterClass.Tile.Feature getFeatures(int index);
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      int getFeaturesCount();
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      java.util.List<? extends vector_tile.TileOuterClass.Tile.FeatureOrBuilder>
      getFeaturesOrBuilderList();
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      vector_tile.TileOuterClass.Tile.FeatureOrBuilder getFeaturesOrBuilder(
        int index);

      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @return A list containing the keys.
       */
      java.util.List<java.lang.String>
      getKeysList();
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @return The count of keys.
       */
      int getKeysCount();
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @param index The index of the element to return.
       * @return The keys at the given index.
       */
      java.lang.String getKeys(int index);
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @param index The index of the value to return.
       * @return The bytes of the keys at the given index.
       */
      com.google.protobuf.ByteString
      getKeysBytes(int index);

      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      java.util.List<vector_tile.TileOuterClass.Tile.Value>
      getValuesList();
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      vector_tile.TileOuterClass.Tile.Value getValues(int index);
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      int getValuesCount();
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      java.util.List<? extends vector_tile.TileOuterClass.Tile.ValueOrBuilder>
      getValuesOrBuilderList();
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      vector_tile.TileOuterClass.Tile.ValueOrBuilder getValuesOrBuilder(
        int index);

      /**
       * <pre>
       * Although this is an "optional" field it is required by the specification.
       * See https://github.com/mapbox/vector-tile-spec/issues/47
       * </pre>
       *
       * <code>optional uint32 extent = 5 [default = 4096];</code>
       * @return Whether the extent field is set.
       */
      boolean hasExtent();
      /**
       * <pre>
       * Although this is an "optional" field it is required by the specification.
       * See https://github.com/mapbox/vector-tile-spec/issues/47
       * </pre>
       *
       * <code>optional uint32 extent = 5 [default = 4096];</code>
       * @return The extent.
       */
      int getExtent();
    }
    /**
     * <pre>
     * Layers are described in section 4.1 of the specification
     * </pre>
     *
     * Protobuf type {@code vector_tile.Tile.Layer}
     */
    public static final class Layer extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Layer> implements
      // @@protoc_insertion_point(message_implements:vector_tile.Tile.Layer)
      LayerOrBuilder {
      private static final long serialVersionUID = 0L;
      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 28,
          /* patch= */ 1,
          /* suffix= */ "",
          Layer.class.getName());
      }
      // Use Layer.newBuilder() to construct.
      private Layer(com.google.protobuf.GeneratedMessage.ExtendableBuilder<vector_tile.TileOuterClass.Tile.Layer, ?> builder) {
        super(builder);
      }
      private Layer() {
        version_ = 1;
        name_ = "";
        features_ = java.util.Collections.emptyList();
        keys_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        values_ = java.util.Collections.emptyList();
        extent_ = 4096;
      }

      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Layer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Layer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            vector_tile.TileOuterClass.Tile.Layer.class, vector_tile.TileOuterClass.Tile.Layer.Builder.class);
      }

      private int bitField0_;
      public static final int VERSION_FIELD_NUMBER = 15;
      private int version_ = 1;
      /**
       * <pre>
       * Any compliant implementation must first read the version
       * number encoded in this message and choose the correct
       * implementation for this version number before proceeding to
       * decode other parts of this message.
       * </pre>
       *
       * <code>required uint32 version = 15 [default = 1];</code>
       * @return Whether the version field is set.
       */
      @java.lang.Override
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Any compliant implementation must first read the version
       * number encoded in this message and choose the correct
       * implementation for this version number before proceeding to
       * decode other parts of this message.
       * </pre>
       *
       * <code>required uint32 version = 15 [default = 1];</code>
       * @return The version.
       */
      @java.lang.Override
      public int getVersion() {
        return version_;
      }

      public static final int NAME_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private volatile java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      @java.lang.Override
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
      getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int FEATURES_FIELD_NUMBER = 2;
      @SuppressWarnings("serial")
      private java.util.List<vector_tile.TileOuterClass.Tile.Feature> features_;
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      @java.lang.Override
      public java.util.List<vector_tile.TileOuterClass.Tile.Feature> getFeaturesList() {
        return features_;
      }
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      @java.lang.Override
      public java.util.List<? extends vector_tile.TileOuterClass.Tile.FeatureOrBuilder>
      getFeaturesOrBuilderList() {
        return features_;
      }
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      @java.lang.Override
      public int getFeaturesCount() {
        return features_.size();
      }
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.Feature getFeatures(int index) {
        return features_.get(index);
      }
      /**
       * <pre>
       * The actual features in this tile.
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
       */
      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.FeatureOrBuilder getFeaturesOrBuilder(
        int index) {
        return features_.get(index);
      }

      public static final int KEYS_FIELD_NUMBER = 3;
      @SuppressWarnings("serial")
      private com.google.protobuf.LazyStringArrayList keys_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @return A list containing the keys.
       */
      public com.google.protobuf.ProtocolStringList
      getKeysList() {
        return keys_;
      }
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @return The count of keys.
       */
      public int getKeysCount() {
        return keys_.size();
      }
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @param index The index of the element to return.
       * @return The keys at the given index.
       */
      public java.lang.String getKeys(int index) {
        return keys_.get(index);
      }
      /**
       * <pre>
       * Dictionary encoding for keys
       * </pre>
       *
       * <code>repeated string keys = 3;</code>
       * @param index The index of the value to return.
       * @return The bytes of the keys at the given index.
       */
      public com.google.protobuf.ByteString
      getKeysBytes(int index) {
        return keys_.getByteString(index);
      }

      public static final int VALUES_FIELD_NUMBER = 4;
      @SuppressWarnings("serial")
      private java.util.List<vector_tile.TileOuterClass.Tile.Value> values_;
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      @java.lang.Override
      public java.util.List<vector_tile.TileOuterClass.Tile.Value> getValuesList() {
        return values_;
      }
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      @java.lang.Override
      public java.util.List<? extends vector_tile.TileOuterClass.Tile.ValueOrBuilder>
      getValuesOrBuilderList() {
        return values_;
      }
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      @java.lang.Override
      public int getValuesCount() {
        return values_.size();
      }
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.Value getValues(int index) {
        return values_.get(index);
      }
      /**
       * <pre>
       * Dictionary encoding for values
       * </pre>
       *
       * <code>repeated .vector_tile.Tile.Value values = 4;</code>
       */
      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.ValueOrBuilder getValuesOrBuilder(
        int index) {
        return values_.get(index);
      }

      public static final int EXTENT_FIELD_NUMBER = 5;
      private int extent_ = 4096;
      /**
       * <pre>
       * Although this is an "optional" field it is required by the specification.
       * See https://github.com/mapbox/vector-tile-spec/issues/47
       * </pre>
       *
       * <code>optional uint32 extent = 5 [default = 4096];</code>
       * @return Whether the extent field is set.
       */
      @java.lang.Override
      public boolean hasExtent() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Although this is an "optional" field it is required by the specification.
       * See https://github.com/mapbox/vector-tile-spec/issues/47
       * </pre>
       *
       * <code>optional uint32 extent = 5 [default = 4096];</code>
       * @return The extent.
       */
      @java.lang.Override
      public int getExtent() {
        return extent_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasVersion()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasName()) {
          memoizedIsInitialized = 0;
          return false;
        }
        for (int i = 0; i < getValuesCount(); i++) {
          if (!getValues(i).isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
        }
        if (!extensionsAreInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        com.google.protobuf.GeneratedMessage
          .ExtendableMessage.ExtensionSerializer
          extensionWriter = newExtensionSerializer();
        if (((bitField0_ & 0x00000002) != 0)) {
          com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
        }
        for (int i = 0; i < features_.size(); i++) {
          output.writeMessage(2, features_.get(i));
        }
        for (int i = 0; i < keys_.size(); i++) {
          com.google.protobuf.GeneratedMessage.writeString(output, 3, keys_.getRaw(i));
        }
        for (int i = 0; i < values_.size(); i++) {
          output.writeMessage(4, values_.get(i));
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          output.writeUInt32(5, extent_);
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeUInt32(15, version_);
        }
        extensionWriter.writeUntil(536870912, output);
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
        }
        for (int i = 0; i < features_.size(); i++) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, features_.get(i));
        }
        {
          int dataSize = 0;
          for (int i = 0; i < keys_.size(); i++) {
            dataSize += computeStringSizeNoTag(keys_.getRaw(i));
          }
          size += dataSize;
          size += 1 * getKeysList().size();
        }
        for (int i = 0; i < values_.size(); i++) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, values_.get(i));
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(5, extent_);
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(15, version_);
        }
        size += extensionsSerializedSize();
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
          return true;
        }
        if (!(obj instanceof vector_tile.TileOuterClass.Tile.Layer)) {
          return super.equals(obj);
        }
        vector_tile.TileOuterClass.Tile.Layer other = (vector_tile.TileOuterClass.Tile.Layer) obj;

        if (hasVersion() != other.hasVersion()) return false;
        if (hasVersion()) {
          if (getVersion()
            != other.getVersion()) return false;
        }
        if (hasName() != other.hasName()) return false;
        if (hasName()) {
          if (!getName()
            .equals(other.getName())) return false;
        }
        if (!getFeaturesList()
          .equals(other.getFeaturesList())) return false;
        if (!getKeysList()
          .equals(other.getKeysList())) return false;
        if (!getValuesList()
          .equals(other.getValuesList())) return false;
        if (hasExtent() != other.hasExtent()) return false;
        if (hasExtent()) {
          if (getExtent()
            != other.getExtent()) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        if (!getExtensionFields().equals(other.getExtensionFields()))
          return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasVersion()) {
          hash = (37 * hash) + VERSION_FIELD_NUMBER;
          hash = (53 * hash) + getVersion();
        }
        if (hasName()) {
          hash = (37 * hash) + NAME_FIELD_NUMBER;
          hash = (53 * hash) + getName().hashCode();
        }
        if (getFeaturesCount() > 0) {
          hash = (37 * hash) + FEATURES_FIELD_NUMBER;
          hash = (53 * hash) + getFeaturesList().hashCode();
        }
        if (getKeysCount() > 0) {
          hash = (37 * hash) + KEYS_FIELD_NUMBER;
          hash = (53 * hash) + getKeysList().hashCode();
        }
        if (getValuesCount() > 0) {
          hash = (37 * hash) + VALUES_FIELD_NUMBER;
          hash = (53 * hash) + getValuesList().hashCode();
        }
        if (hasExtent()) {
          hash = (37 * hash) + EXTENT_FIELD_NUMBER;
          hash = (53 * hash) + getExtent();
        }
        hash = hashFields(hash, getExtensionFields());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static vector_tile.TileOuterClass.Tile.Layer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
      }

      public static vector_tile.TileOuterClass.Tile.Layer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
      }
      public static vector_tile.TileOuterClass.Tile.Layer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(vector_tile.TileOuterClass.Tile.Layer prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Layers are described in section 4.1 of the specification
       * </pre>
       *
       * Protobuf type {@code vector_tile.Tile.Layer}
       */
      public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          vector_tile.TileOuterClass.Tile.Layer, Builder> implements
        // @@protoc_insertion_point(builder_implements:vector_tile.Tile.Layer)
        vector_tile.TileOuterClass.Tile.LayerOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Layer_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Layer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              vector_tile.TileOuterClass.Tile.Layer.class, vector_tile.TileOuterClass.Tile.Layer.Builder.class);
        }

        // Construct using vector_tile.TileOuterClass.Tile.Layer.newBuilder()
        private Builder() {

        }

        private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          version_ = 1;
          name_ = "";
          if (featuresBuilder_ == null) {
            features_ = java.util.Collections.emptyList();
          } else {
            features_ = null;
            featuresBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          keys_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
          if (valuesBuilder_ == null) {
            values_ = java.util.Collections.emptyList();
          } else {
            values_ = null;
            valuesBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000010);
          extent_ = 4096;
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
          return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_Layer_descriptor;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Layer getDefaultInstanceForType() {
          return vector_tile.TileOuterClass.Tile.Layer.getDefaultInstance();
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Layer build() {
          vector_tile.TileOuterClass.Tile.Layer result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public vector_tile.TileOuterClass.Tile.Layer buildPartial() {
          vector_tile.TileOuterClass.Tile.Layer result = new vector_tile.TileOuterClass.Tile.Layer(this);
          buildPartialRepeatedFields(result);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartialRepeatedFields(vector_tile.TileOuterClass.Tile.Layer result) {
          if (featuresBuilder_ == null) {
            if (((bitField0_ & 0x00000004) != 0)) {
              features_ = java.util.Collections.unmodifiableList(features_);
              bitField0_ = (bitField0_ & ~0x00000004);
            }
            result.features_ = features_;
          } else {
            result.features_ = featuresBuilder_.build();
          }
          if (valuesBuilder_ == null) {
            if (((bitField0_ & 0x00000010) != 0)) {
              values_ = java.util.Collections.unmodifiableList(values_);
              bitField0_ = (bitField0_ & ~0x00000010);
            }
            result.values_ = values_;
          } else {
            result.values_ = valuesBuilder_.build();
          }
        }

        private void buildPartial0(vector_tile.TileOuterClass.Tile.Layer result) {
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.version_ = version_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.name_ = name_;
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000008) != 0)) {
            keys_.makeImmutable();
            result.keys_ = keys_;
          }
          if (((from_bitField0_ & 0x00000020) != 0)) {
            result.extent_ = extent_;
            to_bitField0_ |= 0x00000004;
          }
          result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof vector_tile.TileOuterClass.Tile.Layer) {
            return mergeFrom((vector_tile.TileOuterClass.Tile.Layer)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(vector_tile.TileOuterClass.Tile.Layer other) {
          if (other == vector_tile.TileOuterClass.Tile.Layer.getDefaultInstance()) return this;
          if (other.hasVersion()) {
            setVersion(other.getVersion());
          }
          if (other.hasName()) {
            name_ = other.name_;
            bitField0_ |= 0x00000002;
            onChanged();
          }
          if (featuresBuilder_ == null) {
            if (!other.features_.isEmpty()) {
              if (features_.isEmpty()) {
                features_ = other.features_;
                bitField0_ = (bitField0_ & ~0x00000004);
              } else {
                ensureFeaturesIsMutable();
                features_.addAll(other.features_);
              }
              onChanged();
            }
          } else {
            if (!other.features_.isEmpty()) {
              if (featuresBuilder_.isEmpty()) {
                featuresBuilder_.dispose();
                featuresBuilder_ = null;
                features_ = other.features_;
                bitField0_ = (bitField0_ & ~0x00000004);
                featuresBuilder_ =
                  com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                    getFeaturesFieldBuilder() : null;
              } else {
                featuresBuilder_.addAllMessages(other.features_);
              }
            }
          }
          if (!other.keys_.isEmpty()) {
            if (keys_.isEmpty()) {
              keys_ = other.keys_;
              bitField0_ |= 0x00000008;
            } else {
              ensureKeysIsMutable();
              keys_.addAll(other.keys_);
            }
            onChanged();
          }
          if (valuesBuilder_ == null) {
            if (!other.values_.isEmpty()) {
              if (values_.isEmpty()) {
                values_ = other.values_;
                bitField0_ = (bitField0_ & ~0x00000010);
              } else {
                ensureValuesIsMutable();
                values_.addAll(other.values_);
              }
              onChanged();
            }
          } else {
            if (!other.values_.isEmpty()) {
              if (valuesBuilder_.isEmpty()) {
                valuesBuilder_.dispose();
                valuesBuilder_ = null;
                values_ = other.values_;
                bitField0_ = (bitField0_ & ~0x00000010);
                valuesBuilder_ =
                  com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                    getValuesFieldBuilder() : null;
              } else {
                valuesBuilder_.addAllMessages(other.values_);
              }
            }
          }
          if (other.hasExtent()) {
            setExtent(other.getExtent());
          }
          this.mergeExtensionFields(other);
          this.mergeUnknownFields(other.getUnknownFields());
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasVersion()) {
            return false;
          }
          if (!hasName()) {
            return false;
          }
          for (int i = 0; i < getValuesCount(); i++) {
            if (!getValues(i).isInitialized()) {
              return false;
            }
          }
          if (!extensionsAreInitialized()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  name_ = input.readBytes();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 10
                case 18: {
                  vector_tile.TileOuterClass.Tile.Feature m =
                    input.readMessage(
                      vector_tile.TileOuterClass.Tile.Feature.parser(),
                      extensionRegistry);
                  if (featuresBuilder_ == null) {
                    ensureFeaturesIsMutable();
                    features_.add(m);
                  } else {
                    featuresBuilder_.addMessage(m);
                  }
                  break;
                } // case 18
                case 26: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  ensureKeysIsMutable();
                  keys_.add(bs);
                  break;
                } // case 26
                case 34: {
                  vector_tile.TileOuterClass.Tile.Value m =
                    input.readMessage(
                      vector_tile.TileOuterClass.Tile.Value.parser(),
                      extensionRegistry);
                  if (valuesBuilder_ == null) {
                    ensureValuesIsMutable();
                    values_.add(m);
                  } else {
                    valuesBuilder_.addMessage(m);
                  }
                  break;
                } // case 34
                case 40: {
                  extent_ = input.readUInt32();
                  bitField0_ |= 0x00000020;
                  break;
                } // case 40
                case 120: {
                  version_ = input.readUInt32();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 120
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private int version_ = 1;
        /**
         * <pre>
         * Any compliant implementation must first read the version
         * number encoded in this message and choose the correct
         * implementation for this version number before proceeding to
         * decode other parts of this message.
         * </pre>
         *
         * <code>required uint32 version = 15 [default = 1];</code>
         * @return Whether the version field is set.
         */
        @java.lang.Override
        public boolean hasVersion() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Any compliant implementation must first read the version
         * number encoded in this message and choose the correct
         * implementation for this version number before proceeding to
         * decode other parts of this message.
         * </pre>
         *
         * <code>required uint32 version = 15 [default = 1];</code>
         * @return The version.
         */
        @java.lang.Override
        public int getVersion() {
          return version_;
        }
        /**
         * <pre>
         * Any compliant implementation must first read the version
         * number encoded in this message and choose the correct
         * implementation for this version number before proceeding to
         * decode other parts of this message.
         * </pre>
         *
         * <code>required uint32 version = 15 [default = 1];</code>
         * @param value The version to set.
         * @return This builder for chaining.
         */
        public Builder setVersion(int value) {

          version_ = value;
          bitField0_ |= 0x00000001;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Any compliant implementation must first read the version
         * number encoded in this message and choose the correct
         * implementation for this version number before proceeding to
         * decode other parts of this message.
         * </pre>
         *
         * <code>required uint32 version = 15 [default = 1];</code>
         * @return This builder for chaining.
         */
        public Builder clearVersion() {
          bitField0_ = (bitField0_ & ~0x00000001);
          version_ = 1;
          onChanged();
          return this;
        }

        private java.lang.Object name_ = "";
        /**
         * <code>required string name = 1;</code>
         * @return Whether the name field is set.
         */
        public boolean hasName() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>required string name = 1;</code>
         * @return The name.
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              name_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string name = 1;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
          java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {
          name_ = getDefaultInstance().getName();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
          return this;
        }
        /**
         * <code>required string name = 1;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          name_ = value;
          bitField0_ |= 0x00000002;
          onChanged();
          return this;
        }

        private java.util.List<vector_tile.TileOuterClass.Tile.Feature> features_ =
          java.util.Collections.emptyList();
        private void ensureFeaturesIsMutable() {
          if (!((bitField0_ & 0x00000004) != 0)) {
            features_ = new java.util.ArrayList<vector_tile.TileOuterClass.Tile.Feature>(features_);
            bitField0_ |= 0x00000004;
          }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
          vector_tile.TileOuterClass.Tile.Feature, vector_tile.TileOuterClass.Tile.Feature.Builder, vector_tile.TileOuterClass.Tile.FeatureOrBuilder> featuresBuilder_;

        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public java.util.List<vector_tile.TileOuterClass.Tile.Feature> getFeaturesList() {
          if (featuresBuilder_ == null) {
            return java.util.Collections.unmodifiableList(features_);
          } else {
            return featuresBuilder_.getMessageList();
          }
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public int getFeaturesCount() {
          if (featuresBuilder_ == null) {
            return features_.size();
          } else {
            return featuresBuilder_.getCount();
          }
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public vector_tile.TileOuterClass.Tile.Feature getFeatures(int index) {
          if (featuresBuilder_ == null) {
            return features_.get(index);
          } else {
            return featuresBuilder_.getMessage(index);
          }
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder setFeatures(
          int index, vector_tile.TileOuterClass.Tile.Feature value) {
          if (featuresBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFeaturesIsMutable();
            features_.set(index, value);
            onChanged();
          } else {
            featuresBuilder_.setMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder setFeatures(
          int index, vector_tile.TileOuterClass.Tile.Feature.Builder builderForValue) {
          if (featuresBuilder_ == null) {
            ensureFeaturesIsMutable();
            features_.set(index, builderForValue.build());
            onChanged();
          } else {
            featuresBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder addFeatures(vector_tile.TileOuterClass.Tile.Feature value) {
          if (featuresBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFeaturesIsMutable();
            features_.add(value);
            onChanged();
          } else {
            featuresBuilder_.addMessage(value);
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder addFeatures(
          int index, vector_tile.TileOuterClass.Tile.Feature value) {
          if (featuresBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFeaturesIsMutable();
            features_.add(index, value);
            onChanged();
          } else {
            featuresBuilder_.addMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder addFeatures(
          vector_tile.TileOuterClass.Tile.Feature.Builder builderForValue) {
          if (featuresBuilder_ == null) {
            ensureFeaturesIsMutable();
            features_.add(builderForValue.build());
            onChanged();
          } else {
            featuresBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder addFeatures(
          int index, vector_tile.TileOuterClass.Tile.Feature.Builder builderForValue) {
          if (featuresBuilder_ == null) {
            ensureFeaturesIsMutable();
            features_.add(index, builderForValue.build());
            onChanged();
          } else {
            featuresBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder addAllFeatures(
          java.lang.Iterable<? extends vector_tile.TileOuterClass.Tile.Feature> values) {
          if (featuresBuilder_ == null) {
            ensureFeaturesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, features_);
            onChanged();
          } else {
            featuresBuilder_.addAllMessages(values);
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder clearFeatures() {
          if (featuresBuilder_ == null) {
            features_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000004);
            onChanged();
          } else {
            featuresBuilder_.clear();
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public Builder removeFeatures(int index) {
          if (featuresBuilder_ == null) {
            ensureFeaturesIsMutable();
            features_.remove(index);
            onChanged();
          } else {
            featuresBuilder_.remove(index);
          }
          return this;
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public vector_tile.TileOuterClass.Tile.Feature.Builder getFeaturesBuilder(
          int index) {
          return getFeaturesFieldBuilder().getBuilder(index);
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public vector_tile.TileOuterClass.Tile.FeatureOrBuilder getFeaturesOrBuilder(
          int index) {
          if (featuresBuilder_ == null) {
            return features_.get(index);  } else {
            return featuresBuilder_.getMessageOrBuilder(index);
          }
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public java.util.List<? extends vector_tile.TileOuterClass.Tile.FeatureOrBuilder>
        getFeaturesOrBuilderList() {
          if (featuresBuilder_ != null) {
            return featuresBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(features_);
          }
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public vector_tile.TileOuterClass.Tile.Feature.Builder addFeaturesBuilder() {
          return getFeaturesFieldBuilder().addBuilder(
            vector_tile.TileOuterClass.Tile.Feature.getDefaultInstance());
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public vector_tile.TileOuterClass.Tile.Feature.Builder addFeaturesBuilder(
          int index) {
          return getFeaturesFieldBuilder().addBuilder(
            index, vector_tile.TileOuterClass.Tile.Feature.getDefaultInstance());
        }
        /**
         * <pre>
         * The actual features in this tile.
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Feature features = 2;</code>
         */
        public java.util.List<vector_tile.TileOuterClass.Tile.Feature.Builder>
        getFeaturesBuilderList() {
          return getFeaturesFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilder<
          vector_tile.TileOuterClass.Tile.Feature, vector_tile.TileOuterClass.Tile.Feature.Builder, vector_tile.TileOuterClass.Tile.FeatureOrBuilder>
        getFeaturesFieldBuilder() {
          if (featuresBuilder_ == null) {
            featuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              vector_tile.TileOuterClass.Tile.Feature, vector_tile.TileOuterClass.Tile.Feature.Builder, vector_tile.TileOuterClass.Tile.FeatureOrBuilder>(
              features_,
              ((bitField0_ & 0x00000004) != 0),
              getParentForChildren(),
              isClean());
            features_ = null;
          }
          return featuresBuilder_;
        }

        private com.google.protobuf.LazyStringArrayList keys_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        private void ensureKeysIsMutable() {
          if (!keys_.isModifiable()) {
            keys_ = new com.google.protobuf.LazyStringArrayList(keys_);
          }
          bitField0_ |= 0x00000008;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @return A list containing the keys.
         */
        public com.google.protobuf.ProtocolStringList
        getKeysList() {
          keys_.makeImmutable();
          return keys_;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @return The count of keys.
         */
        public int getKeysCount() {
          return keys_.size();
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param index The index of the element to return.
         * @return The keys at the given index.
         */
        public java.lang.String getKeys(int index) {
          return keys_.get(index);
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param index The index of the value to return.
         * @return The bytes of the keys at the given index.
         */
        public com.google.protobuf.ByteString
        getKeysBytes(int index) {
          return keys_.getByteString(index);
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param index The index to set the value at.
         * @param value The keys to set.
         * @return This builder for chaining.
         */
        public Builder setKeys(
          int index, java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          ensureKeysIsMutable();
          keys_.set(index, value);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param value The keys to add.
         * @return This builder for chaining.
         */
        public Builder addKeys(
          java.lang.String value) {
          if (value == null) { throw new NullPointerException(); }
          ensureKeysIsMutable();
          keys_.add(value);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param values The keys to add.
         * @return This builder for chaining.
         */
        public Builder addAllKeys(
          java.lang.Iterable<java.lang.String> values) {
          ensureKeysIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keys_);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @return This builder for chaining.
         */
        public Builder clearKeys() {
          keys_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for keys
         * </pre>
         *
         * <code>repeated string keys = 3;</code>
         * @param value The bytes of the keys to add.
         * @return This builder for chaining.
         */
        public Builder addKeysBytes(
          com.google.protobuf.ByteString value) {
          if (value == null) { throw new NullPointerException(); }
          ensureKeysIsMutable();
          keys_.add(value);
          bitField0_ |= 0x00000008;
          onChanged();
          return this;
        }

        private java.util.List<vector_tile.TileOuterClass.Tile.Value> values_ =
          java.util.Collections.emptyList();
        private void ensureValuesIsMutable() {
          if (!((bitField0_ & 0x00000010) != 0)) {
            values_ = new java.util.ArrayList<vector_tile.TileOuterClass.Tile.Value>(values_);
            bitField0_ |= 0x00000010;
          }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
          vector_tile.TileOuterClass.Tile.Value, vector_tile.TileOuterClass.Tile.Value.Builder, vector_tile.TileOuterClass.Tile.ValueOrBuilder> valuesBuilder_;

        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public java.util.List<vector_tile.TileOuterClass.Tile.Value> getValuesList() {
          if (valuesBuilder_ == null) {
            return java.util.Collections.unmodifiableList(values_);
          } else {
            return valuesBuilder_.getMessageList();
          }
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public int getValuesCount() {
          if (valuesBuilder_ == null) {
            return values_.size();
          } else {
            return valuesBuilder_.getCount();
          }
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public vector_tile.TileOuterClass.Tile.Value getValues(int index) {
          if (valuesBuilder_ == null) {
            return values_.get(index);
          } else {
            return valuesBuilder_.getMessage(index);
          }
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder setValues(
          int index, vector_tile.TileOuterClass.Tile.Value value) {
          if (valuesBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureValuesIsMutable();
            values_.set(index, value);
            onChanged();
          } else {
            valuesBuilder_.setMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder setValues(
          int index, vector_tile.TileOuterClass.Tile.Value.Builder builderForValue) {
          if (valuesBuilder_ == null) {
            ensureValuesIsMutable();
            values_.set(index, builderForValue.build());
            onChanged();
          } else {
            valuesBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder addValues(vector_tile.TileOuterClass.Tile.Value value) {
          if (valuesBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureValuesIsMutable();
            values_.add(value);
            onChanged();
          } else {
            valuesBuilder_.addMessage(value);
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder addValues(
          int index, vector_tile.TileOuterClass.Tile.Value value) {
          if (valuesBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureValuesIsMutable();
            values_.add(index, value);
            onChanged();
          } else {
            valuesBuilder_.addMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder addValues(
          vector_tile.TileOuterClass.Tile.Value.Builder builderForValue) {
          if (valuesBuilder_ == null) {
            ensureValuesIsMutable();
            values_.add(builderForValue.build());
            onChanged();
          } else {
            valuesBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder addValues(
          int index, vector_tile.TileOuterClass.Tile.Value.Builder builderForValue) {
          if (valuesBuilder_ == null) {
            ensureValuesIsMutable();
            values_.add(index, builderForValue.build());
            onChanged();
          } else {
            valuesBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder addAllValues(
          java.lang.Iterable<? extends vector_tile.TileOuterClass.Tile.Value> values) {
          if (valuesBuilder_ == null) {
            ensureValuesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, values_);
            onChanged();
          } else {
            valuesBuilder_.addAllMessages(values);
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder clearValues() {
          if (valuesBuilder_ == null) {
            values_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000010);
            onChanged();
          } else {
            valuesBuilder_.clear();
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public Builder removeValues(int index) {
          if (valuesBuilder_ == null) {
            ensureValuesIsMutable();
            values_.remove(index);
            onChanged();
          } else {
            valuesBuilder_.remove(index);
          }
          return this;
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public vector_tile.TileOuterClass.Tile.Value.Builder getValuesBuilder(
          int index) {
          return getValuesFieldBuilder().getBuilder(index);
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public vector_tile.TileOuterClass.Tile.ValueOrBuilder getValuesOrBuilder(
          int index) {
          if (valuesBuilder_ == null) {
            return values_.get(index);  } else {
            return valuesBuilder_.getMessageOrBuilder(index);
          }
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public java.util.List<? extends vector_tile.TileOuterClass.Tile.ValueOrBuilder>
        getValuesOrBuilderList() {
          if (valuesBuilder_ != null) {
            return valuesBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(values_);
          }
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public vector_tile.TileOuterClass.Tile.Value.Builder addValuesBuilder() {
          return getValuesFieldBuilder().addBuilder(
            vector_tile.TileOuterClass.Tile.Value.getDefaultInstance());
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public vector_tile.TileOuterClass.Tile.Value.Builder addValuesBuilder(
          int index) {
          return getValuesFieldBuilder().addBuilder(
            index, vector_tile.TileOuterClass.Tile.Value.getDefaultInstance());
        }
        /**
         * <pre>
         * Dictionary encoding for values
         * </pre>
         *
         * <code>repeated .vector_tile.Tile.Value values = 4;</code>
         */
        public java.util.List<vector_tile.TileOuterClass.Tile.Value.Builder>
        getValuesBuilderList() {
          return getValuesFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilder<
          vector_tile.TileOuterClass.Tile.Value, vector_tile.TileOuterClass.Tile.Value.Builder, vector_tile.TileOuterClass.Tile.ValueOrBuilder>
        getValuesFieldBuilder() {
          if (valuesBuilder_ == null) {
            valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              vector_tile.TileOuterClass.Tile.Value, vector_tile.TileOuterClass.Tile.Value.Builder, vector_tile.TileOuterClass.Tile.ValueOrBuilder>(
              values_,
              ((bitField0_ & 0x00000010) != 0),
              getParentForChildren(),
              isClean());
            values_ = null;
          }
          return valuesBuilder_;
        }

        private int extent_ = 4096;
        /**
         * <pre>
         * Although this is an "optional" field it is required by the specification.
         * See https://github.com/mapbox/vector-tile-spec/issues/47
         * </pre>
         *
         * <code>optional uint32 extent = 5 [default = 4096];</code>
         * @return Whether the extent field is set.
         */
        @java.lang.Override
        public boolean hasExtent() {
          return ((bitField0_ & 0x00000020) != 0);
        }
        /**
         * <pre>
         * Although this is an "optional" field it is required by the specification.
         * See https://github.com/mapbox/vector-tile-spec/issues/47
         * </pre>
         *
         * <code>optional uint32 extent = 5 [default = 4096];</code>
         * @return The extent.
         */
        @java.lang.Override
        public int getExtent() {
          return extent_;
        }
        /**
         * <pre>
         * Although this is an "optional" field it is required by the specification.
         * See https://github.com/mapbox/vector-tile-spec/issues/47
         * </pre>
         *
         * <code>optional uint32 extent = 5 [default = 4096];</code>
         * @param value The extent to set.
         * @return This builder for chaining.
         */
        public Builder setExtent(int value) {

          extent_ = value;
          bitField0_ |= 0x00000020;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Although this is an "optional" field it is required by the specification.
         * See https://github.com/mapbox/vector-tile-spec/issues/47
         * </pre>
         *
         * <code>optional uint32 extent = 5 [default = 4096];</code>
         * @return This builder for chaining.
         */
        public Builder clearExtent() {
          bitField0_ = (bitField0_ & ~0x00000020);
          extent_ = 4096;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:vector_tile.Tile.Layer)
      }

      // @@protoc_insertion_point(class_scope:vector_tile.Tile.Layer)
      private static final vector_tile.TileOuterClass.Tile.Layer DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new vector_tile.TileOuterClass.Tile.Layer();
      }

      public static vector_tile.TileOuterClass.Tile.Layer getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<Layer>
        PARSER = new com.google.protobuf.AbstractParser<Layer>() {
        @java.lang.Override
        public Layer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<Layer> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Layer> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile.Layer getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int LAYERS_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<vector_tile.TileOuterClass.Tile.Layer> layers_;
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    @java.lang.Override
    public java.util.List<vector_tile.TileOuterClass.Tile.Layer> getLayersList() {
      return layers_;
    }
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends vector_tile.TileOuterClass.Tile.LayerOrBuilder>
    getLayersOrBuilderList() {
      return layers_;
    }
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    @java.lang.Override
    public int getLayersCount() {
      return layers_.size();
    }
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    @java.lang.Override
    public vector_tile.TileOuterClass.Tile.Layer getLayers(int index) {
      return layers_.get(index);
    }
    /**
     * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
     */
    @java.lang.Override
    public vector_tile.TileOuterClass.Tile.LayerOrBuilder getLayersOrBuilder(
      int index) {
      return layers_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getLayersCount(); i++) {
        if (!getLayers(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
      throws java.io.IOException {
      com.google.protobuf.GeneratedMessage
        .ExtendableMessage.ExtensionSerializer
        extensionWriter = newExtensionSerializer();
      for (int i = 0; i < layers_.size(); i++) {
        output.writeMessage(3, layers_.get(i));
      }
      extensionWriter.writeUntil(8192, output);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < layers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, layers_.get(i));
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof vector_tile.TileOuterClass.Tile)) {
        return super.equals(obj);
      }
      vector_tile.TileOuterClass.Tile other = (vector_tile.TileOuterClass.Tile) obj;

      if (!getLayersList()
        .equals(other.getLayersList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      if (!getExtensionFields().equals(other.getExtensionFields()))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLayersCount() > 0) {
        hash = (37 * hash) + LAYERS_FIELD_NUMBER;
        hash = (53 * hash) + getLayersList().hashCode();
      }
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static vector_tile.TileOuterClass.Tile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static vector_tile.TileOuterClass.Tile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
    }

    public static vector_tile.TileOuterClass.Tile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
    }
    public static vector_tile.TileOuterClass.Tile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(vector_tile.TileOuterClass.Tile prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code vector_tile.Tile}
     */
    public static final class Builder extends
      com.google.protobuf.GeneratedMessage.ExtendableBuilder<
        vector_tile.TileOuterClass.Tile, Builder> implements
      // @@protoc_insertion_point(builder_implements:vector_tile.Tile)
      vector_tile.TileOuterClass.TileOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
            vector_tile.TileOuterClass.Tile.class, vector_tile.TileOuterClass.Tile.Builder.class);
      }

      // Construct using vector_tile.TileOuterClass.Tile.newBuilder()
      private Builder() {

      }

      private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        if (layersBuilder_ == null) {
          layers_ = java.util.Collections.emptyList();
        } else {
          layers_ = null;
          layersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return vector_tile.TileOuterClass.internal_static_vector_tile_Tile_descriptor;
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile getDefaultInstanceForType() {
        return vector_tile.TileOuterClass.Tile.getDefaultInstance();
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile build() {
        vector_tile.TileOuterClass.Tile result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public vector_tile.TileOuterClass.Tile buildPartial() {
        vector_tile.TileOuterClass.Tile result = new vector_tile.TileOuterClass.Tile(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(vector_tile.TileOuterClass.Tile result) {
        if (layersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            layers_ = java.util.Collections.unmodifiableList(layers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.layers_ = layers_;
        } else {
          result.layers_ = layersBuilder_.build();
        }
      }

      private void buildPartial0(vector_tile.TileOuterClass.Tile result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof vector_tile.TileOuterClass.Tile) {
          return mergeFrom((vector_tile.TileOuterClass.Tile)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(vector_tile.TileOuterClass.Tile other) {
        if (other == vector_tile.TileOuterClass.Tile.getDefaultInstance()) return this;
        if (layersBuilder_ == null) {
          if (!other.layers_.isEmpty()) {
            if (layers_.isEmpty()) {
              layers_ = other.layers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLayersIsMutable();
              layers_.addAll(other.layers_);
            }
            onChanged();
          }
        } else {
          if (!other.layers_.isEmpty()) {
            if (layersBuilder_.isEmpty()) {
              layersBuilder_.dispose();
              layersBuilder_ = null;
              layers_ = other.layers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              layersBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                  getLayersFieldBuilder() : null;
            } else {
              layersBuilder_.addAllMessages(other.layers_);
            }
          }
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getLayersCount(); i++) {
          if (!getLayers(i).isInitialized()) {
            return false;
          }
        }
        if (!extensionsAreInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 26: {
                vector_tile.TileOuterClass.Tile.Layer m =
                  input.readMessage(
                    vector_tile.TileOuterClass.Tile.Layer.parser(),
                    extensionRegistry);
                if (layersBuilder_ == null) {
                  ensureLayersIsMutable();
                  layers_.add(m);
                } else {
                  layersBuilder_.addMessage(m);
                }
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.util.List<vector_tile.TileOuterClass.Tile.Layer> layers_ =
        java.util.Collections.emptyList();
      private void ensureLayersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          layers_ = new java.util.ArrayList<vector_tile.TileOuterClass.Tile.Layer>(layers_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
        vector_tile.TileOuterClass.Tile.Layer, vector_tile.TileOuterClass.Tile.Layer.Builder, vector_tile.TileOuterClass.Tile.LayerOrBuilder> layersBuilder_;

      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public java.util.List<vector_tile.TileOuterClass.Tile.Layer> getLayersList() {
        if (layersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(layers_);
        } else {
          return layersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public int getLayersCount() {
        if (layersBuilder_ == null) {
          return layers_.size();
        } else {
          return layersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public vector_tile.TileOuterClass.Tile.Layer getLayers(int index) {
        if (layersBuilder_ == null) {
          return layers_.get(index);
        } else {
          return layersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder setLayers(
        int index, vector_tile.TileOuterClass.Tile.Layer value) {
        if (layersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLayersIsMutable();
          layers_.set(index, value);
          onChanged();
        } else {
          layersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder setLayers(
        int index, vector_tile.TileOuterClass.Tile.Layer.Builder builderForValue) {
        if (layersBuilder_ == null) {
          ensureLayersIsMutable();
          layers_.set(index, builderForValue.build());
          onChanged();
        } else {
          layersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder addLayers(vector_tile.TileOuterClass.Tile.Layer value) {
        if (layersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLayersIsMutable();
          layers_.add(value);
          onChanged();
        } else {
          layersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder addLayers(
        int index, vector_tile.TileOuterClass.Tile.Layer value) {
        if (layersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLayersIsMutable();
          layers_.add(index, value);
          onChanged();
        } else {
          layersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder addLayers(
        vector_tile.TileOuterClass.Tile.Layer.Builder builderForValue) {
        if (layersBuilder_ == null) {
          ensureLayersIsMutable();
          layers_.add(builderForValue.build());
          onChanged();
        } else {
          layersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder addLayers(
        int index, vector_tile.TileOuterClass.Tile.Layer.Builder builderForValue) {
        if (layersBuilder_ == null) {
          ensureLayersIsMutable();
          layers_.add(index, builderForValue.build());
          onChanged();
        } else {
          layersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder addAllLayers(
        java.lang.Iterable<? extends vector_tile.TileOuterClass.Tile.Layer> values) {
        if (layersBuilder_ == null) {
          ensureLayersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, layers_);
          onChanged();
        } else {
          layersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder clearLayers() {
        if (layersBuilder_ == null) {
          layers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          layersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public Builder removeLayers(int index) {
        if (layersBuilder_ == null) {
          ensureLayersIsMutable();
          layers_.remove(index);
          onChanged();
        } else {
          layersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public vector_tile.TileOuterClass.Tile.Layer.Builder getLayersBuilder(
        int index) {
        return getLayersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public vector_tile.TileOuterClass.Tile.LayerOrBuilder getLayersOrBuilder(
        int index) {
        if (layersBuilder_ == null) {
          return layers_.get(index);  } else {
          return layersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public java.util.List<? extends vector_tile.TileOuterClass.Tile.LayerOrBuilder>
      getLayersOrBuilderList() {
        if (layersBuilder_ != null) {
          return layersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(layers_);
        }
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public vector_tile.TileOuterClass.Tile.Layer.Builder addLayersBuilder() {
        return getLayersFieldBuilder().addBuilder(
          vector_tile.TileOuterClass.Tile.Layer.getDefaultInstance());
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public vector_tile.TileOuterClass.Tile.Layer.Builder addLayersBuilder(
        int index) {
        return getLayersFieldBuilder().addBuilder(
          index, vector_tile.TileOuterClass.Tile.Layer.getDefaultInstance());
      }
      /**
       * <code>repeated .vector_tile.Tile.Layer layers = 3;</code>
       */
      public java.util.List<vector_tile.TileOuterClass.Tile.Layer.Builder>
      getLayersBuilderList() {
        return getLayersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
        vector_tile.TileOuterClass.Tile.Layer, vector_tile.TileOuterClass.Tile.Layer.Builder, vector_tile.TileOuterClass.Tile.LayerOrBuilder>
      getLayersFieldBuilder() {
        if (layersBuilder_ == null) {
          layersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            vector_tile.TileOuterClass.Tile.Layer, vector_tile.TileOuterClass.Tile.Layer.Builder, vector_tile.TileOuterClass.Tile.LayerOrBuilder>(
            layers_,
            ((bitField0_ & 0x00000001) != 0),
            getParentForChildren(),
            isClean());
          layers_ = null;
        }
        return layersBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:vector_tile.Tile)
    }

    // @@protoc_insertion_point(class_scope:vector_tile.Tile)
    private static final vector_tile.TileOuterClass.Tile DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new vector_tile.TileOuterClass.Tile();
    }

    public static vector_tile.TileOuterClass.Tile getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Tile>
      PARSER = new com.google.protobuf.AbstractParser<Tile>() {
      @java.lang.Override
      public Tile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Tile> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Tile> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public vector_tile.TileOuterClass.Tile getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vector_tile_Tile_descriptor;
  private static final
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_vector_tile_Tile_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vector_tile_Tile_Value_descriptor;
  private static final
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_vector_tile_Tile_Value_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vector_tile_Tile_Feature_descriptor;
  private static final
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_vector_tile_Tile_Feature_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vector_tile_Tile_Layer_descriptor;
  private static final
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internal_static_vector_tile_Tile_Layer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
    descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntile.proto\022\013vector_tile\"\300\004\n\004Tile\022\'\n\006la" +
        "yers\030\003 \003(\0132\027.vector_tile.Tile.Layer\032\241\001\n\005" +
        "Value\022\024\n\014string_value\030\001 \001(\t\022\023\n\013float_val" +
        "ue\030\002 \001(\002\022\024\n\014double_value\030\003 \001(\001\022\021\n\tint_va" +
        "lue\030\004 \001(\003\022\022\n\nuint_value\030\005 \001(\004\022\022\n\nsint_va" +
        "lue\030\006 \001(\022\022\022\n\nbool_value\030\007 \001(\010*\010\010\010\020\200\200\200\200\002\032" +
        "s\n\007Feature\022\r\n\002id\030\001 \001(\004:\0010\022\020\n\004tags\030\002 \003(\rB" +
        "\002\020\001\0221\n\004type\030\003 \001(\0162\032.vector_tile.Tile.Geo" +
        "mType:\007UNKNOWN\022\024\n\010geometry\030\004 \003(\rB\002\020\001\032\255\001\n" +
        "\005Layer\022\022\n\007version\030\017 \002(\r:\0011\022\014\n\004name\030\001 \002(\t" +
        "\022+\n\010features\030\002 \003(\0132\031.vector_tile.Tile.Fe" +
        "ature\022\014\n\004keys\030\003 \003(\t\022\'\n\006values\030\004 \003(\0132\027.ve" +
        "ctor_tile.Tile.Value\022\024\n\006extent\030\005 \001(\r:\00440" +
        "96*\010\010\020\020\200\200\200\200\002\"?\n\010GeomType\022\013\n\007UNKNOWN\020\000\022\t\n" +
        "\005POINT\020\001\022\016\n\nLINESTRING\020\002\022\013\n\007POLYGON\020\003*\005\010" +
        "\020\020\200@B\002H\003"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_vector_tile_Tile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_vector_tile_Tile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
      internal_static_vector_tile_Tile_descriptor,
      new java.lang.String[] { "Layers", });
    internal_static_vector_tile_Tile_Value_descriptor =
      internal_static_vector_tile_Tile_descriptor.getNestedTypes().get(0);
    internal_static_vector_tile_Tile_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
      internal_static_vector_tile_Tile_Value_descriptor,
      new java.lang.String[] { "StringValue", "FloatValue", "DoubleValue", "IntValue", "UintValue", "SintValue", "BoolValue", });
    internal_static_vector_tile_Tile_Feature_descriptor =
      internal_static_vector_tile_Tile_descriptor.getNestedTypes().get(1);
    internal_static_vector_tile_Tile_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
      internal_static_vector_tile_Tile_Feature_descriptor,
      new java.lang.String[] { "Id", "Tags", "Type", "Geometry", });
    internal_static_vector_tile_Tile_Layer_descriptor =
      internal_static_vector_tile_Tile_descriptor.getNestedTypes().get(2);
    internal_static_vector_tile_Tile_Layer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
      internal_static_vector_tile_Tile_Layer_descriptor,
      new java.lang.String[] { "Version", "Name", "Features", "Keys", "Values", "Extent", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}