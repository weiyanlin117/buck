/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class MultiGetBuildSlaveLogDirRequest implements org.apache.thrift.TBase<MultiGetBuildSlaveLogDirRequest, MultiGetBuildSlaveLogDirRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MultiGetBuildSlaveLogDirRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MultiGetBuildSlaveLogDirRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BUILD_SLAVE_RUN_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildSlaveRunIds", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MultiGetBuildSlaveLogDirRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MultiGetBuildSlaveLogDirRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable StampedeId stampedeId; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<BuildSlaveRunId> buildSlaveRunIds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    BUILD_SLAVE_RUN_IDS((short)2, "buildSlaveRunIds");

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
        case 2: // BUILD_SLAVE_RUN_IDS
          return BUILD_SLAVE_RUN_IDS;
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
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.BUILD_SLAVE_RUN_IDS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.BUILD_SLAVE_RUN_IDS, new org.apache.thrift.meta_data.FieldMetaData("buildSlaveRunIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildSlaveRunId.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MultiGetBuildSlaveLogDirRequest.class, metaDataMap);
  }

  public MultiGetBuildSlaveLogDirRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiGetBuildSlaveLogDirRequest(MultiGetBuildSlaveLogDirRequest other) {
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetBuildSlaveRunIds()) {
      java.util.List<BuildSlaveRunId> __this__buildSlaveRunIds = new java.util.ArrayList<BuildSlaveRunId>(other.buildSlaveRunIds.size());
      for (BuildSlaveRunId other_element : other.buildSlaveRunIds) {
        __this__buildSlaveRunIds.add(new BuildSlaveRunId(other_element));
      }
      this.buildSlaveRunIds = __this__buildSlaveRunIds;
    }
  }

  public MultiGetBuildSlaveLogDirRequest deepCopy() {
    return new MultiGetBuildSlaveLogDirRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.buildSlaveRunIds = null;
  }

  @org.apache.thrift.annotation.Nullable
  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public MultiGetBuildSlaveLogDirRequest setStampedeId(@org.apache.thrift.annotation.Nullable StampedeId stampedeId) {
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

  public int getBuildSlaveRunIdsSize() {
    return (this.buildSlaveRunIds == null) ? 0 : this.buildSlaveRunIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<BuildSlaveRunId> getBuildSlaveRunIdsIterator() {
    return (this.buildSlaveRunIds == null) ? null : this.buildSlaveRunIds.iterator();
  }

  public void addToBuildSlaveRunIds(BuildSlaveRunId elem) {
    if (this.buildSlaveRunIds == null) {
      this.buildSlaveRunIds = new java.util.ArrayList<BuildSlaveRunId>();
    }
    this.buildSlaveRunIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<BuildSlaveRunId> getBuildSlaveRunIds() {
    return this.buildSlaveRunIds;
  }

  public MultiGetBuildSlaveLogDirRequest setBuildSlaveRunIds(@org.apache.thrift.annotation.Nullable java.util.List<BuildSlaveRunId> buildSlaveRunIds) {
    this.buildSlaveRunIds = buildSlaveRunIds;
    return this;
  }

  public void unsetBuildSlaveRunIds() {
    this.buildSlaveRunIds = null;
  }

  /** Returns true if field buildSlaveRunIds is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildSlaveRunIds() {
    return this.buildSlaveRunIds != null;
  }

  public void setBuildSlaveRunIdsIsSet(boolean value) {
    if (!value) {
      this.buildSlaveRunIds = null;
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

    case BUILD_SLAVE_RUN_IDS:
      if (value == null) {
        unsetBuildSlaveRunIds();
      } else {
        setBuildSlaveRunIds((java.util.List<BuildSlaveRunId>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case BUILD_SLAVE_RUN_IDS:
      return getBuildSlaveRunIds();

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
    case BUILD_SLAVE_RUN_IDS:
      return isSetBuildSlaveRunIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiGetBuildSlaveLogDirRequest)
      return this.equals((MultiGetBuildSlaveLogDirRequest)that);
    return false;
  }

  public boolean equals(MultiGetBuildSlaveLogDirRequest that) {
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

    boolean this_present_buildSlaveRunIds = true && this.isSetBuildSlaveRunIds();
    boolean that_present_buildSlaveRunIds = true && that.isSetBuildSlaveRunIds();
    if (this_present_buildSlaveRunIds || that_present_buildSlaveRunIds) {
      if (!(this_present_buildSlaveRunIds && that_present_buildSlaveRunIds))
        return false;
      if (!this.buildSlaveRunIds.equals(that.buildSlaveRunIds))
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

    hashCode = hashCode * 8191 + ((isSetBuildSlaveRunIds()) ? 131071 : 524287);
    if (isSetBuildSlaveRunIds())
      hashCode = hashCode * 8191 + buildSlaveRunIds.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MultiGetBuildSlaveLogDirRequest other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetBuildSlaveRunIds()).compareTo(other.isSetBuildSlaveRunIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildSlaveRunIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildSlaveRunIds, other.buildSlaveRunIds);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiGetBuildSlaveLogDirRequest(");
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
    if (isSetBuildSlaveRunIds()) {
      if (!first) sb.append(", ");
      sb.append("buildSlaveRunIds:");
      if (this.buildSlaveRunIds == null) {
        sb.append("null");
      } else {
        sb.append(this.buildSlaveRunIds);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MultiGetBuildSlaveLogDirRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MultiGetBuildSlaveLogDirRequestStandardScheme getScheme() {
      return new MultiGetBuildSlaveLogDirRequestStandardScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<MultiGetBuildSlaveLogDirRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
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
          case 2: // BUILD_SLAVE_RUN_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.buildSlaveRunIds = new java.util.ArrayList<BuildSlaveRunId>(_list112.size);
                @org.apache.thrift.annotation.Nullable BuildSlaveRunId _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = new BuildSlaveRunId();
                  _elem113.read(iprot);
                  struct.buildSlaveRunIds.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setBuildSlaveRunIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildSlaveRunIds != null) {
        if (struct.isSetBuildSlaveRunIds()) {
          oprot.writeFieldBegin(BUILD_SLAVE_RUN_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.buildSlaveRunIds.size()));
            for (BuildSlaveRunId _iter115 : struct.buildSlaveRunIds)
            {
              _iter115.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MultiGetBuildSlaveLogDirRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MultiGetBuildSlaveLogDirRequestTupleScheme getScheme() {
      return new MultiGetBuildSlaveLogDirRequestTupleScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<MultiGetBuildSlaveLogDirRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetBuildSlaveRunIds()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetBuildSlaveRunIds()) {
        {
          oprot.writeI32(struct.buildSlaveRunIds.size());
          for (BuildSlaveRunId _iter116 : struct.buildSlaveRunIds)
          {
            _iter116.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.buildSlaveRunIds = new java.util.ArrayList<BuildSlaveRunId>(_list117.size);
          @org.apache.thrift.annotation.Nullable BuildSlaveRunId _elem118;
          for (int _i119 = 0; _i119 < _list117.size; ++_i119)
          {
            _elem118 = new BuildSlaveRunId();
            _elem118.read(iprot);
            struct.buildSlaveRunIds.add(_elem118);
          }
        }
        struct.setBuildSlaveRunIdsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

