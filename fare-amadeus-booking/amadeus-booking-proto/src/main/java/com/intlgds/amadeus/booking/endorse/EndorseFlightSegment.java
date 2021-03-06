/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.intlgds.amadeus.booking.endorse;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndorseFlightSegment implements org.apache.thrift.TBase<EndorseFlightSegment, EndorseFlightSegment._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EndorseFlightSegment");

  private static final org.apache.thrift.protocol.TField FLIGHT_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("flightNo", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ORIGFLIGHT_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("origflightNo", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CABIN_FIELD_DESC = new org.apache.thrift.protocol.TField("cabin", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEP_AIRPORT_FIELD_DESC = new org.apache.thrift.protocol.TField("depAirport", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DEP_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("depDate", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DEP_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("depTime", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ARR_AIRPORT_FIELD_DESC = new org.apache.thrift.protocol.TField("arrAirport", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField ARR_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("arrDate", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField ARR_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("arrTime", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EndorseFlightSegmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EndorseFlightSegmentTupleSchemeFactory());
  }

  public String flightNo; // required
  public String origflightNo; // required
  public String cabin; // required
  public String depAirport; // required
  public String depDate; // required
  public String depTime; // required
  public String arrAirport; // required
  public String arrDate; // required
  public String arrTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FLIGHT_NO((short)1, "flightNo"),
    ORIGFLIGHT_NO((short)2, "origflightNo"),
    CABIN((short)3, "cabin"),
    DEP_AIRPORT((short)4, "depAirport"),
    DEP_DATE((short)5, "depDate"),
    DEP_TIME((short)6, "depTime"),
    ARR_AIRPORT((short)7, "arrAirport"),
    ARR_DATE((short)8, "arrDate"),
    ARR_TIME((short)9, "arrTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FLIGHT_NO
          return FLIGHT_NO;
        case 2: // ORIGFLIGHT_NO
          return ORIGFLIGHT_NO;
        case 3: // CABIN
          return CABIN;
        case 4: // DEP_AIRPORT
          return DEP_AIRPORT;
        case 5: // DEP_DATE
          return DEP_DATE;
        case 6: // DEP_TIME
          return DEP_TIME;
        case 7: // ARR_AIRPORT
          return ARR_AIRPORT;
        case 8: // ARR_DATE
          return ARR_DATE;
        case 9: // ARR_TIME
          return ARR_TIME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FLIGHT_NO, new org.apache.thrift.meta_data.FieldMetaData("flightNo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORIGFLIGHT_NO, new org.apache.thrift.meta_data.FieldMetaData("origflightNo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CABIN, new org.apache.thrift.meta_data.FieldMetaData("cabin", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEP_AIRPORT, new org.apache.thrift.meta_data.FieldMetaData("depAirport", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEP_DATE, new org.apache.thrift.meta_data.FieldMetaData("depDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEP_TIME, new org.apache.thrift.meta_data.FieldMetaData("depTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARR_AIRPORT, new org.apache.thrift.meta_data.FieldMetaData("arrAirport", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARR_DATE, new org.apache.thrift.meta_data.FieldMetaData("arrDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARR_TIME, new org.apache.thrift.meta_data.FieldMetaData("arrTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EndorseFlightSegment.class, metaDataMap);
  }

  public EndorseFlightSegment() {
  }

  public EndorseFlightSegment(
    String flightNo,
    String origflightNo,
    String cabin,
    String depAirport,
    String depDate,
    String depTime,
    String arrAirport,
    String arrDate,
    String arrTime)
  {
    this();
    this.flightNo = flightNo;
    this.origflightNo = origflightNo;
    this.cabin = cabin;
    this.depAirport = depAirport;
    this.depDate = depDate;
    this.depTime = depTime;
    this.arrAirport = arrAirport;
    this.arrDate = arrDate;
    this.arrTime = arrTime;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EndorseFlightSegment(EndorseFlightSegment other) {
    if (other.isSetFlightNo()) {
      this.flightNo = other.flightNo;
    }
    if (other.isSetOrigflightNo()) {
      this.origflightNo = other.origflightNo;
    }
    if (other.isSetCabin()) {
      this.cabin = other.cabin;
    }
    if (other.isSetDepAirport()) {
      this.depAirport = other.depAirport;
    }
    if (other.isSetDepDate()) {
      this.depDate = other.depDate;
    }
    if (other.isSetDepTime()) {
      this.depTime = other.depTime;
    }
    if (other.isSetArrAirport()) {
      this.arrAirport = other.arrAirport;
    }
    if (other.isSetArrDate()) {
      this.arrDate = other.arrDate;
    }
    if (other.isSetArrTime()) {
      this.arrTime = other.arrTime;
    }
  }

  public EndorseFlightSegment deepCopy() {
    return new EndorseFlightSegment(this);
  }

  @Override
  public void clear() {
    this.flightNo = null;
    this.origflightNo = null;
    this.cabin = null;
    this.depAirport = null;
    this.depDate = null;
    this.depTime = null;
    this.arrAirport = null;
    this.arrDate = null;
    this.arrTime = null;
  }

  public String getFlightNo() {
    return this.flightNo;
  }

  public EndorseFlightSegment setFlightNo(String flightNo) {
    this.flightNo = flightNo;
    return this;
  }

  public void unsetFlightNo() {
    this.flightNo = null;
  }

  /** Returns true if field flightNo is set (has been assigned a value) and false otherwise */
  public boolean isSetFlightNo() {
    return this.flightNo != null;
  }

  public void setFlightNoIsSet(boolean value) {
    if (!value) {
      this.flightNo = null;
    }
  }

  public String getOrigflightNo() {
    return this.origflightNo;
  }

  public EndorseFlightSegment setOrigflightNo(String origflightNo) {
    this.origflightNo = origflightNo;
    return this;
  }

  public void unsetOrigflightNo() {
    this.origflightNo = null;
  }

  /** Returns true if field origflightNo is set (has been assigned a value) and false otherwise */
  public boolean isSetOrigflightNo() {
    return this.origflightNo != null;
  }

  public void setOrigflightNoIsSet(boolean value) {
    if (!value) {
      this.origflightNo = null;
    }
  }

  public String getCabin() {
    return this.cabin;
  }

  public EndorseFlightSegment setCabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

  public void unsetCabin() {
    this.cabin = null;
  }

  /** Returns true if field cabin is set (has been assigned a value) and false otherwise */
  public boolean isSetCabin() {
    return this.cabin != null;
  }

  public void setCabinIsSet(boolean value) {
    if (!value) {
      this.cabin = null;
    }
  }

  public String getDepAirport() {
    return this.depAirport;
  }

  public EndorseFlightSegment setDepAirport(String depAirport) {
    this.depAirport = depAirport;
    return this;
  }

  public void unsetDepAirport() {
    this.depAirport = null;
  }

  /** Returns true if field depAirport is set (has been assigned a value) and false otherwise */
  public boolean isSetDepAirport() {
    return this.depAirport != null;
  }

  public void setDepAirportIsSet(boolean value) {
    if (!value) {
      this.depAirport = null;
    }
  }

  public String getDepDate() {
    return this.depDate;
  }

  public EndorseFlightSegment setDepDate(String depDate) {
    this.depDate = depDate;
    return this;
  }

  public void unsetDepDate() {
    this.depDate = null;
  }

  /** Returns true if field depDate is set (has been assigned a value) and false otherwise */
  public boolean isSetDepDate() {
    return this.depDate != null;
  }

  public void setDepDateIsSet(boolean value) {
    if (!value) {
      this.depDate = null;
    }
  }

  public String getDepTime() {
    return this.depTime;
  }

  public EndorseFlightSegment setDepTime(String depTime) {
    this.depTime = depTime;
    return this;
  }

  public void unsetDepTime() {
    this.depTime = null;
  }

  /** Returns true if field depTime is set (has been assigned a value) and false otherwise */
  public boolean isSetDepTime() {
    return this.depTime != null;
  }

  public void setDepTimeIsSet(boolean value) {
    if (!value) {
      this.depTime = null;
    }
  }

  public String getArrAirport() {
    return this.arrAirport;
  }

  public EndorseFlightSegment setArrAirport(String arrAirport) {
    this.arrAirport = arrAirport;
    return this;
  }

  public void unsetArrAirport() {
    this.arrAirport = null;
  }

  /** Returns true if field arrAirport is set (has been assigned a value) and false otherwise */
  public boolean isSetArrAirport() {
    return this.arrAirport != null;
  }

  public void setArrAirportIsSet(boolean value) {
    if (!value) {
      this.arrAirport = null;
    }
  }

  public String getArrDate() {
    return this.arrDate;
  }

  public EndorseFlightSegment setArrDate(String arrDate) {
    this.arrDate = arrDate;
    return this;
  }

  public void unsetArrDate() {
    this.arrDate = null;
  }

  /** Returns true if field arrDate is set (has been assigned a value) and false otherwise */
  public boolean isSetArrDate() {
    return this.arrDate != null;
  }

  public void setArrDateIsSet(boolean value) {
    if (!value) {
      this.arrDate = null;
    }
  }

  public String getArrTime() {
    return this.arrTime;
  }

  public EndorseFlightSegment setArrTime(String arrTime) {
    this.arrTime = arrTime;
    return this;
  }

  public void unsetArrTime() {
    this.arrTime = null;
  }

  /** Returns true if field arrTime is set (has been assigned a value) and false otherwise */
  public boolean isSetArrTime() {
    return this.arrTime != null;
  }

  public void setArrTimeIsSet(boolean value) {
    if (!value) {
      this.arrTime = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FLIGHT_NO:
      if (value == null) {
        unsetFlightNo();
      } else {
        setFlightNo((String)value);
      }
      break;

    case ORIGFLIGHT_NO:
      if (value == null) {
        unsetOrigflightNo();
      } else {
        setOrigflightNo((String)value);
      }
      break;

    case CABIN:
      if (value == null) {
        unsetCabin();
      } else {
        setCabin((String)value);
      }
      break;

    case DEP_AIRPORT:
      if (value == null) {
        unsetDepAirport();
      } else {
        setDepAirport((String)value);
      }
      break;

    case DEP_DATE:
      if (value == null) {
        unsetDepDate();
      } else {
        setDepDate((String)value);
      }
      break;

    case DEP_TIME:
      if (value == null) {
        unsetDepTime();
      } else {
        setDepTime((String)value);
      }
      break;

    case ARR_AIRPORT:
      if (value == null) {
        unsetArrAirport();
      } else {
        setArrAirport((String)value);
      }
      break;

    case ARR_DATE:
      if (value == null) {
        unsetArrDate();
      } else {
        setArrDate((String)value);
      }
      break;

    case ARR_TIME:
      if (value == null) {
        unsetArrTime();
      } else {
        setArrTime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FLIGHT_NO:
      return getFlightNo();

    case ORIGFLIGHT_NO:
      return getOrigflightNo();

    case CABIN:
      return getCabin();

    case DEP_AIRPORT:
      return getDepAirport();

    case DEP_DATE:
      return getDepDate();

    case DEP_TIME:
      return getDepTime();

    case ARR_AIRPORT:
      return getArrAirport();

    case ARR_DATE:
      return getArrDate();

    case ARR_TIME:
      return getArrTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FLIGHT_NO:
      return isSetFlightNo();
    case ORIGFLIGHT_NO:
      return isSetOrigflightNo();
    case CABIN:
      return isSetCabin();
    case DEP_AIRPORT:
      return isSetDepAirport();
    case DEP_DATE:
      return isSetDepDate();
    case DEP_TIME:
      return isSetDepTime();
    case ARR_AIRPORT:
      return isSetArrAirport();
    case ARR_DATE:
      return isSetArrDate();
    case ARR_TIME:
      return isSetArrTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EndorseFlightSegment)
      return this.equals((EndorseFlightSegment)that);
    return false;
  }

  public boolean equals(EndorseFlightSegment that) {
    if (that == null)
      return false;

    boolean this_present_flightNo = true && this.isSetFlightNo();
    boolean that_present_flightNo = true && that.isSetFlightNo();
    if (this_present_flightNo || that_present_flightNo) {
      if (!(this_present_flightNo && that_present_flightNo))
        return false;
      if (!this.flightNo.equals(that.flightNo))
        return false;
    }

    boolean this_present_origflightNo = true && this.isSetOrigflightNo();
    boolean that_present_origflightNo = true && that.isSetOrigflightNo();
    if (this_present_origflightNo || that_present_origflightNo) {
      if (!(this_present_origflightNo && that_present_origflightNo))
        return false;
      if (!this.origflightNo.equals(that.origflightNo))
        return false;
    }

    boolean this_present_cabin = true && this.isSetCabin();
    boolean that_present_cabin = true && that.isSetCabin();
    if (this_present_cabin || that_present_cabin) {
      if (!(this_present_cabin && that_present_cabin))
        return false;
      if (!this.cabin.equals(that.cabin))
        return false;
    }

    boolean this_present_depAirport = true && this.isSetDepAirport();
    boolean that_present_depAirport = true && that.isSetDepAirport();
    if (this_present_depAirport || that_present_depAirport) {
      if (!(this_present_depAirport && that_present_depAirport))
        return false;
      if (!this.depAirport.equals(that.depAirport))
        return false;
    }

    boolean this_present_depDate = true && this.isSetDepDate();
    boolean that_present_depDate = true && that.isSetDepDate();
    if (this_present_depDate || that_present_depDate) {
      if (!(this_present_depDate && that_present_depDate))
        return false;
      if (!this.depDate.equals(that.depDate))
        return false;
    }

    boolean this_present_depTime = true && this.isSetDepTime();
    boolean that_present_depTime = true && that.isSetDepTime();
    if (this_present_depTime || that_present_depTime) {
      if (!(this_present_depTime && that_present_depTime))
        return false;
      if (!this.depTime.equals(that.depTime))
        return false;
    }

    boolean this_present_arrAirport = true && this.isSetArrAirport();
    boolean that_present_arrAirport = true && that.isSetArrAirport();
    if (this_present_arrAirport || that_present_arrAirport) {
      if (!(this_present_arrAirport && that_present_arrAirport))
        return false;
      if (!this.arrAirport.equals(that.arrAirport))
        return false;
    }

    boolean this_present_arrDate = true && this.isSetArrDate();
    boolean that_present_arrDate = true && that.isSetArrDate();
    if (this_present_arrDate || that_present_arrDate) {
      if (!(this_present_arrDate && that_present_arrDate))
        return false;
      if (!this.arrDate.equals(that.arrDate))
        return false;
    }

    boolean this_present_arrTime = true && this.isSetArrTime();
    boolean that_present_arrTime = true && that.isSetArrTime();
    if (this_present_arrTime || that_present_arrTime) {
      if (!(this_present_arrTime && that_present_arrTime))
        return false;
      if (!this.arrTime.equals(that.arrTime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(EndorseFlightSegment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    EndorseFlightSegment typedOther = (EndorseFlightSegment)other;

    lastComparison = Boolean.valueOf(isSetFlightNo()).compareTo(typedOther.isSetFlightNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlightNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flightNo, typedOther.flightNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrigflightNo()).compareTo(typedOther.isSetOrigflightNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrigflightNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.origflightNo, typedOther.origflightNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCabin()).compareTo(typedOther.isSetCabin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCabin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cabin, typedOther.cabin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepAirport()).compareTo(typedOther.isSetDepAirport());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepAirport()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.depAirport, typedOther.depAirport);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepDate()).compareTo(typedOther.isSetDepDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.depDate, typedOther.depDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepTime()).compareTo(typedOther.isSetDepTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.depTime, typedOther.depTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArrAirport()).compareTo(typedOther.isSetArrAirport());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArrAirport()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arrAirport, typedOther.arrAirport);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArrDate()).compareTo(typedOther.isSetArrDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArrDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arrDate, typedOther.arrDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArrTime()).compareTo(typedOther.isSetArrTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArrTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arrTime, typedOther.arrTime);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EndorseFlightSegment(");
    boolean first = true;

    sb.append("flightNo:");
    if (this.flightNo == null) {
      sb.append("null");
    } else {
      sb.append(this.flightNo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("origflightNo:");
    if (this.origflightNo == null) {
      sb.append("null");
    } else {
      sb.append(this.origflightNo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cabin:");
    if (this.cabin == null) {
      sb.append("null");
    } else {
      sb.append(this.cabin);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("depAirport:");
    if (this.depAirport == null) {
      sb.append("null");
    } else {
      sb.append(this.depAirport);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("depDate:");
    if (this.depDate == null) {
      sb.append("null");
    } else {
      sb.append(this.depDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("depTime:");
    if (this.depTime == null) {
      sb.append("null");
    } else {
      sb.append(this.depTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arrAirport:");
    if (this.arrAirport == null) {
      sb.append("null");
    } else {
      sb.append(this.arrAirport);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arrDate:");
    if (this.arrDate == null) {
      sb.append("null");
    } else {
      sb.append(this.arrDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arrTime:");
    if (this.arrTime == null) {
      sb.append("null");
    } else {
      sb.append(this.arrTime);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (flightNo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'flightNo' was not present! Struct: " + toString());
    }
    if (origflightNo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'origflightNo' was not present! Struct: " + toString());
    }
    if (cabin == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cabin' was not present! Struct: " + toString());
    }
    if (depAirport == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'depAirport' was not present! Struct: " + toString());
    }
    if (depDate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'depDate' was not present! Struct: " + toString());
    }
    if (depTime == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'depTime' was not present! Struct: " + toString());
    }
    if (arrAirport == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'arrAirport' was not present! Struct: " + toString());
    }
    if (arrDate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'arrDate' was not present! Struct: " + toString());
    }
    if (arrTime == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'arrTime' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EndorseFlightSegmentStandardSchemeFactory implements SchemeFactory {
    public EndorseFlightSegmentStandardScheme getScheme() {
      return new EndorseFlightSegmentStandardScheme();
    }
  }

  private static class EndorseFlightSegmentStandardScheme extends StandardScheme<EndorseFlightSegment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EndorseFlightSegment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FLIGHT_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.flightNo = iprot.readString();
              struct.setFlightNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORIGFLIGHT_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.origflightNo = iprot.readString();
              struct.setOrigflightNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CABIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cabin = iprot.readString();
              struct.setCabinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEP_AIRPORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.depAirport = iprot.readString();
              struct.setDepAirportIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DEP_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.depDate = iprot.readString();
              struct.setDepDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DEP_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.depTime = iprot.readString();
              struct.setDepTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ARR_AIRPORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.arrAirport = iprot.readString();
              struct.setArrAirportIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ARR_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.arrDate = iprot.readString();
              struct.setArrDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // ARR_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.arrTime = iprot.readString();
              struct.setArrTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EndorseFlightSegment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.flightNo != null) {
        oprot.writeFieldBegin(FLIGHT_NO_FIELD_DESC);
        oprot.writeString(struct.flightNo);
        oprot.writeFieldEnd();
      }
      if (struct.origflightNo != null) {
        oprot.writeFieldBegin(ORIGFLIGHT_NO_FIELD_DESC);
        oprot.writeString(struct.origflightNo);
        oprot.writeFieldEnd();
      }
      if (struct.cabin != null) {
        oprot.writeFieldBegin(CABIN_FIELD_DESC);
        oprot.writeString(struct.cabin);
        oprot.writeFieldEnd();
      }
      if (struct.depAirport != null) {
        oprot.writeFieldBegin(DEP_AIRPORT_FIELD_DESC);
        oprot.writeString(struct.depAirport);
        oprot.writeFieldEnd();
      }
      if (struct.depDate != null) {
        oprot.writeFieldBegin(DEP_DATE_FIELD_DESC);
        oprot.writeString(struct.depDate);
        oprot.writeFieldEnd();
      }
      if (struct.depTime != null) {
        oprot.writeFieldBegin(DEP_TIME_FIELD_DESC);
        oprot.writeString(struct.depTime);
        oprot.writeFieldEnd();
      }
      if (struct.arrAirport != null) {
        oprot.writeFieldBegin(ARR_AIRPORT_FIELD_DESC);
        oprot.writeString(struct.arrAirport);
        oprot.writeFieldEnd();
      }
      if (struct.arrDate != null) {
        oprot.writeFieldBegin(ARR_DATE_FIELD_DESC);
        oprot.writeString(struct.arrDate);
        oprot.writeFieldEnd();
      }
      if (struct.arrTime != null) {
        oprot.writeFieldBegin(ARR_TIME_FIELD_DESC);
        oprot.writeString(struct.arrTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EndorseFlightSegmentTupleSchemeFactory implements SchemeFactory {
    public EndorseFlightSegmentTupleScheme getScheme() {
      return new EndorseFlightSegmentTupleScheme();
    }
  }

  private static class EndorseFlightSegmentTupleScheme extends TupleScheme<EndorseFlightSegment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EndorseFlightSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.flightNo);
      oprot.writeString(struct.origflightNo);
      oprot.writeString(struct.cabin);
      oprot.writeString(struct.depAirport);
      oprot.writeString(struct.depDate);
      oprot.writeString(struct.depTime);
      oprot.writeString(struct.arrAirport);
      oprot.writeString(struct.arrDate);
      oprot.writeString(struct.arrTime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EndorseFlightSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.flightNo = iprot.readString();
      struct.setFlightNoIsSet(true);
      struct.origflightNo = iprot.readString();
      struct.setOrigflightNoIsSet(true);
      struct.cabin = iprot.readString();
      struct.setCabinIsSet(true);
      struct.depAirport = iprot.readString();
      struct.setDepAirportIsSet(true);
      struct.depDate = iprot.readString();
      struct.setDepDateIsSet(true);
      struct.depTime = iprot.readString();
      struct.setDepTimeIsSet(true);
      struct.arrAirport = iprot.readString();
      struct.setArrAirportIsSet(true);
      struct.arrDate = iprot.readString();
      struct.setArrDateIsSet(true);
      struct.arrTime = iprot.readString();
      struct.setArrTimeIsSet(true);
    }
  }

}

