/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A single strongly-typed value.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.TypedValue}
 */
public final class TypedValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.TypedValue)
    TypedValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TypedValue.newBuilder() to construct.
  private TypedValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TypedValue() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TypedValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8:
            {
              valueCase_ = 1;
              value_ = input.readBool();
              break;
            }
          case 16:
            {
              valueCase_ = 2;
              value_ = input.readInt64();
              break;
            }
          case 25:
            {
              valueCase_ = 3;
              value_ = input.readDouble();
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 4;
              value_ = s;
              break;
            }
          case 42:
            {
              com.google.api.Distribution.Builder subBuilder = null;
              if (valueCase_ == 5) {
                subBuilder = ((com.google.api.Distribution) value_).toBuilder();
              }
              value_ = input.readMessage(com.google.api.Distribution.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.api.Distribution) value_);
                value_ = subBuilder.buildPartial();
              }
              valueCase_ = 5;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TypedValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.TypedValue.class,
            com.google.monitoring.v3.TypedValue.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;

  public enum ValueCase implements com.google.protobuf.Internal.EnumLite {
    BOOL_VALUE(1),
    INT64_VALUE(2),
    DOUBLE_VALUE(3),
    STRING_VALUE(4),
    DISTRIBUTION_VALUE(5),
    VALUE_NOT_SET(0);
    private final int value;

    private ValueCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return BOOL_VALUE;
        case 2:
          return INT64_VALUE;
        case 3:
          return DOUBLE_VALUE;
        case 4:
          return STRING_VALUE;
        case 5:
          return DISTRIBUTION_VALUE;
        case 0:
          return VALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase getValueCase() {
    return ValueCase.forNumber(valueCase_);
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A Boolean value: `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   */
  public boolean getBoolValue() {
    if (valueCase_ == 1) {
      return (java.lang.Boolean) value_;
    }
    return false;
  }

  public static final int INT64_VALUE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   */
  public long getInt64Value() {
    if (valueCase_ == 2) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A 64-bit double-precision floating-point number. Its magnitude
   * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
   * significant digits of precision.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   */
  public double getDoubleValue() {
    if (valueCase_ == 3) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * A variable-length string value.
   * </pre>
   *
   * <code>string string_value = 4;</code>
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 4) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 4) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A variable-length string value.
   * </pre>
   *
   * <code>string string_value = 4;</code>
   */
  public com.google.protobuf.ByteString getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 4) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (valueCase_ == 4) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISTRIBUTION_VALUE_FIELD_NUMBER = 5;
  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   */
  public boolean hasDistributionValue() {
    return valueCase_ == 5;
  }
  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   */
  public com.google.api.Distribution getDistributionValue() {
    if (valueCase_ == 5) {
      return (com.google.api.Distribution) value_;
    }
    return com.google.api.Distribution.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   */
  public com.google.api.DistributionOrBuilder getDistributionValueOrBuilder() {
    if (valueCase_ == 5) {
      return (com.google.api.Distribution) value_;
    }
    return com.google.api.Distribution.getDefaultInstance();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeBool(1, (boolean) ((java.lang.Boolean) value_));
    }
    if (valueCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      output.writeDouble(3, (double) ((java.lang.Double) value_));
    }
    if (valueCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, value_);
    }
    if (valueCase_ == 5) {
      output.writeMessage(5, (com.google.api.Distribution) value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              1, (boolean) ((java.lang.Boolean) value_));
    }
    if (valueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              3, (double) ((java.lang.Double) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, value_);
    }
    if (valueCase_ == 5) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5, (com.google.api.Distribution) value_);
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
    if (!(obj instanceof com.google.monitoring.v3.TypedValue)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.TypedValue other = (com.google.monitoring.v3.TypedValue) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getBoolValue() != other.getBoolValue()) return false;
        break;
      case 2:
        if (getInt64Value() != other.getInt64Value()) return false;
        break;
      case 3:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(other.getDoubleValue())) return false;
        break;
      case 4:
        if (!getStringValue().equals(other.getStringValue())) return false;
        break;
      case 5:
        if (!getDistributionValue().equals(other.getDistributionValue())) return false;
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBoolValue());
        break;
      case 2:
        hash = (37 * hash) + INT64_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getInt64Value());
        break;
      case 3:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 4:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 5:
        hash = (37 * hash) + DISTRIBUTION_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getDistributionValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TypedValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TypedValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TypedValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.TypedValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A single strongly-typed value.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.TypedValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.TypedValue)
      com.google.monitoring.v3.TypedValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TypedValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.TypedValue.class,
              com.google.monitoring.v3.TypedValue.Builder.class);
    }

    // Construct using com.google.monitoring.v3.TypedValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TypedValue_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TypedValue getDefaultInstanceForType() {
      return com.google.monitoring.v3.TypedValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.TypedValue build() {
      com.google.monitoring.v3.TypedValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TypedValue buildPartial() {
      com.google.monitoring.v3.TypedValue result = new com.google.monitoring.v3.TypedValue(this);
      if (valueCase_ == 1) {
        result.value_ = value_;
      }
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        if (distributionValueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = distributionValueBuilder_.build();
        }
      }
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.TypedValue) {
        return mergeFrom((com.google.monitoring.v3.TypedValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.TypedValue other) {
      if (other == com.google.monitoring.v3.TypedValue.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case BOOL_VALUE:
          {
            setBoolValue(other.getBoolValue());
            break;
          }
        case INT64_VALUE:
          {
            setInt64Value(other.getInt64Value());
            break;
          }
        case DOUBLE_VALUE:
          {
            setDoubleValue(other.getDoubleValue());
            break;
          }
        case STRING_VALUE:
          {
            valueCase_ = 4;
            value_ = other.value_;
            onChanged();
            break;
          }
        case DISTRIBUTION_VALUE:
          {
            mergeDistributionValue(other.getDistributionValue());
            break;
          }
        case VALUE_NOT_SET:
          {
            break;
          }
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
      com.google.monitoring.v3.TypedValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.TypedValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int valueCase_ = 0;
    private java.lang.Object value_;

    public ValueCase getValueCase() {
      return ValueCase.forNumber(valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A Boolean value: `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     */
    public boolean getBoolValue() {
      if (valueCase_ == 1) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     *
     *
     * <pre>
     * A Boolean value: `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     */
    public Builder setBoolValue(boolean value) {
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Boolean value: `true` or `false`.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     */
    public Builder clearBoolValue() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     */
    public long getInt64Value() {
      if (valueCase_ == 2) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     */
    public Builder setInt64Value(long value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     */
    public Builder clearInt64Value() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A 64-bit double-precision floating-point number. Its magnitude
     * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
     * significant digits of precision.
     * </pre>
     *
     * <code>double double_value = 3;</code>
     */
    public double getDoubleValue() {
      if (valueCase_ == 3) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit double-precision floating-point number. Its magnitude
     * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
     * significant digits of precision.
     * </pre>
     *
     * <code>double double_value = 3;</code>
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A 64-bit double-precision floating-point number. Its magnitude
     * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
     * significant digits of precision.
     * </pre>
     *
     * <code>double double_value = 3;</code>
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A variable-length string value.
     * </pre>
     *
     * <code>string string_value = 4;</code>
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 4) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 4) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A variable-length string value.
     * </pre>
     *
     * <code>string string_value = 4;</code>
     */
    public com.google.protobuf.ByteString getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 4) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (valueCase_ == 4) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A variable-length string value.
     * </pre>
     *
     * <code>string string_value = 4;</code>
     */
    public Builder setStringValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A variable-length string value.
     * </pre>
     *
     * <code>string string_value = 4;</code>
     */
    public Builder clearStringValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A variable-length string value.
     * </pre>
     *
     * <code>string string_value = 4;</code>
     */
    public Builder setStringValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.Distribution,
            com.google.api.Distribution.Builder,
            com.google.api.DistributionOrBuilder>
        distributionValueBuilder_;
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public boolean hasDistributionValue() {
      return valueCase_ == 5;
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public com.google.api.Distribution getDistributionValue() {
      if (distributionValueBuilder_ == null) {
        if (valueCase_ == 5) {
          return (com.google.api.Distribution) value_;
        }
        return com.google.api.Distribution.getDefaultInstance();
      } else {
        if (valueCase_ == 5) {
          return distributionValueBuilder_.getMessage();
        }
        return com.google.api.Distribution.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public Builder setDistributionValue(com.google.api.Distribution value) {
      if (distributionValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        distributionValueBuilder_.setMessage(value);
      }
      valueCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public Builder setDistributionValue(com.google.api.Distribution.Builder builderForValue) {
      if (distributionValueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        distributionValueBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public Builder mergeDistributionValue(com.google.api.Distribution value) {
      if (distributionValueBuilder_ == null) {
        if (valueCase_ == 5 && value_ != com.google.api.Distribution.getDefaultInstance()) {
          value_ =
              com.google.api.Distribution.newBuilder((com.google.api.Distribution) value_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 5) {
          distributionValueBuilder_.mergeFrom(value);
        }
        distributionValueBuilder_.setMessage(value);
      }
      valueCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public Builder clearDistributionValue() {
      if (distributionValueBuilder_ == null) {
        if (valueCase_ == 5) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 5) {
          valueCase_ = 0;
          value_ = null;
        }
        distributionValueBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public com.google.api.Distribution.Builder getDistributionValueBuilder() {
      return getDistributionValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    public com.google.api.DistributionOrBuilder getDistributionValueOrBuilder() {
      if ((valueCase_ == 5) && (distributionValueBuilder_ != null)) {
        return distributionValueBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 5) {
          return (com.google.api.Distribution) value_;
        }
        return com.google.api.Distribution.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A distribution value.
     * </pre>
     *
     * <code>.google.api.Distribution distribution_value = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.Distribution,
            com.google.api.Distribution.Builder,
            com.google.api.DistributionOrBuilder>
        getDistributionValueFieldBuilder() {
      if (distributionValueBuilder_ == null) {
        if (!(valueCase_ == 5)) {
          value_ = com.google.api.Distribution.getDefaultInstance();
        }
        distributionValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.Distribution,
                com.google.api.Distribution.Builder,
                com.google.api.DistributionOrBuilder>(
                (com.google.api.Distribution) value_, getParentForChildren(), isClean());
        value_ = null;
      }
      valueCase_ = 5;
      onChanged();
      ;
      return distributionValueBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.TypedValue)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.TypedValue)
  private static final com.google.monitoring.v3.TypedValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.TypedValue();
  }

  public static com.google.monitoring.v3.TypedValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypedValue> PARSER =
      new com.google.protobuf.AbstractParser<TypedValue>() {
        @java.lang.Override
        public TypedValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TypedValue(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TypedValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypedValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.TypedValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
