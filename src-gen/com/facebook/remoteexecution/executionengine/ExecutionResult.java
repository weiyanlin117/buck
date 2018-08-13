/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class ExecutionResult implements org.apache.thrift.TBase<ExecutionResult, ExecutionResult._Fields>, java.io.Serializable, Cloneable, Comparable<ExecutionResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecutionResult");

  private static final org.apache.thrift.protocol.TField ACTION_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("action_result", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CACHED_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("cached_result", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExecutionResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExecutionResultTupleSchemeFactory();

  public ActionResult action_result; // optional
  public boolean cached_result; // required
  /**
   * 
   * @see ExecutionStatus
   */
  public ExecutionStatus status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION_RESULT((short)1, "action_result"),
    CACHED_RESULT((short)2, "cached_result"),
    /**
     * 
     * @see ExecutionStatus
     */
    STATUS((short)3, "status");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACTION_RESULT
          return ACTION_RESULT;
        case 2: // CACHED_RESULT
          return CACHED_RESULT;
        case 3: // STATUS
          return STATUS;
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
  private static final int __CACHED_RESULT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ACTION_RESULT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_RESULT, new org.apache.thrift.meta_data.FieldMetaData("action_result", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ActionResult.class)));
    tmpMap.put(_Fields.CACHED_RESULT, new org.apache.thrift.meta_data.FieldMetaData("cached_result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ExecutionStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecutionResult.class, metaDataMap);
  }

  public ExecutionResult() {
  }

  public ExecutionResult(
    boolean cached_result,
    ExecutionStatus status)
  {
    this();
    this.cached_result = cached_result;
    setCached_resultIsSet(true);
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecutionResult(ExecutionResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAction_result()) {
      this.action_result = new ActionResult(other.action_result);
    }
    this.cached_result = other.cached_result;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  public ExecutionResult deepCopy() {
    return new ExecutionResult(this);
  }

  @Override
  public void clear() {
    this.action_result = null;
    setCached_resultIsSet(false);
    this.cached_result = false;
    this.status = null;
  }

  public ActionResult getAction_result() {
    return this.action_result;
  }

  public ExecutionResult setAction_result(ActionResult action_result) {
    this.action_result = action_result;
    return this;
  }

  public void unsetAction_result() {
    this.action_result = null;
  }

  /** Returns true if field action_result is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_result() {
    return this.action_result != null;
  }

  public void setAction_resultIsSet(boolean value) {
    if (!value) {
      this.action_result = null;
    }
  }

  public boolean isCached_result() {
    return this.cached_result;
  }

  public ExecutionResult setCached_result(boolean cached_result) {
    this.cached_result = cached_result;
    setCached_resultIsSet(true);
    return this;
  }

  public void unsetCached_result() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHED_RESULT_ISSET_ID);
  }

  /** Returns true if field cached_result is set (has been assigned a value) and false otherwise */
  public boolean isSetCached_result() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHED_RESULT_ISSET_ID);
  }

  public void setCached_resultIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHED_RESULT_ISSET_ID, value);
  }

  /**
   * 
   * @see ExecutionStatus
   */
  public ExecutionStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see ExecutionStatus
   */
  public ExecutionResult setStatus(ExecutionStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ACTION_RESULT:
      if (value == null) {
        unsetAction_result();
      } else {
        setAction_result((ActionResult)value);
      }
      break;

    case CACHED_RESULT:
      if (value == null) {
        unsetCached_result();
      } else {
        setCached_result((java.lang.Boolean)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((ExecutionStatus)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_RESULT:
      return getAction_result();

    case CACHED_RESULT:
      return isCached_result();

    case STATUS:
      return getStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACTION_RESULT:
      return isSetAction_result();
    case CACHED_RESULT:
      return isSetCached_result();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecutionResult)
      return this.equals((ExecutionResult)that);
    return false;
  }

  public boolean equals(ExecutionResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_action_result = true && this.isSetAction_result();
    boolean that_present_action_result = true && that.isSetAction_result();
    if (this_present_action_result || that_present_action_result) {
      if (!(this_present_action_result && that_present_action_result))
        return false;
      if (!this.action_result.equals(that.action_result))
        return false;
    }

    boolean this_present_cached_result = true;
    boolean that_present_cached_result = true;
    if (this_present_cached_result || that_present_cached_result) {
      if (!(this_present_cached_result && that_present_cached_result))
        return false;
      if (this.cached_result != that.cached_result)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAction_result()) ? 131071 : 524287);
    if (isSetAction_result())
      hashCode = hashCode * 8191 + action_result.hashCode();

    hashCode = hashCode * 8191 + ((cached_result) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(ExecutionResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAction_result()).compareTo(other.isSetAction_result());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_result()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_result, other.action_result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCached_result()).compareTo(other.isSetCached_result());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCached_result()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cached_result, other.cached_result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecutionResult(");
    boolean first = true;

    if (isSetAction_result()) {
      sb.append("action_result:");
      if (this.action_result == null) {
        sb.append("null");
      } else {
        sb.append(this.action_result);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("cached_result:");
    sb.append(this.cached_result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (action_result != null) {
      action_result.validate();
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

  private static class ExecutionResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecutionResultStandardScheme getScheme() {
      return new ExecutionResultStandardScheme();
    }
  }

  private static class ExecutionResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExecutionResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExecutionResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.action_result = new ActionResult();
              struct.action_result.read(iprot);
              struct.setAction_resultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CACHED_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.cached_result = iprot.readBool();
              struct.setCached_resultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.facebook.remoteexecution.executionengine.ExecutionStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExecutionResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action_result != null) {
        if (struct.isSetAction_result()) {
          oprot.writeFieldBegin(ACTION_RESULT_FIELD_DESC);
          struct.action_result.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(CACHED_RESULT_FIELD_DESC);
      oprot.writeBool(struct.cached_result);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExecutionResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecutionResultTupleScheme getScheme() {
      return new ExecutionResultTupleScheme();
    }
  }

  private static class ExecutionResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExecutionResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExecutionResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAction_result()) {
        optionals.set(0);
      }
      if (struct.isSetCached_result()) {
        optionals.set(1);
      }
      if (struct.isSetStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAction_result()) {
        struct.action_result.write(oprot);
      }
      if (struct.isSetCached_result()) {
        oprot.writeBool(struct.cached_result);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExecutionResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.action_result = new ActionResult();
        struct.action_result.read(iprot);
        struct.setAction_resultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cached_result = iprot.readBool();
        struct.setCached_resultIsSet(true);
      }
      if (incoming.get(2)) {
        struct.status = com.facebook.remoteexecution.executionengine.ExecutionStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
