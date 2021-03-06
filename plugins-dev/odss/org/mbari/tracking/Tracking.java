// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tracking.proto

package org.mbari.tracking;

public final class Tracking {
  private Tracking() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlatformReportOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .org.mbari.tracking.PlatformReport.PlatformType type = 1;
    boolean hasType();
    org.mbari.tracking.Tracking.PlatformReport.PlatformType getType();
    
    // optional string name = 2;
    boolean hasName();
    String getName();
    
    // optional double epoch_seconds = 3;
    boolean hasEpochSeconds();
    double getEpochSeconds();
    
    // optional double latitude = 4;
    boolean hasLatitude();
    double getLatitude();
    
    // optional double longitude = 5;
    boolean hasLongitude();
    double getLongitude();
    
    // optional string source = 6;
    boolean hasSource();
    String getSource();
    
    // optional uint64 mmsi = 7;
    boolean hasMmsi();
    long getMmsi();
    
    // optional uint64 imei = 8;
    boolean hasImei();
    long getImei();
    
    // optional string iso_datetime = 9;
    boolean hasIsoDatetime();
    String getIsoDatetime();
  }
  public static final class PlatformReport extends
      com.google.protobuf.GeneratedMessage
      implements PlatformReportOrBuilder {
    // Use PlatformReport.newBuilder() to construct.
    private PlatformReport(Builder builder) {
      super(builder);
    }
    private PlatformReport(boolean noInit) {}
    
    private static final PlatformReport defaultInstance;
    public static PlatformReport getDefaultInstance() {
      return defaultInstance;
    }
    
    public PlatformReport getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mbari.tracking.Tracking.internal_static_org_mbari_tracking_PlatformReport_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mbari.tracking.Tracking.internal_static_org_mbari_tracking_PlatformReport_fieldAccessorTable;
    }
    
    public enum PlatformType
        implements com.google.protobuf.ProtocolMessageEnum {
      MBARI_SHIP(0, 0),
      AIS(1, 1),
      AUV(2, 2),
      DRIFTER(3, 3),
      MOORING(4, 4),
      GLIDER(5, 5),
      ;
      
      public static final int MBARI_SHIP_VALUE = 0;
      public static final int AIS_VALUE = 1;
      public static final int AUV_VALUE = 2;
      public static final int DRIFTER_VALUE = 3;
      public static final int MOORING_VALUE = 4;
      public static final int GLIDER_VALUE = 5;
      
      
      public final int getNumber() { return value; }
      
      public static PlatformType valueOf(int value) {
        switch (value) {
          case 0: return MBARI_SHIP;
          case 1: return AIS;
          case 2: return AUV;
          case 3: return DRIFTER;
          case 4: return MOORING;
          case 5: return GLIDER;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<PlatformType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<PlatformType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PlatformType>() {
              public PlatformType findValueByNumber(int number) {
                return PlatformType.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.mbari.tracking.Tracking.PlatformReport.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final PlatformType[] VALUES = {
        MBARI_SHIP, AIS, AUV, DRIFTER, MOORING, GLIDER, 
      };
      
      public static PlatformType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private PlatformType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:org.mbari.tracking.PlatformReport.PlatformType)
    }
    
    private int bitField0_;
    // optional .org.mbari.tracking.PlatformReport.PlatformType type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private org.mbari.tracking.Tracking.PlatformReport.PlatformType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public org.mbari.tracking.Tracking.PlatformReport.PlatformType getType() {
      return type_;
    }
    
    // optional string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional double epoch_seconds = 3;
    public static final int EPOCH_SECONDS_FIELD_NUMBER = 3;
    private double epochSeconds_;
    public boolean hasEpochSeconds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public double getEpochSeconds() {
      return epochSeconds_;
    }
    
    // optional double latitude = 4;
    public static final int LATITUDE_FIELD_NUMBER = 4;
    private double latitude_;
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public double getLatitude() {
      return latitude_;
    }
    
    // optional double longitude = 5;
    public static final int LONGITUDE_FIELD_NUMBER = 5;
    private double longitude_;
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public double getLongitude() {
      return longitude_;
    }
    
    // optional string source = 6;
    public static final int SOURCE_FIELD_NUMBER = 6;
    private java.lang.Object source_;
    public boolean hasSource() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          source_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional uint64 mmsi = 7;
    public static final int MMSI_FIELD_NUMBER = 7;
    private long mmsi_;
    public boolean hasMmsi() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public long getMmsi() {
      return mmsi_;
    }
    
    // optional uint64 imei = 8;
    public static final int IMEI_FIELD_NUMBER = 8;
    private long imei_;
    public boolean hasImei() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public long getImei() {
      return imei_;
    }
    
    // optional string iso_datetime = 9;
    public static final int ISO_DATETIME_FIELD_NUMBER = 9;
    private java.lang.Object isoDatetime_;
    public boolean hasIsoDatetime() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public String getIsoDatetime() {
      java.lang.Object ref = isoDatetime_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          isoDatetime_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIsoDatetimeBytes() {
      java.lang.Object ref = isoDatetime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        isoDatetime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      type_ = org.mbari.tracking.Tracking.PlatformReport.PlatformType.MBARI_SHIP;
      name_ = "";
      epochSeconds_ = 0D;
      latitude_ = 0D;
      longitude_ = 0D;
      source_ = "";
      mmsi_ = 0L;
      imei_ = 0L;
      isoDatetime_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, epochSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, latitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, longitude_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getSourceBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(7, mmsi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeUInt64(8, imei_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, getIsoDatetimeBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, epochSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, latitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, longitude_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getSourceBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, mmsi_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, imei_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getIsoDatetimeBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.mbari.tracking.Tracking.PlatformReport parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.mbari.tracking.Tracking.PlatformReport prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.mbari.tracking.Tracking.PlatformReportOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.mbari.tracking.Tracking.internal_static_org_mbari_tracking_PlatformReport_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.mbari.tracking.Tracking.internal_static_org_mbari_tracking_PlatformReport_fieldAccessorTable;
      }
      
      // Construct using org.mbari.tracking.Tracking.PlatformReport.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = org.mbari.tracking.Tracking.PlatformReport.PlatformType.MBARI_SHIP;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        epochSeconds_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        latitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        longitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        source_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        mmsi_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        imei_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        isoDatetime_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.mbari.tracking.Tracking.PlatformReport.getDescriptor();
      }
      
      public org.mbari.tracking.Tracking.PlatformReport getDefaultInstanceForType() {
        return org.mbari.tracking.Tracking.PlatformReport.getDefaultInstance();
      }
      
      public org.mbari.tracking.Tracking.PlatformReport build() {
        org.mbari.tracking.Tracking.PlatformReport result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.mbari.tracking.Tracking.PlatformReport buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.mbari.tracking.Tracking.PlatformReport result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.mbari.tracking.Tracking.PlatformReport buildPartial() {
        org.mbari.tracking.Tracking.PlatformReport result = new org.mbari.tracking.Tracking.PlatformReport(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.epochSeconds_ = epochSeconds_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.latitude_ = latitude_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.longitude_ = longitude_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.mmsi_ = mmsi_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.imei_ = imei_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.isoDatetime_ = isoDatetime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.mbari.tracking.Tracking.PlatformReport) {
          return mergeFrom((org.mbari.tracking.Tracking.PlatformReport)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.mbari.tracking.Tracking.PlatformReport other) {
        if (other == org.mbari.tracking.Tracking.PlatformReport.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasEpochSeconds()) {
          setEpochSeconds(other.getEpochSeconds());
        }
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasMmsi()) {
          setMmsi(other.getMmsi());
        }
        if (other.hasImei()) {
          setImei(other.getImei());
        }
        if (other.hasIsoDatetime()) {
          setIsoDatetime(other.getIsoDatetime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              org.mbari.tracking.Tracking.PlatformReport.PlatformType value = org.mbari.tracking.Tracking.PlatformReport.PlatformType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              epochSeconds_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              latitude_ = input.readDouble();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              longitude_ = input.readDouble();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              source_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              mmsi_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              imei_ = input.readUInt64();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              isoDatetime_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .org.mbari.tracking.PlatformReport.PlatformType type = 1;
      private org.mbari.tracking.Tracking.PlatformReport.PlatformType type_ = org.mbari.tracking.Tracking.PlatformReport.PlatformType.MBARI_SHIP;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public org.mbari.tracking.Tracking.PlatformReport.PlatformType getType() {
        return type_;
      }
      public Builder setType(org.mbari.tracking.Tracking.PlatformReport.PlatformType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = org.mbari.tracking.Tracking.PlatformReport.PlatformType.MBARI_SHIP;
        onChanged();
        return this;
      }
      
      // optional string name = 2;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
      }
      
      // optional double epoch_seconds = 3;
      private double epochSeconds_ ;
      public boolean hasEpochSeconds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public double getEpochSeconds() {
        return epochSeconds_;
      }
      public Builder setEpochSeconds(double value) {
        bitField0_ |= 0x00000004;
        epochSeconds_ = value;
        onChanged();
        return this;
      }
      public Builder clearEpochSeconds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        epochSeconds_ = 0D;
        onChanged();
        return this;
      }
      
      // optional double latitude = 4;
      private double latitude_ ;
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public double getLatitude() {
        return latitude_;
      }
      public Builder setLatitude(double value) {
        bitField0_ |= 0x00000008;
        latitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000008);
        latitude_ = 0D;
        onChanged();
        return this;
      }
      
      // optional double longitude = 5;
      private double longitude_ ;
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public double getLongitude() {
        return longitude_;
      }
      public Builder setLongitude(double value) {
        bitField0_ |= 0x00000010;
        longitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000010);
        longitude_ = 0D;
        onChanged();
        return this;
      }
      
      // optional string source = 6;
      private java.lang.Object source_ = "";
      public boolean hasSource() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSource(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        source_ = value;
        onChanged();
        return this;
      }
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000020);
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      void setSource(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        source_ = value;
        onChanged();
      }
      
      // optional uint64 mmsi = 7;
      private long mmsi_ ;
      public boolean hasMmsi() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public long getMmsi() {
        return mmsi_;
      }
      public Builder setMmsi(long value) {
        bitField0_ |= 0x00000040;
        mmsi_ = value;
        onChanged();
        return this;
      }
      public Builder clearMmsi() {
        bitField0_ = (bitField0_ & ~0x00000040);
        mmsi_ = 0L;
        onChanged();
        return this;
      }
      
      // optional uint64 imei = 8;
      private long imei_ ;
      public boolean hasImei() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public long getImei() {
        return imei_;
      }
      public Builder setImei(long value) {
        bitField0_ |= 0x00000080;
        imei_ = value;
        onChanged();
        return this;
      }
      public Builder clearImei() {
        bitField0_ = (bitField0_ & ~0x00000080);
        imei_ = 0L;
        onChanged();
        return this;
      }
      
      // optional string iso_datetime = 9;
      private java.lang.Object isoDatetime_ = "";
      public boolean hasIsoDatetime() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public String getIsoDatetime() {
        java.lang.Object ref = isoDatetime_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          isoDatetime_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIsoDatetime(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        isoDatetime_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsoDatetime() {
        bitField0_ = (bitField0_ & ~0x00000100);
        isoDatetime_ = getDefaultInstance().getIsoDatetime();
        onChanged();
        return this;
      }
      void setIsoDatetime(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000100;
        isoDatetime_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:org.mbari.tracking.PlatformReport)
    }
    
    static {
      defaultInstance = new PlatformReport(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.mbari.tracking.PlatformReport)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_mbari_tracking_PlatformReport_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_mbari_tracking_PlatformReport_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016tracking.proto\022\022org.mbari.tracking\"\263\002\n" +
      "\016PlatformReport\022=\n\004type\030\001 \001(\0162/.org.mbar" +
      "i.tracking.PlatformReport.PlatformType\022\014" +
      "\n\004name\030\002 \001(\t\022\025\n\repoch_seconds\030\003 \001(\001\022\020\n\010l" +
      "atitude\030\004 \001(\001\022\021\n\tlongitude\030\005 \001(\001\022\016\n\006sour" +
      "ce\030\006 \001(\t\022\014\n\004mmsi\030\007 \001(\004\022\014\n\004imei\030\010 \001(\004\022\024\n\014" +
      "iso_datetime\030\t \001(\t\"V\n\014PlatformType\022\016\n\nMB" +
      "ARI_SHIP\020\000\022\007\n\003AIS\020\001\022\007\n\003AUV\020\002\022\013\n\007DRIFTER\020" +
      "\003\022\013\n\007MOORING\020\004\022\n\n\006GLIDER\020\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_mbari_tracking_PlatformReport_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_mbari_tracking_PlatformReport_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_mbari_tracking_PlatformReport_descriptor,
              new java.lang.String[] { "Type", "Name", "EpochSeconds", "Latitude", "Longitude", "Source", "Mmsi", "Imei", "IsoDatetime", },
              org.mbari.tracking.Tracking.PlatformReport.class,
              org.mbari.tracking.Tracking.PlatformReport.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
