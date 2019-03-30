// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Message for infoType-dependent details parsed from quote.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.QuoteInfo}
 */
public final class QuoteInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.QuoteInfo)
    QuoteInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QuoteInfo.newBuilder() to construct.
  private QuoteInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QuoteInfo() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private QuoteInfo(
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
          case 18:
            {
              com.google.privacy.dlp.v2.DateTime.Builder subBuilder = null;
              if (parsedQuoteCase_ == 2) {
                subBuilder = ((com.google.privacy.dlp.v2.DateTime) parsedQuote_).toBuilder();
              }
              parsedQuote_ =
                  input.readMessage(com.google.privacy.dlp.v2.DateTime.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.privacy.dlp.v2.DateTime) parsedQuote_);
                parsedQuote_ = subBuilder.buildPartial();
              }
              parsedQuoteCase_ = 2;
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
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_QuoteInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_QuoteInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.QuoteInfo.class,
            com.google.privacy.dlp.v2.QuoteInfo.Builder.class);
  }

  private int parsedQuoteCase_ = 0;
  private java.lang.Object parsedQuote_;

  public enum ParsedQuoteCase implements com.google.protobuf.Internal.EnumLite {
    DATE_TIME(2),
    PARSEDQUOTE_NOT_SET(0);
    private final int value;

    private ParsedQuoteCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static ParsedQuoteCase valueOf(int value) {
      return forNumber(value);
    }

    public static ParsedQuoteCase forNumber(int value) {
      switch (value) {
        case 2:
          return DATE_TIME;
        case 0:
          return PARSEDQUOTE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ParsedQuoteCase getParsedQuoteCase() {
    return ParsedQuoteCase.forNumber(parsedQuoteCase_);
  }

  public static final int DATE_TIME_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  public boolean hasDateTime() {
    return parsedQuoteCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  public com.google.privacy.dlp.v2.DateTime getDateTime() {
    if (parsedQuoteCase_ == 2) {
      return (com.google.privacy.dlp.v2.DateTime) parsedQuote_;
    }
    return com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  public com.google.privacy.dlp.v2.DateTimeOrBuilder getDateTimeOrBuilder() {
    if (parsedQuoteCase_ == 2) {
      return (com.google.privacy.dlp.v2.DateTime) parsedQuote_;
    }
    return com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
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
    if (parsedQuoteCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2.DateTime) parsedQuote_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parsedQuoteCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.privacy.dlp.v2.DateTime) parsedQuote_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.QuoteInfo)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.QuoteInfo other = (com.google.privacy.dlp.v2.QuoteInfo) obj;

    if (!getParsedQuoteCase().equals(other.getParsedQuoteCase())) return false;
    switch (parsedQuoteCase_) {
      case 2:
        if (!getDateTime().equals(other.getDateTime())) return false;
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
    switch (parsedQuoteCase_) {
      case 2:
        hash = (37 * hash) + DATE_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getDateTime().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.QuoteInfo parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.QuoteInfo prototype) {
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
   * Message for infoType-dependent details parsed from quote.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.QuoteInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.QuoteInfo)
      com.google.privacy.dlp.v2.QuoteInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_QuoteInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_QuoteInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.QuoteInfo.class,
              com.google.privacy.dlp.v2.QuoteInfo.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.QuoteInfo.newBuilder()
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
      parsedQuoteCase_ = 0;
      parsedQuote_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_QuoteInfo_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.QuoteInfo getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.QuoteInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.QuoteInfo build() {
      com.google.privacy.dlp.v2.QuoteInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.QuoteInfo buildPartial() {
      com.google.privacy.dlp.v2.QuoteInfo result = new com.google.privacy.dlp.v2.QuoteInfo(this);
      if (parsedQuoteCase_ == 2) {
        if (dateTimeBuilder_ == null) {
          result.parsedQuote_ = parsedQuote_;
        } else {
          result.parsedQuote_ = dateTimeBuilder_.build();
        }
      }
      result.parsedQuoteCase_ = parsedQuoteCase_;
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
      if (other instanceof com.google.privacy.dlp.v2.QuoteInfo) {
        return mergeFrom((com.google.privacy.dlp.v2.QuoteInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.QuoteInfo other) {
      if (other == com.google.privacy.dlp.v2.QuoteInfo.getDefaultInstance()) return this;
      switch (other.getParsedQuoteCase()) {
        case DATE_TIME:
          {
            mergeDateTime(other.getDateTime());
            break;
          }
        case PARSEDQUOTE_NOT_SET:
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
      com.google.privacy.dlp.v2.QuoteInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.QuoteInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int parsedQuoteCase_ = 0;
    private java.lang.Object parsedQuote_;

    public ParsedQuoteCase getParsedQuoteCase() {
      return ParsedQuoteCase.forNumber(parsedQuoteCase_);
    }

    public Builder clearParsedQuote() {
      parsedQuoteCase_ = 0;
      parsedQuote_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DateTime,
            com.google.privacy.dlp.v2.DateTime.Builder,
            com.google.privacy.dlp.v2.DateTimeOrBuilder>
        dateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public boolean hasDateTime() {
      return parsedQuoteCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public com.google.privacy.dlp.v2.DateTime getDateTime() {
      if (dateTimeBuilder_ == null) {
        if (parsedQuoteCase_ == 2) {
          return (com.google.privacy.dlp.v2.DateTime) parsedQuote_;
        }
        return com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
      } else {
        if (parsedQuoteCase_ == 2) {
          return dateTimeBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public Builder setDateTime(com.google.privacy.dlp.v2.DateTime value) {
      if (dateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parsedQuote_ = value;
        onChanged();
      } else {
        dateTimeBuilder_.setMessage(value);
      }
      parsedQuoteCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public Builder setDateTime(com.google.privacy.dlp.v2.DateTime.Builder builderForValue) {
      if (dateTimeBuilder_ == null) {
        parsedQuote_ = builderForValue.build();
        onChanged();
      } else {
        dateTimeBuilder_.setMessage(builderForValue.build());
      }
      parsedQuoteCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public Builder mergeDateTime(com.google.privacy.dlp.v2.DateTime value) {
      if (dateTimeBuilder_ == null) {
        if (parsedQuoteCase_ == 2
            && parsedQuote_ != com.google.privacy.dlp.v2.DateTime.getDefaultInstance()) {
          parsedQuote_ =
              com.google.privacy.dlp.v2.DateTime.newBuilder(
                      (com.google.privacy.dlp.v2.DateTime) parsedQuote_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          parsedQuote_ = value;
        }
        onChanged();
      } else {
        if (parsedQuoteCase_ == 2) {
          dateTimeBuilder_.mergeFrom(value);
        }
        dateTimeBuilder_.setMessage(value);
      }
      parsedQuoteCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public Builder clearDateTime() {
      if (dateTimeBuilder_ == null) {
        if (parsedQuoteCase_ == 2) {
          parsedQuoteCase_ = 0;
          parsedQuote_ = null;
          onChanged();
        }
      } else {
        if (parsedQuoteCase_ == 2) {
          parsedQuoteCase_ = 0;
          parsedQuote_ = null;
        }
        dateTimeBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public com.google.privacy.dlp.v2.DateTime.Builder getDateTimeBuilder() {
      return getDateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    public com.google.privacy.dlp.v2.DateTimeOrBuilder getDateTimeOrBuilder() {
      if ((parsedQuoteCase_ == 2) && (dateTimeBuilder_ != null)) {
        return dateTimeBuilder_.getMessageOrBuilder();
      } else {
        if (parsedQuoteCase_ == 2) {
          return (com.google.privacy.dlp.v2.DateTime) parsedQuote_;
        }
        return com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The date time indicated by the quote.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DateTime,
            com.google.privacy.dlp.v2.DateTime.Builder,
            com.google.privacy.dlp.v2.DateTimeOrBuilder>
        getDateTimeFieldBuilder() {
      if (dateTimeBuilder_ == null) {
        if (!(parsedQuoteCase_ == 2)) {
          parsedQuote_ = com.google.privacy.dlp.v2.DateTime.getDefaultInstance();
        }
        dateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DateTime,
                com.google.privacy.dlp.v2.DateTime.Builder,
                com.google.privacy.dlp.v2.DateTimeOrBuilder>(
                (com.google.privacy.dlp.v2.DateTime) parsedQuote_,
                getParentForChildren(),
                isClean());
        parsedQuote_ = null;
      }
      parsedQuoteCase_ = 2;
      onChanged();
      ;
      return dateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.QuoteInfo)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.QuoteInfo)
  private static final com.google.privacy.dlp.v2.QuoteInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.QuoteInfo();
  }

  public static com.google.privacy.dlp.v2.QuoteInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuoteInfo> PARSER =
      new com.google.protobuf.AbstractParser<QuoteInfo>() {
        @java.lang.Override
        public QuoteInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new QuoteInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<QuoteInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuoteInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.QuoteInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
