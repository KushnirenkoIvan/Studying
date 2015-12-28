/**
 * This class is generated by jOOQ
 */
package com.ie.entities.dev_ie_arm.tables.records;


import com.ie.entities.dev_ie_arm.tables.Servicecenter;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServicecenterRecord extends UpdatableRecordImpl<ServicecenterRecord> {

	private static final long serialVersionUID = 210307410;

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.changed</code>.
	 */
	public void setChanged(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.changed</code>.
	 */
	public Timestamp getChanged() {
		return (Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.created</code>.
	 */
	public void setCreated(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.created</code>.
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.address</code>.
	 */
	public void setAddress(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.address</code>.
	 */
	public String getAddress() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.agreementNo</code>.
	 */
	public void setAgreementno(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.agreementNo</code>.
	 */
	public String getAgreementno() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.agreementDate</code>.
	 */
	public void setAgreementdate(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.agreementDate</code>.
	 */
	public Timestamp getAgreementdate() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.ballance</code>.
	 */
	public void setBallance(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.ballance</code>.
	 */
	public Integer getBallance() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.code</code>.
	 */
	public void setCode(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.code</code>.
	 */
	public String getCode() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.organizationalForm</code>.
	 */
	public void setOrganizationalform(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.organizationalForm</code>.
	 */
	public String getOrganizationalform() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.name</code>.
	 */
	public void setName(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.name</code>.
	 */
	public String getName() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.nameShort</code>.
	 */
	public void setNameshort(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.nameShort</code>.
	 */
	public String getNameshort() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.nameForAct</code>.
	 */
	public void setNameforact(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.nameForAct</code>.
	 */
	public String getNameforact() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.status</code>.
	 */
	public void setStatus(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.status</code>.
	 */
	public String getStatus() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.changedById</code>.
	 */
	public void setChangedbyid(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.changedById</code>.
	 */
	public Integer getChangedbyid() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.billingInfo</code>.
	 */
	public void setBillinginfo(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.billingInfo</code>.
	 */
	public String getBillinginfo() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.personPost</code>.
	 */
	public void setPersonpost(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.personPost</code>.
	 */
	public String getPersonpost() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.directName</code>.
	 */
	public void setDirectname(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.directName</code>.
	 */
	public String getDirectname() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.actingUnder</code>.
	 */
	public void setActingunder(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.actingUnder</code>.
	 */
	public String getActingunder() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.changedBy_id</code>.
	 */
	public void setChangedbyId(Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.changedBy_id</code>.
	 */
	public Integer getChangedbyId() {
		return (Integer) getValue(18);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.email</code>.
	 */
	public void setEmail(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.registrationСertificate</code>.
	 */
	public void setRegistrationсertificate(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.registrationСertificate</code>.
	 */
	public String getRegistrationсertificate() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.ipn</code>.
	 */
	public void setIpn(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.ipn</code>.
	 */
	public String getIpn() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>dev_ie_arm.ServiceCenter.taxTreatment</code>.
	 */
	public void setTaxtreatment(String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.ServiceCenter.taxTreatment</code>.
	 */
	public String getTaxtreatment() {
		return (String) getValue(22);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ServicecenterRecord
	 */
	public ServicecenterRecord() {
		super(Servicecenter.SERVICECENTER);
	}

	/**
	 * Create a detached, initialised ServicecenterRecord
	 */
	public ServicecenterRecord(Integer id, Timestamp changed, Timestamp created, String address, String agreementno, Timestamp agreementdate, Integer ballance, String code, String organizationalform, String name, String nameshort, String nameforact, String status, Integer changedbyid, String billinginfo, String personpost, String directname, String actingunder, Integer changedbyId, String email, String registrationсertificate, String ipn, String taxtreatment) {
		super(Servicecenter.SERVICECENTER);

		setValue(0, id);
		setValue(1, changed);
		setValue(2, created);
		setValue(3, address);
		setValue(4, agreementno);
		setValue(5, agreementdate);
		setValue(6, ballance);
		setValue(7, code);
		setValue(8, organizationalform);
		setValue(9, name);
		setValue(10, nameshort);
		setValue(11, nameforact);
		setValue(12, status);
		setValue(13, changedbyid);
		setValue(14, billinginfo);
		setValue(15, personpost);
		setValue(16, directname);
		setValue(17, actingunder);
		setValue(18, changedbyId);
		setValue(19, email);
		setValue(20, registrationсertificate);
		setValue(21, ipn);
		setValue(22, taxtreatment);
	}
}
