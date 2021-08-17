// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fretes.proto

package br.com.estudos;

/**
 * Protobuf type {@code br.com.estudos.CalculaFreteResponse}
 */
public final class CalculaFreteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.estudos.CalculaFreteResponse)
    CalculaFreteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculaFreteResponse.newBuilder() to construct.
  private CalculaFreteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculaFreteResponse() {
    cep_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculaFreteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculaFreteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            valorFrete_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cep_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.estudos.Fretes.internal_static_br_com_estudos_CalculaFreteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.estudos.Fretes.internal_static_br_com_estudos_CalculaFreteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.estudos.CalculaFreteResponse.class, br.com.estudos.CalculaFreteResponse.Builder.class);
  }

  public static final int VALORFRETE_FIELD_NUMBER = 1;
  private double valorFrete_;
  /**
   * <code>double valorFrete = 1;</code>
   * @return The valorFrete.
   */
  @java.lang.Override
  public double getValorFrete() {
    return valorFrete_;
  }

  public static final int CEP_FIELD_NUMBER = 2;
  private volatile java.lang.Object cep_;
  /**
   * <code>string cep = 2;</code>
   * @return The cep.
   */
  @java.lang.Override
  public java.lang.String getCep() {
    java.lang.Object ref = cep_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cep_ = s;
      return s;
    }
  }
  /**
   * <code>string cep = 2;</code>
   * @return The bytes for cep.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCepBytes() {
    java.lang.Object ref = cep_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cep_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

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
    if (valorFrete_ != 0D) {
      output.writeDouble(1, valorFrete_);
    }
    if (!getCepBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cep_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valorFrete_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, valorFrete_);
    }
    if (!getCepBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cep_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.estudos.CalculaFreteResponse)) {
      return super.equals(obj);
    }
    br.com.estudos.CalculaFreteResponse other = (br.com.estudos.CalculaFreteResponse) obj;

    if (java.lang.Double.doubleToLongBits(getValorFrete())
        != java.lang.Double.doubleToLongBits(
            other.getValorFrete())) return false;
    if (!getCep()
        .equals(other.getCep())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALORFRETE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValorFrete()));
    hash = (37 * hash) + CEP_FIELD_NUMBER;
    hash = (53 * hash) + getCep().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.estudos.CalculaFreteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.estudos.CalculaFreteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.estudos.CalculaFreteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.estudos.CalculaFreteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.estudos.CalculaFreteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code br.com.estudos.CalculaFreteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.estudos.CalculaFreteResponse)
      br.com.estudos.CalculaFreteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.estudos.Fretes.internal_static_br_com_estudos_CalculaFreteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.estudos.Fretes.internal_static_br_com_estudos_CalculaFreteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.estudos.CalculaFreteResponse.class, br.com.estudos.CalculaFreteResponse.Builder.class);
    }

    // Construct using br.com.estudos.CalculaFreteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      valorFrete_ = 0D;

      cep_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.estudos.Fretes.internal_static_br_com_estudos_CalculaFreteResponse_descriptor;
    }

    @java.lang.Override
    public br.com.estudos.CalculaFreteResponse getDefaultInstanceForType() {
      return br.com.estudos.CalculaFreteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.estudos.CalculaFreteResponse build() {
      br.com.estudos.CalculaFreteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.estudos.CalculaFreteResponse buildPartial() {
      br.com.estudos.CalculaFreteResponse result = new br.com.estudos.CalculaFreteResponse(this);
      result.valorFrete_ = valorFrete_;
      result.cep_ = cep_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.estudos.CalculaFreteResponse) {
        return mergeFrom((br.com.estudos.CalculaFreteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.estudos.CalculaFreteResponse other) {
      if (other == br.com.estudos.CalculaFreteResponse.getDefaultInstance()) return this;
      if (other.getValorFrete() != 0D) {
        setValorFrete(other.getValorFrete());
      }
      if (!other.getCep().isEmpty()) {
        cep_ = other.cep_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      br.com.estudos.CalculaFreteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.estudos.CalculaFreteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double valorFrete_ ;
    /**
     * <code>double valorFrete = 1;</code>
     * @return The valorFrete.
     */
    @java.lang.Override
    public double getValorFrete() {
      return valorFrete_;
    }
    /**
     * <code>double valorFrete = 1;</code>
     * @param value The valorFrete to set.
     * @return This builder for chaining.
     */
    public Builder setValorFrete(double value) {
      
      valorFrete_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double valorFrete = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValorFrete() {
      
      valorFrete_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object cep_ = "";
    /**
     * <code>string cep = 2;</code>
     * @return The cep.
     */
    public java.lang.String getCep() {
      java.lang.Object ref = cep_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cep_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cep = 2;</code>
     * @return The bytes for cep.
     */
    public com.google.protobuf.ByteString
        getCepBytes() {
      java.lang.Object ref = cep_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cep_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cep = 2;</code>
     * @param value The cep to set.
     * @return This builder for chaining.
     */
    public Builder setCep(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cep_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cep = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCep() {
      
      cep_ = getDefaultInstance().getCep();
      onChanged();
      return this;
    }
    /**
     * <code>string cep = 2;</code>
     * @param value The bytes for cep to set.
     * @return This builder for chaining.
     */
    public Builder setCepBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cep_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:br.com.estudos.CalculaFreteResponse)
  }

  // @@protoc_insertion_point(class_scope:br.com.estudos.CalculaFreteResponse)
  private static final br.com.estudos.CalculaFreteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.estudos.CalculaFreteResponse();
  }

  public static br.com.estudos.CalculaFreteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculaFreteResponse>
      PARSER = new com.google.protobuf.AbstractParser<CalculaFreteResponse>() {
    @java.lang.Override
    public CalculaFreteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculaFreteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculaFreteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculaFreteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.estudos.CalculaFreteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

