/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A label value.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.LabelValue}
 */
public final class LabelValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.LabelValue)
    LabelValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LabelValue.newBuilder() to construct.
  private LabelValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LabelValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LabelValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LabelValue(
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
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 3;
              value_ = s;
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
    return com.google.monitoring.v3.MetricProto
        .internal_static_google_monitoring_v3_LabelValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricProto
        .internal_static_google_monitoring_v3_LabelValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.LabelValue.class,
            com.google.monitoring.v3.LabelValue.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;

  public enum ValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOOL_VALUE(1),
    INT64_VALUE(2),
    STRING_VALUE(3),
    VALUE_NOT_SET(0);
    private final int value;

    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
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
          return STRING_VALUE;
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
   * A bool label value.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   *
   * @return The boolValue.
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
   * An int64 label value.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   *
   * @return The int64Value.
   */
  public long getInt64Value() {
    if (valueCase_ == 2) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * A string label value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 3) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A string label value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (valueCase_ == 3) {
        value_ = b;
      }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (valueCase_ == 1) {
      output.writeBool(1, (boolean) ((java.lang.Boolean) value_));
    }
    if (valueCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
    if (!(obj instanceof com.google.monitoring.v3.LabelValue)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.LabelValue other = (com.google.monitoring.v3.LabelValue) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getBoolValue() != other.getBoolValue()) return false;
        break;
      case 2:
        if (getInt64Value() != other.getInt64Value()) return false;
        break;
      case 3:
        if (!getStringValue().equals(other.getStringValue())) return false;
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
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.LabelValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.LabelValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.LabelValue parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.LabelValue prototype) {
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
   * A label value.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.LabelValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.LabelValue)
      com.google.monitoring.v3.LabelValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_LabelValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_LabelValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.LabelValue.class,
              com.google.monitoring.v3.LabelValue.Builder.class);
    }

    // Construct using com.google.monitoring.v3.LabelValue.newBuilder()
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
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_LabelValue_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.LabelValue getDefaultInstanceForType() {
      return com.google.monitoring.v3.LabelValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.LabelValue build() {
      com.google.monitoring.v3.LabelValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.LabelValue buildPartial() {
      com.google.monitoring.v3.LabelValue result = new com.google.monitoring.v3.LabelValue(this);
      if (valueCase_ == 1) {
        result.value_ = value_;
      }
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
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
      if (other instanceof com.google.monitoring.v3.LabelValue) {
        return mergeFrom((com.google.monitoring.v3.LabelValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.LabelValue other) {
      if (other == com.google.monitoring.v3.LabelValue.getDefaultInstance()) return this;
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
        case STRING_VALUE:
          {
            valueCase_ = 3;
            value_ = other.value_;
            onChanged();
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
      com.google.monitoring.v3.LabelValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.LabelValue) e.getUnfinishedMessage();
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
     * A bool label value.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     *
     * @return The boolValue.
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
     * A bool label value.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     *
     * @param value The boolValue to set.
     * @return This builder for chaining.
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
     * A bool label value.
     * </pre>
     *
     * <code>bool bool_value = 1;</code>
     *
     * @return This builder for chaining.
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
     * An int64 label value.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     *
     * @return The int64Value.
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
     * An int64 label value.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     *
     * @param value The int64Value to set.
     * @return This builder for chaining.
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
     * An int64 label value.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     *
     * @return This builder for chaining.
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
     * A string label value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     *
     * @return The stringValue.
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 3) {
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
     * A string label value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     *
     * @return The bytes for stringValue.
     */
    public com.google.protobuf.ByteString getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (valueCase_ == 3) {
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
     * A string label value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     *
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A string label value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
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
     * A string label value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     *
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.LabelValue)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.LabelValue)
  private static final com.google.monitoring.v3.LabelValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.LabelValue();
  }

  public static com.google.monitoring.v3.LabelValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelValue> PARSER =
      new com.google.protobuf.AbstractParser<LabelValue>() {
        @java.lang.Override
        public LabelValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LabelValue(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LabelValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.LabelValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}