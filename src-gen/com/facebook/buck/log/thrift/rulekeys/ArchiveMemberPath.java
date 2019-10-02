/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.log.thrift.rulekeys;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class ArchiveMemberPath implements org.apache.thrift.TBase<ArchiveMemberPath, ArchiveMemberPath._Fields>, java.io.Serializable, Cloneable, Comparable<ArchiveMemberPath> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ArchiveMemberPath");

  private static final org.apache.thrift.protocol.TField ARCHIVE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("archivePath", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MEMBER_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("memberPath", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("hash", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArchiveMemberPathStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArchiveMemberPathTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String archivePath; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String memberPath; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String hash; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ARCHIVE_PATH((short)1, "archivePath"),
    MEMBER_PATH((short)2, "memberPath"),
    HASH((short)3, "hash");

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
        case 1: // ARCHIVE_PATH
          return ARCHIVE_PATH;
        case 2: // MEMBER_PATH
          return MEMBER_PATH;
        case 3: // HASH
          return HASH;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ARCHIVE_PATH, new org.apache.thrift.meta_data.FieldMetaData("archivePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBER_PATH, new org.apache.thrift.meta_data.FieldMetaData("memberPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HASH, new org.apache.thrift.meta_data.FieldMetaData("hash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArchiveMemberPath.class, metaDataMap);
  }

  public ArchiveMemberPath() {
  }

  public ArchiveMemberPath(
    java.lang.String archivePath,
    java.lang.String memberPath,
    java.lang.String hash)
  {
    this();
    this.archivePath = archivePath;
    this.memberPath = memberPath;
    this.hash = hash;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ArchiveMemberPath(ArchiveMemberPath other) {
    if (other.isSetArchivePath()) {
      this.archivePath = other.archivePath;
    }
    if (other.isSetMemberPath()) {
      this.memberPath = other.memberPath;
    }
    if (other.isSetHash()) {
      this.hash = other.hash;
    }
  }

  public ArchiveMemberPath deepCopy() {
    return new ArchiveMemberPath(this);
  }

  @Override
  public void clear() {
    this.archivePath = null;
    this.memberPath = null;
    this.hash = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getArchivePath() {
    return this.archivePath;
  }

  public ArchiveMemberPath setArchivePath(@org.apache.thrift.annotation.Nullable java.lang.String archivePath) {
    this.archivePath = archivePath;
    return this;
  }

  public void unsetArchivePath() {
    this.archivePath = null;
  }

  /** Returns true if field archivePath is set (has been assigned a value) and false otherwise */
  public boolean isSetArchivePath() {
    return this.archivePath != null;
  }

  public void setArchivePathIsSet(boolean value) {
    if (!value) {
      this.archivePath = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMemberPath() {
    return this.memberPath;
  }

  public ArchiveMemberPath setMemberPath(@org.apache.thrift.annotation.Nullable java.lang.String memberPath) {
    this.memberPath = memberPath;
    return this;
  }

  public void unsetMemberPath() {
    this.memberPath = null;
  }

  /** Returns true if field memberPath is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberPath() {
    return this.memberPath != null;
  }

  public void setMemberPathIsSet(boolean value) {
    if (!value) {
      this.memberPath = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHash() {
    return this.hash;
  }

  public ArchiveMemberPath setHash(@org.apache.thrift.annotation.Nullable java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  public void unsetHash() {
    this.hash = null;
  }

  /** Returns true if field hash is set (has been assigned a value) and false otherwise */
  public boolean isSetHash() {
    return this.hash != null;
  }

  public void setHashIsSet(boolean value) {
    if (!value) {
      this.hash = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ARCHIVE_PATH:
      if (value == null) {
        unsetArchivePath();
      } else {
        setArchivePath((java.lang.String)value);
      }
      break;

    case MEMBER_PATH:
      if (value == null) {
        unsetMemberPath();
      } else {
        setMemberPath((java.lang.String)value);
      }
      break;

    case HASH:
      if (value == null) {
        unsetHash();
      } else {
        setHash((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ARCHIVE_PATH:
      return getArchivePath();

    case MEMBER_PATH:
      return getMemberPath();

    case HASH:
      return getHash();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ARCHIVE_PATH:
      return isSetArchivePath();
    case MEMBER_PATH:
      return isSetMemberPath();
    case HASH:
      return isSetHash();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ArchiveMemberPath)
      return this.equals((ArchiveMemberPath)that);
    return false;
  }

  public boolean equals(ArchiveMemberPath that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_archivePath = true && this.isSetArchivePath();
    boolean that_present_archivePath = true && that.isSetArchivePath();
    if (this_present_archivePath || that_present_archivePath) {
      if (!(this_present_archivePath && that_present_archivePath))
        return false;
      if (!this.archivePath.equals(that.archivePath))
        return false;
    }

    boolean this_present_memberPath = true && this.isSetMemberPath();
    boolean that_present_memberPath = true && that.isSetMemberPath();
    if (this_present_memberPath || that_present_memberPath) {
      if (!(this_present_memberPath && that_present_memberPath))
        return false;
      if (!this.memberPath.equals(that.memberPath))
        return false;
    }

    boolean this_present_hash = true && this.isSetHash();
    boolean that_present_hash = true && that.isSetHash();
    if (this_present_hash || that_present_hash) {
      if (!(this_present_hash && that_present_hash))
        return false;
      if (!this.hash.equals(that.hash))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetArchivePath()) ? 131071 : 524287);
    if (isSetArchivePath())
      hashCode = hashCode * 8191 + archivePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetMemberPath()) ? 131071 : 524287);
    if (isSetMemberPath())
      hashCode = hashCode * 8191 + memberPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetHash()) ? 131071 : 524287);
    if (isSetHash())
      hashCode = hashCode * 8191 + hash.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ArchiveMemberPath other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetArchivePath()).compareTo(other.isSetArchivePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchivePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.archivePath, other.archivePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMemberPath()).compareTo(other.isSetMemberPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberPath, other.memberPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHash()).compareTo(other.isSetHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hash, other.hash);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ArchiveMemberPath(");
    boolean first = true;

    sb.append("archivePath:");
    if (this.archivePath == null) {
      sb.append("null");
    } else {
      sb.append(this.archivePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberPath:");
    if (this.memberPath == null) {
      sb.append("null");
    } else {
      sb.append(this.memberPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hash:");
    if (this.hash == null) {
      sb.append("null");
    } else {
      sb.append(this.hash);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class ArchiveMemberPathStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArchiveMemberPathStandardScheme getScheme() {
      return new ArchiveMemberPathStandardScheme();
    }
  }

  private static class ArchiveMemberPathStandardScheme extends org.apache.thrift.scheme.StandardScheme<ArchiveMemberPath> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ArchiveMemberPath struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ARCHIVE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.archivePath = iprot.readString();
              struct.setArchivePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEMBER_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.memberPath = iprot.readString();
              struct.setMemberPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hash = iprot.readString();
              struct.setHashIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ArchiveMemberPath struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.archivePath != null) {
        oprot.writeFieldBegin(ARCHIVE_PATH_FIELD_DESC);
        oprot.writeString(struct.archivePath);
        oprot.writeFieldEnd();
      }
      if (struct.memberPath != null) {
        oprot.writeFieldBegin(MEMBER_PATH_FIELD_DESC);
        oprot.writeString(struct.memberPath);
        oprot.writeFieldEnd();
      }
      if (struct.hash != null) {
        oprot.writeFieldBegin(HASH_FIELD_DESC);
        oprot.writeString(struct.hash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArchiveMemberPathTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArchiveMemberPathTupleScheme getScheme() {
      return new ArchiveMemberPathTupleScheme();
    }
  }

  private static class ArchiveMemberPathTupleScheme extends org.apache.thrift.scheme.TupleScheme<ArchiveMemberPath> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ArchiveMemberPath struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetArchivePath()) {
        optionals.set(0);
      }
      if (struct.isSetMemberPath()) {
        optionals.set(1);
      }
      if (struct.isSetHash()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetArchivePath()) {
        oprot.writeString(struct.archivePath);
      }
      if (struct.isSetMemberPath()) {
        oprot.writeString(struct.memberPath);
      }
      if (struct.isSetHash()) {
        oprot.writeString(struct.hash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ArchiveMemberPath struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.archivePath = iprot.readString();
        struct.setArchivePathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.memberPath = iprot.readString();
        struct.setMemberPathIsSet(true);
      }
      if (incoming.get(2)) {
        struct.hash = iprot.readString();
        struct.setHashIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

