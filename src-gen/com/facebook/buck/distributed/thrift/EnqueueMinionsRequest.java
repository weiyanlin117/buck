/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class EnqueueMinionsRequest implements org.apache.thrift.TBase<EnqueueMinionsRequest, EnqueueMinionsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<EnqueueMinionsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EnqueueMinionsRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MINION_QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("minionQueue", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_MINIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("numberOfMinions", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MINION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("minionType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField BUILD_LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("buildLabel", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField REGION_FIELD_DESC = new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EnqueueMinionsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EnqueueMinionsRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable StampedeId stampedeId; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String minionQueue; // optional
  public int numberOfMinions; // optional
  /**
   * 
   * @see MinionType
   */
  public @org.apache.thrift.annotation.Nullable MinionType minionType; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String buildLabel; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String region; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    MINION_QUEUE((short)2, "minionQueue"),
    NUMBER_OF_MINIONS((short)3, "numberOfMinions"),
    /**
     * 
     * @see MinionType
     */
    MINION_TYPE((short)4, "minionType"),
    BUILD_LABEL((short)5, "buildLabel"),
    REGION((short)6, "region");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // MINION_QUEUE
          return MINION_QUEUE;
        case 3: // NUMBER_OF_MINIONS
          return NUMBER_OF_MINIONS;
        case 4: // MINION_TYPE
          return MINION_TYPE;
        case 5: // BUILD_LABEL
          return BUILD_LABEL;
        case 6: // REGION
          return REGION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUMBEROFMINIONS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.MINION_QUEUE,_Fields.NUMBER_OF_MINIONS,_Fields.MINION_TYPE,_Fields.BUILD_LABEL,_Fields.REGION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.MINION_QUEUE, new org.apache.thrift.meta_data.FieldMetaData("minionQueue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER_OF_MINIONS, new org.apache.thrift.meta_data.FieldMetaData("numberOfMinions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MINION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("minionType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MinionType.class)));
    tmpMap.put(_Fields.BUILD_LABEL, new org.apache.thrift.meta_data.FieldMetaData("buildLabel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REGION, new org.apache.thrift.meta_data.FieldMetaData("region", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EnqueueMinionsRequest.class, metaDataMap);
  }

  public EnqueueMinionsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EnqueueMinionsRequest(EnqueueMinionsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetMinionQueue()) {
      this.minionQueue = other.minionQueue;
    }
    this.numberOfMinions = other.numberOfMinions;
    if (other.isSetMinionType()) {
      this.minionType = other.minionType;
    }
    if (other.isSetBuildLabel()) {
      this.buildLabel = other.buildLabel;
    }
    if (other.isSetRegion()) {
      this.region = other.region;
    }
  }

  public EnqueueMinionsRequest deepCopy() {
    return new EnqueueMinionsRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.minionQueue = null;
    setNumberOfMinionsIsSet(false);
    this.numberOfMinions = 0;
    this.minionType = null;
    this.buildLabel = null;
    this.region = null;
  }

  @org.apache.thrift.annotation.Nullable
  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public EnqueueMinionsRequest setStampedeId(@org.apache.thrift.annotation.Nullable StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMinionQueue() {
    return this.minionQueue;
  }

  public EnqueueMinionsRequest setMinionQueue(@org.apache.thrift.annotation.Nullable java.lang.String minionQueue) {
    this.minionQueue = minionQueue;
    return this;
  }

  public void unsetMinionQueue() {
    this.minionQueue = null;
  }

  /** Returns true if field minionQueue is set (has been assigned a value) and false otherwise */
  public boolean isSetMinionQueue() {
    return this.minionQueue != null;
  }

  public void setMinionQueueIsSet(boolean value) {
    if (!value) {
      this.minionQueue = null;
    }
  }

  public int getNumberOfMinions() {
    return this.numberOfMinions;
  }

  public EnqueueMinionsRequest setNumberOfMinions(int numberOfMinions) {
    this.numberOfMinions = numberOfMinions;
    setNumberOfMinionsIsSet(true);
    return this;
  }

  public void unsetNumberOfMinions() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  /** Returns true if field numberOfMinions is set (has been assigned a value) and false otherwise */
  public boolean isSetNumberOfMinions() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  public void setNumberOfMinionsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID, value);
  }

  /**
   * 
   * @see MinionType
   */
  @org.apache.thrift.annotation.Nullable
  public MinionType getMinionType() {
    return this.minionType;
  }

  /**
   * 
   * @see MinionType
   */
  public EnqueueMinionsRequest setMinionType(@org.apache.thrift.annotation.Nullable MinionType minionType) {
    this.minionType = minionType;
    return this;
  }

  public void unsetMinionType() {
    this.minionType = null;
  }

  /** Returns true if field minionType is set (has been assigned a value) and false otherwise */
  public boolean isSetMinionType() {
    return this.minionType != null;
  }

  public void setMinionTypeIsSet(boolean value) {
    if (!value) {
      this.minionType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBuildLabel() {
    return this.buildLabel;
  }

  public EnqueueMinionsRequest setBuildLabel(@org.apache.thrift.annotation.Nullable java.lang.String buildLabel) {
    this.buildLabel = buildLabel;
    return this;
  }

  public void unsetBuildLabel() {
    this.buildLabel = null;
  }

  /** Returns true if field buildLabel is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildLabel() {
    return this.buildLabel != null;
  }

  public void setBuildLabelIsSet(boolean value) {
    if (!value) {
      this.buildLabel = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRegion() {
    return this.region;
  }

  public EnqueueMinionsRequest setRegion(@org.apache.thrift.annotation.Nullable java.lang.String region) {
    this.region = region;
    return this;
  }

  public void unsetRegion() {
    this.region = null;
  }

  /** Returns true if field region is set (has been assigned a value) and false otherwise */
  public boolean isSetRegion() {
    return this.region != null;
  }

  public void setRegionIsSet(boolean value) {
    if (!value) {
      this.region = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case MINION_QUEUE:
      if (value == null) {
        unsetMinionQueue();
      } else {
        setMinionQueue((java.lang.String)value);
      }
      break;

    case NUMBER_OF_MINIONS:
      if (value == null) {
        unsetNumberOfMinions();
      } else {
        setNumberOfMinions((java.lang.Integer)value);
      }
      break;

    case MINION_TYPE:
      if (value == null) {
        unsetMinionType();
      } else {
        setMinionType((MinionType)value);
      }
      break;

    case BUILD_LABEL:
      if (value == null) {
        unsetBuildLabel();
      } else {
        setBuildLabel((java.lang.String)value);
      }
      break;

    case REGION:
      if (value == null) {
        unsetRegion();
      } else {
        setRegion((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case MINION_QUEUE:
      return getMinionQueue();

    case NUMBER_OF_MINIONS:
      return getNumberOfMinions();

    case MINION_TYPE:
      return getMinionType();

    case BUILD_LABEL:
      return getBuildLabel();

    case REGION:
      return getRegion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case MINION_QUEUE:
      return isSetMinionQueue();
    case NUMBER_OF_MINIONS:
      return isSetNumberOfMinions();
    case MINION_TYPE:
      return isSetMinionType();
    case BUILD_LABEL:
      return isSetBuildLabel();
    case REGION:
      return isSetRegion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EnqueueMinionsRequest)
      return this.equals((EnqueueMinionsRequest)that);
    return false;
  }

  public boolean equals(EnqueueMinionsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_minionQueue = true && this.isSetMinionQueue();
    boolean that_present_minionQueue = true && that.isSetMinionQueue();
    if (this_present_minionQueue || that_present_minionQueue) {
      if (!(this_present_minionQueue && that_present_minionQueue))
        return false;
      if (!this.minionQueue.equals(that.minionQueue))
        return false;
    }

    boolean this_present_numberOfMinions = true && this.isSetNumberOfMinions();
    boolean that_present_numberOfMinions = true && that.isSetNumberOfMinions();
    if (this_present_numberOfMinions || that_present_numberOfMinions) {
      if (!(this_present_numberOfMinions && that_present_numberOfMinions))
        return false;
      if (this.numberOfMinions != that.numberOfMinions)
        return false;
    }

    boolean this_present_minionType = true && this.isSetMinionType();
    boolean that_present_minionType = true && that.isSetMinionType();
    if (this_present_minionType || that_present_minionType) {
      if (!(this_present_minionType && that_present_minionType))
        return false;
      if (!this.minionType.equals(that.minionType))
        return false;
    }

    boolean this_present_buildLabel = true && this.isSetBuildLabel();
    boolean that_present_buildLabel = true && that.isSetBuildLabel();
    if (this_present_buildLabel || that_present_buildLabel) {
      if (!(this_present_buildLabel && that_present_buildLabel))
        return false;
      if (!this.buildLabel.equals(that.buildLabel))
        return false;
    }

    boolean this_present_region = true && this.isSetRegion();
    boolean that_present_region = true && that.isSetRegion();
    if (this_present_region || that_present_region) {
      if (!(this_present_region && that_present_region))
        return false;
      if (!this.region.equals(that.region))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStampedeId()) ? 131071 : 524287);
    if (isSetStampedeId())
      hashCode = hashCode * 8191 + stampedeId.hashCode();

    hashCode = hashCode * 8191 + ((isSetMinionQueue()) ? 131071 : 524287);
    if (isSetMinionQueue())
      hashCode = hashCode * 8191 + minionQueue.hashCode();

    hashCode = hashCode * 8191 + ((isSetNumberOfMinions()) ? 131071 : 524287);
    if (isSetNumberOfMinions())
      hashCode = hashCode * 8191 + numberOfMinions;

    hashCode = hashCode * 8191 + ((isSetMinionType()) ? 131071 : 524287);
    if (isSetMinionType())
      hashCode = hashCode * 8191 + minionType.getValue();

    hashCode = hashCode * 8191 + ((isSetBuildLabel()) ? 131071 : 524287);
    if (isSetBuildLabel())
      hashCode = hashCode * 8191 + buildLabel.hashCode();

    hashCode = hashCode * 8191 + ((isSetRegion()) ? 131071 : 524287);
    if (isSetRegion())
      hashCode = hashCode * 8191 + region.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(EnqueueMinionsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMinionQueue()).compareTo(other.isSetMinionQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinionQueue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minionQueue, other.minionQueue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNumberOfMinions()).compareTo(other.isSetNumberOfMinions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumberOfMinions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numberOfMinions, other.numberOfMinions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMinionType()).compareTo(other.isSetMinionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minionType, other.minionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuildLabel()).compareTo(other.isSetBuildLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildLabel, other.buildLabel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRegion()).compareTo(other.isSetRegion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.region, other.region);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EnqueueMinionsRequest(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetMinionQueue()) {
      if (!first) sb.append(", ");
      sb.append("minionQueue:");
      if (this.minionQueue == null) {
        sb.append("null");
      } else {
        sb.append(this.minionQueue);
      }
      first = false;
    }
    if (isSetNumberOfMinions()) {
      if (!first) sb.append(", ");
      sb.append("numberOfMinions:");
      sb.append(this.numberOfMinions);
      first = false;
    }
    if (isSetMinionType()) {
      if (!first) sb.append(", ");
      sb.append("minionType:");
      if (this.minionType == null) {
        sb.append("null");
      } else {
        sb.append(this.minionType);
      }
      first = false;
    }
    if (isSetBuildLabel()) {
      if (!first) sb.append(", ");
      sb.append("buildLabel:");
      if (this.buildLabel == null) {
        sb.append("null");
      } else {
        sb.append(this.buildLabel);
      }
      first = false;
    }
    if (isSetRegion()) {
      if (!first) sb.append(", ");
      sb.append("region:");
      if (this.region == null) {
        sb.append("null");
      } else {
        sb.append(this.region);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EnqueueMinionsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EnqueueMinionsRequestStandardScheme getScheme() {
      return new EnqueueMinionsRequestStandardScheme();
    }
  }

  private static class EnqueueMinionsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<EnqueueMinionsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MINION_QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.minionQueue = iprot.readString();
              struct.setMinionQueueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUMBER_OF_MINIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numberOfMinions = iprot.readI32();
              struct.setNumberOfMinionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MINION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.minionType = com.facebook.buck.distributed.thrift.MinionType.findByValue(iprot.readI32());
              struct.setMinionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BUILD_LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buildLabel = iprot.readString();
              struct.setBuildLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REGION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.region = iprot.readString();
              struct.setRegionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.minionQueue != null) {
        if (struct.isSetMinionQueue()) {
          oprot.writeFieldBegin(MINION_QUEUE_FIELD_DESC);
          oprot.writeString(struct.minionQueue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeFieldBegin(NUMBER_OF_MINIONS_FIELD_DESC);
        oprot.writeI32(struct.numberOfMinions);
        oprot.writeFieldEnd();
      }
      if (struct.minionType != null) {
        if (struct.isSetMinionType()) {
          oprot.writeFieldBegin(MINION_TYPE_FIELD_DESC);
          oprot.writeI32(struct.minionType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildLabel != null) {
        if (struct.isSetBuildLabel()) {
          oprot.writeFieldBegin(BUILD_LABEL_FIELD_DESC);
          oprot.writeString(struct.buildLabel);
          oprot.writeFieldEnd();
        }
      }
      if (struct.region != null) {
        if (struct.isSetRegion()) {
          oprot.writeFieldBegin(REGION_FIELD_DESC);
          oprot.writeString(struct.region);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EnqueueMinionsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EnqueueMinionsRequestTupleScheme getScheme() {
      return new EnqueueMinionsRequestTupleScheme();
    }
  }

  private static class EnqueueMinionsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<EnqueueMinionsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetMinionQueue()) {
        optionals.set(1);
      }
      if (struct.isSetNumberOfMinions()) {
        optionals.set(2);
      }
      if (struct.isSetMinionType()) {
        optionals.set(3);
      }
      if (struct.isSetBuildLabel()) {
        optionals.set(4);
      }
      if (struct.isSetRegion()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetMinionQueue()) {
        oprot.writeString(struct.minionQueue);
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeI32(struct.numberOfMinions);
      }
      if (struct.isSetMinionType()) {
        oprot.writeI32(struct.minionType.getValue());
      }
      if (struct.isSetBuildLabel()) {
        oprot.writeString(struct.buildLabel);
      }
      if (struct.isSetRegion()) {
        oprot.writeString(struct.region);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EnqueueMinionsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.minionQueue = iprot.readString();
        struct.setMinionQueueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.numberOfMinions = iprot.readI32();
        struct.setNumberOfMinionsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.minionType = com.facebook.buck.distributed.thrift.MinionType.findByValue(iprot.readI32());
        struct.setMinionTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.buildLabel = iprot.readString();
        struct.setBuildLabelIsSet(true);
      }
      if (incoming.get(5)) {
        struct.region = iprot.readString();
        struct.setRegionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

