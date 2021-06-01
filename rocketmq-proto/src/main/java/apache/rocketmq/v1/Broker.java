// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

/**
 * Protobuf type {@code apache.rocketmq.v1.Broker}
 */
public final class Broker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v1.Broker)
    BrokerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Broker.newBuilder() to construct.
  private Broker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Broker() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Broker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Broker(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            id_ = input.readInt32();
            break;
          }
          case 26: {
            apache.rocketmq.v1.Endpoints.Builder subBuilder = null;
            if (endpoints_ != null) {
              subBuilder = endpoints_.toBuilder();
            }
            endpoints_ = input.readMessage(apache.rocketmq.v1.Endpoints.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(endpoints_);
              endpoints_ = subBuilder.buildPartial();
            }

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
    return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Broker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Broker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v1.Broker.class, apache.rocketmq.v1.Broker.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the broker
   * </pre>
   *
   * <code>string name = 1;</code>
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
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the broker
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <pre>
   * Broker index. Canonically, index = 0 implies that the broker is playing leader role while brokers with index &gt; 0
   * play follower role.
   * </pre>
   *
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 3;
  private apache.rocketmq.v1.Endpoints endpoints_;
  /**
   * <pre>
   * Address of the broker, complying with the following scheme
   * 1. dns:[//authority/]host[:port]
   * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
   * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
   * @return Whether the endpoints field is set.
   */
  @java.lang.Override
  public boolean hasEndpoints() {
    return endpoints_ != null;
  }
  /**
   * <pre>
   * Address of the broker, complying with the following scheme
   * 1. dns:[//authority/]host[:port]
   * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
   * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
   * @return The endpoints.
   */
  @java.lang.Override
  public apache.rocketmq.v1.Endpoints getEndpoints() {
    return endpoints_ == null ? apache.rocketmq.v1.Endpoints.getDefaultInstance() : endpoints_;
  }
  /**
   * <pre>
   * Address of the broker, complying with the following scheme
   * 1. dns:[//authority/]host[:port]
   * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
   * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.EndpointsOrBuilder getEndpointsOrBuilder() {
    return getEndpoints();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (id_ != 0) {
      output.writeInt32(2, id_);
    }
    if (endpoints_ != null) {
      output.writeMessage(3, getEndpoints());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, id_);
    }
    if (endpoints_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEndpoints());
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
    if (!(obj instanceof apache.rocketmq.v1.Broker)) {
      return super.equals(obj);
    }
    apache.rocketmq.v1.Broker other = (apache.rocketmq.v1.Broker) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getId()
        != other.getId()) return false;
    if (hasEndpoints() != other.hasEndpoints()) return false;
    if (hasEndpoints()) {
      if (!getEndpoints()
          .equals(other.getEndpoints())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    if (hasEndpoints()) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoints().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v1.Broker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Broker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.Broker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.Broker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Broker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.Broker parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v1.Broker prototype) {
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
   * Protobuf type {@code apache.rocketmq.v1.Broker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v1.Broker)
      apache.rocketmq.v1.BrokerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Broker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Broker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v1.Broker.class, apache.rocketmq.v1.Broker.Builder.class);
    }

    // Construct using apache.rocketmq.v1.Broker.newBuilder()
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
      name_ = "";

      id_ = 0;

      if (endpointsBuilder_ == null) {
        endpoints_ = null;
      } else {
        endpoints_ = null;
        endpointsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v1.MQDomain.internal_static_apache_rocketmq_v1_Broker_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v1.Broker getDefaultInstanceForType() {
      return apache.rocketmq.v1.Broker.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v1.Broker build() {
      apache.rocketmq.v1.Broker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v1.Broker buildPartial() {
      apache.rocketmq.v1.Broker result = new apache.rocketmq.v1.Broker(this);
      result.name_ = name_;
      result.id_ = id_;
      if (endpointsBuilder_ == null) {
        result.endpoints_ = endpoints_;
      } else {
        result.endpoints_ = endpointsBuilder_.build();
      }
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
      if (other instanceof apache.rocketmq.v1.Broker) {
        return mergeFrom((apache.rocketmq.v1.Broker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v1.Broker other) {
      if (other == apache.rocketmq.v1.Broker.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.hasEndpoints()) {
        mergeEndpoints(other.getEndpoints());
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
      apache.rocketmq.v1.Broker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v1.Broker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the broker
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the broker
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * <pre>
     * Name of the broker
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the broker
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the broker
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     * Broker index. Canonically, index = 0 implies that the broker is playing leader role while brokers with index &gt; 0
     * play follower role.
     * </pre>
     *
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * Broker index. Canonically, index = 0 implies that the broker is playing leader role while brokers with index &gt; 0
     * play follower role.
     * </pre>
     *
     * <code>int32 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Broker index. Canonically, index = 0 implies that the broker is playing leader role while brokers with index &gt; 0
     * play follower role.
     * </pre>
     *
     * <code>int32 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private apache.rocketmq.v1.Endpoints endpoints_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Endpoints, apache.rocketmq.v1.Endpoints.Builder, apache.rocketmq.v1.EndpointsOrBuilder> endpointsBuilder_;
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     * @return Whether the endpoints field is set.
     */
    public boolean hasEndpoints() {
      return endpointsBuilder_ != null || endpoints_ != null;
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     * @return The endpoints.
     */
    public apache.rocketmq.v1.Endpoints getEndpoints() {
      if (endpointsBuilder_ == null) {
        return endpoints_ == null ? apache.rocketmq.v1.Endpoints.getDefaultInstance() : endpoints_;
      } else {
        return endpointsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public Builder setEndpoints(apache.rocketmq.v1.Endpoints value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoints_ = value;
        onChanged();
      } else {
        endpointsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public Builder setEndpoints(
        apache.rocketmq.v1.Endpoints.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        endpoints_ = builderForValue.build();
        onChanged();
      } else {
        endpointsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public Builder mergeEndpoints(apache.rocketmq.v1.Endpoints value) {
      if (endpointsBuilder_ == null) {
        if (endpoints_ != null) {
          endpoints_ =
            apache.rocketmq.v1.Endpoints.newBuilder(endpoints_).mergeFrom(value).buildPartial();
        } else {
          endpoints_ = value;
        }
        onChanged();
      } else {
        endpointsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public Builder clearEndpoints() {
      if (endpointsBuilder_ == null) {
        endpoints_ = null;
        onChanged();
      } else {
        endpoints_ = null;
        endpointsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public apache.rocketmq.v1.Endpoints.Builder getEndpointsBuilder() {
      
      onChanged();
      return getEndpointsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    public apache.rocketmq.v1.EndpointsOrBuilder getEndpointsOrBuilder() {
      if (endpointsBuilder_ != null) {
        return endpointsBuilder_.getMessageOrBuilder();
      } else {
        return endpoints_ == null ?
            apache.rocketmq.v1.Endpoints.getDefaultInstance() : endpoints_;
      }
    }
    /**
     * <pre>
     * Address of the broker, complying with the following scheme
     * 1. dns:[//authority/]host[:port]
     * 2. ipv4:address[:port][,address[:port],...] – IPv4 addresses
     * 3. ipv6:address[:port][,address[:port],...] – IPv6 addresses
     * </pre>
     *
     * <code>.apache.rocketmq.v1.Endpoints endpoints = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Endpoints, apache.rocketmq.v1.Endpoints.Builder, apache.rocketmq.v1.EndpointsOrBuilder> 
        getEndpointsFieldBuilder() {
      if (endpointsBuilder_ == null) {
        endpointsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.Endpoints, apache.rocketmq.v1.Endpoints.Builder, apache.rocketmq.v1.EndpointsOrBuilder>(
                getEndpoints(),
                getParentForChildren(),
                isClean());
        endpoints_ = null;
      }
      return endpointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v1.Broker)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v1.Broker)
  private static final apache.rocketmq.v1.Broker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v1.Broker();
  }

  public static apache.rocketmq.v1.Broker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Broker>
      PARSER = new com.google.protobuf.AbstractParser<Broker>() {
    @java.lang.Override
    public Broker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Broker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Broker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Broker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v1.Broker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

