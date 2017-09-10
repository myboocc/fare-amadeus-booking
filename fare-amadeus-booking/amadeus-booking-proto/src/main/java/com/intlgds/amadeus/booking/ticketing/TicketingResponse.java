/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.intlgds.amadeus.booking.ticketing;

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

public class TicketingResponse implements org.apache.thrift.TBase<TicketingResponse, TicketingResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TicketingResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ORDER_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("orderNo", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CUSTOMER_ORDER_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("customerOrderNo", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PNR_FIELD_DESC = new org.apache.thrift.protocol.TField("pnr", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField AFTER_PAY_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("afterPayURL", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TicketingResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TicketingResponseTupleSchemeFactory());
  }

  public String status; // required
  public String msg; // optional
  public String orderNo; // required
  public String customerOrderNo; // required
  public String pnr; // required
  public String afterPayURL; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    MSG((short)2, "msg"),
    ORDER_NO((short)3, "orderNo"),
    CUSTOMER_ORDER_NO((short)4, "customerOrderNo"),
    PNR((short)5, "pnr"),
    AFTER_PAY_URL((short)6, "afterPayURL");

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
        case 1: // STATUS
          return STATUS;
        case 2: // MSG
          return MSG;
        case 3: // ORDER_NO
          return ORDER_NO;
        case 4: // CUSTOMER_ORDER_NO
          return CUSTOMER_ORDER_NO;
        case 5: // PNR
          return PNR;
        case 6: // AFTER_PAY_URL
          return AFTER_PAY_URL;
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
  private _Fields optionals[] = {_Fields.MSG,_Fields.AFTER_PAY_URL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORDER_NO, new org.apache.thrift.meta_data.FieldMetaData("orderNo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CUSTOMER_ORDER_NO, new org.apache.thrift.meta_data.FieldMetaData("customerOrderNo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PNR, new org.apache.thrift.meta_data.FieldMetaData("pnr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AFTER_PAY_URL, new org.apache.thrift.meta_data.FieldMetaData("afterPayURL", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TicketingResponse.class, metaDataMap);
  }

  public TicketingResponse() {
  }

  public TicketingResponse(
    String status,
    String orderNo,
    String customerOrderNo,
    String pnr)
  {
    this();
    this.status = status;
    this.orderNo = orderNo;
    this.customerOrderNo = customerOrderNo;
    this.pnr = pnr;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TicketingResponse(TicketingResponse other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetOrderNo()) {
      this.orderNo = other.orderNo;
    }
    if (other.isSetCustomerOrderNo()) {
      this.customerOrderNo = other.customerOrderNo;
    }
    if (other.isSetPnr()) {
      this.pnr = other.pnr;
    }
    if (other.isSetAfterPayURL()) {
      this.afterPayURL = other.afterPayURL;
    }
  }

  public TicketingResponse deepCopy() {
    return new TicketingResponse(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.msg = null;
    this.orderNo = null;
    this.customerOrderNo = null;
    this.pnr = null;
    this.afterPayURL = null;
  }

  public String getStatus() {
    return this.status;
  }

  public TicketingResponse setStatus(String status) {
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

  public String getMsg() {
    return this.msg;
  }

  public TicketingResponse setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public String getOrderNo() {
    return this.orderNo;
  }

  public TicketingResponse setOrderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  public void unsetOrderNo() {
    this.orderNo = null;
  }

  /** Returns true if field orderNo is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderNo() {
    return this.orderNo != null;
  }

  public void setOrderNoIsSet(boolean value) {
    if (!value) {
      this.orderNo = null;
    }
  }

  public String getCustomerOrderNo() {
    return this.customerOrderNo;
  }

  public TicketingResponse setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
    return this;
  }

  public void unsetCustomerOrderNo() {
    this.customerOrderNo = null;
  }

  /** Returns true if field customerOrderNo is set (has been assigned a value) and false otherwise */
  public boolean isSetCustomerOrderNo() {
    return this.customerOrderNo != null;
  }

  public void setCustomerOrderNoIsSet(boolean value) {
    if (!value) {
      this.customerOrderNo = null;
    }
  }

  public String getPnr() {
    return this.pnr;
  }

  public TicketingResponse setPnr(String pnr) {
    this.pnr = pnr;
    return this;
  }

  public void unsetPnr() {
    this.pnr = null;
  }

  /** Returns true if field pnr is set (has been assigned a value) and false otherwise */
  public boolean isSetPnr() {
    return this.pnr != null;
  }

  public void setPnrIsSet(boolean value) {
    if (!value) {
      this.pnr = null;
    }
  }

  public String getAfterPayURL() {
    return this.afterPayURL;
  }

  public TicketingResponse setAfterPayURL(String afterPayURL) {
    this.afterPayURL = afterPayURL;
    return this;
  }

  public void unsetAfterPayURL() {
    this.afterPayURL = null;
  }

  /** Returns true if field afterPayURL is set (has been assigned a value) and false otherwise */
  public boolean isSetAfterPayURL() {
    return this.afterPayURL != null;
  }

  public void setAfterPayURLIsSet(boolean value) {
    if (!value) {
      this.afterPayURL = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case ORDER_NO:
      if (value == null) {
        unsetOrderNo();
      } else {
        setOrderNo((String)value);
      }
      break;

    case CUSTOMER_ORDER_NO:
      if (value == null) {
        unsetCustomerOrderNo();
      } else {
        setCustomerOrderNo((String)value);
      }
      break;

    case PNR:
      if (value == null) {
        unsetPnr();
      } else {
        setPnr((String)value);
      }
      break;

    case AFTER_PAY_URL:
      if (value == null) {
        unsetAfterPayURL();
      } else {
        setAfterPayURL((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case MSG:
      return getMsg();

    case ORDER_NO:
      return getOrderNo();

    case CUSTOMER_ORDER_NO:
      return getCustomerOrderNo();

    case PNR:
      return getPnr();

    case AFTER_PAY_URL:
      return getAfterPayURL();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case MSG:
      return isSetMsg();
    case ORDER_NO:
      return isSetOrderNo();
    case CUSTOMER_ORDER_NO:
      return isSetCustomerOrderNo();
    case PNR:
      return isSetPnr();
    case AFTER_PAY_URL:
      return isSetAfterPayURL();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TicketingResponse)
      return this.equals((TicketingResponse)that);
    return false;
  }

  public boolean equals(TicketingResponse that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_orderNo = true && this.isSetOrderNo();
    boolean that_present_orderNo = true && that.isSetOrderNo();
    if (this_present_orderNo || that_present_orderNo) {
      if (!(this_present_orderNo && that_present_orderNo))
        return false;
      if (!this.orderNo.equals(that.orderNo))
        return false;
    }

    boolean this_present_customerOrderNo = true && this.isSetCustomerOrderNo();
    boolean that_present_customerOrderNo = true && that.isSetCustomerOrderNo();
    if (this_present_customerOrderNo || that_present_customerOrderNo) {
      if (!(this_present_customerOrderNo && that_present_customerOrderNo))
        return false;
      if (!this.customerOrderNo.equals(that.customerOrderNo))
        return false;
    }

    boolean this_present_pnr = true && this.isSetPnr();
    boolean that_present_pnr = true && that.isSetPnr();
    if (this_present_pnr || that_present_pnr) {
      if (!(this_present_pnr && that_present_pnr))
        return false;
      if (!this.pnr.equals(that.pnr))
        return false;
    }

    boolean this_present_afterPayURL = true && this.isSetAfterPayURL();
    boolean that_present_afterPayURL = true && that.isSetAfterPayURL();
    if (this_present_afterPayURL || that_present_afterPayURL) {
      if (!(this_present_afterPayURL && that_present_afterPayURL))
        return false;
      if (!this.afterPayURL.equals(that.afterPayURL))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TicketingResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TicketingResponse typedOther = (TicketingResponse)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderNo()).compareTo(typedOther.isSetOrderNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderNo, typedOther.orderNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustomerOrderNo()).compareTo(typedOther.isSetCustomerOrderNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustomerOrderNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customerOrderNo, typedOther.customerOrderNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPnr()).compareTo(typedOther.isSetPnr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPnr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pnr, typedOther.pnr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAfterPayURL()).compareTo(typedOther.isSetAfterPayURL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAfterPayURL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.afterPayURL, typedOther.afterPayURL);
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
    StringBuilder sb = new StringBuilder("TicketingResponse(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetMsg()) {
      if (!first) sb.append(", ");
      sb.append("msg:");
      if (this.msg == null) {
        sb.append("null");
      } else {
        sb.append(this.msg);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("orderNo:");
    if (this.orderNo == null) {
      sb.append("null");
    } else {
      sb.append(this.orderNo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("customerOrderNo:");
    if (this.customerOrderNo == null) {
      sb.append("null");
    } else {
      sb.append(this.customerOrderNo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pnr:");
    if (this.pnr == null) {
      sb.append("null");
    } else {
      sb.append(this.pnr);
    }
    first = false;
    if (isSetAfterPayURL()) {
      if (!first) sb.append(", ");
      sb.append("afterPayURL:");
      if (this.afterPayURL == null) {
        sb.append("null");
      } else {
        sb.append(this.afterPayURL);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    if (orderNo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderNo' was not present! Struct: " + toString());
    }
    if (customerOrderNo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'customerOrderNo' was not present! Struct: " + toString());
    }
    if (pnr == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pnr' was not present! Struct: " + toString());
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

  private static class TicketingResponseStandardSchemeFactory implements SchemeFactory {
    public TicketingResponseStandardScheme getScheme() {
      return new TicketingResponseStandardScheme();
    }
  }

  private static class TicketingResponseStandardScheme extends StandardScheme<TicketingResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TicketingResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ORDER_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orderNo = iprot.readString();
              struct.setOrderNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CUSTOMER_ORDER_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.customerOrderNo = iprot.readString();
              struct.setCustomerOrderNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PNR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pnr = iprot.readString();
              struct.setPnrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AFTER_PAY_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.afterPayURL = iprot.readString();
              struct.setAfterPayURLIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TicketingResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        if (struct.isSetMsg()) {
          oprot.writeFieldBegin(MSG_FIELD_DESC);
          oprot.writeString(struct.msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.orderNo != null) {
        oprot.writeFieldBegin(ORDER_NO_FIELD_DESC);
        oprot.writeString(struct.orderNo);
        oprot.writeFieldEnd();
      }
      if (struct.customerOrderNo != null) {
        oprot.writeFieldBegin(CUSTOMER_ORDER_NO_FIELD_DESC);
        oprot.writeString(struct.customerOrderNo);
        oprot.writeFieldEnd();
      }
      if (struct.pnr != null) {
        oprot.writeFieldBegin(PNR_FIELD_DESC);
        oprot.writeString(struct.pnr);
        oprot.writeFieldEnd();
      }
      if (struct.afterPayURL != null) {
        if (struct.isSetAfterPayURL()) {
          oprot.writeFieldBegin(AFTER_PAY_URL_FIELD_DESC);
          oprot.writeString(struct.afterPayURL);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TicketingResponseTupleSchemeFactory implements SchemeFactory {
    public TicketingResponseTupleScheme getScheme() {
      return new TicketingResponseTupleScheme();
    }
  }

  private static class TicketingResponseTupleScheme extends TupleScheme<TicketingResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TicketingResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.status);
      oprot.writeString(struct.orderNo);
      oprot.writeString(struct.customerOrderNo);
      oprot.writeString(struct.pnr);
      BitSet optionals = new BitSet();
      if (struct.isSetMsg()) {
        optionals.set(0);
      }
      if (struct.isSetAfterPayURL()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetAfterPayURL()) {
        oprot.writeString(struct.afterPayURL);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TicketingResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = iprot.readString();
      struct.setStatusIsSet(true);
      struct.orderNo = iprot.readString();
      struct.setOrderNoIsSet(true);
      struct.customerOrderNo = iprot.readString();
      struct.setCustomerOrderNoIsSet(true);
      struct.pnr = iprot.readString();
      struct.setPnrIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(1)) {
        struct.afterPayURL = iprot.readString();
        struct.setAfterPayURLIsSet(true);
      }
    }
  }

}
