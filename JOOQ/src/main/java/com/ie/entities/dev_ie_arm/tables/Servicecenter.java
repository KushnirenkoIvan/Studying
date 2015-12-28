/**
 * This class is generated by jOOQ
 */
package com.ie.entities.dev_ie_arm.tables;


import com.ie.entities.dev_ie_arm.DevIeArm;
import com.ie.entities.dev_ie_arm.Keys;
import com.ie.entities.dev_ie_arm.tables.records.ServicecenterRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Servicecenter extends TableImpl<ServicecenterRecord> {

	private static final long serialVersionUID = 759148610;

	/**
	 * The reference instance of <code>dev_ie_arm.ServiceCenter</code>
	 */
	public static final Servicecenter SERVICECENTER = new Servicecenter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ServicecenterRecord> getRecordType() {
		return ServicecenterRecord.class;
	}

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.id</code>.
	 */
	public static final TableField<ServicecenterRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.changed</code>.
	 */
	public static final TableField<ServicecenterRecord, Timestamp> CHANGED = createField("changed", org.jooq.impl.SQLDataType.TIMESTAMP, SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.created</code>.
	 */
	public static final TableField<ServicecenterRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.address</code>.
	 */
	public static final TableField<ServicecenterRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(200), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.agreementNo</code>.
	 */
	public static final TableField<ServicecenterRecord, String> AGREEMENTNO = createField("agreementNo", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.agreementDate</code>.
	 */
	public static final TableField<ServicecenterRecord, Timestamp> AGREEMENTDATE = createField("agreementDate", org.jooq.impl.SQLDataType.TIMESTAMP, SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.ballance</code>.
	 */
	public static final TableField<ServicecenterRecord, Integer> BALLANCE = createField("ballance", org.jooq.impl.SQLDataType.INTEGER.nullable(false), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.code</code>.
	 */
	public static final TableField<ServicecenterRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.organizationalForm</code>.
	 */
	public static final TableField<ServicecenterRecord, String> ORGANIZATIONALFORM = createField("organizationalForm", org.jooq.impl.SQLDataType.VARCHAR.length(45), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.name</code>.
	 */
	public static final TableField<ServicecenterRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(250), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.nameShort</code>.
	 */
	public static final TableField<ServicecenterRecord, String> NAMESHORT = createField("nameShort", org.jooq.impl.SQLDataType.VARCHAR.length(100), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.nameForAct</code>.
	 */
	public static final TableField<ServicecenterRecord, String> NAMEFORACT = createField("nameForAct", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.status</code>.
	 */
	public static final TableField<ServicecenterRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(16), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.changedById</code>.
	 */
	public static final TableField<ServicecenterRecord, Integer> CHANGEDBYID = createField("changedById", org.jooq.impl.SQLDataType.INTEGER, SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.billingInfo</code>.
	 */
	public static final TableField<ServicecenterRecord, String> BILLINGINFO = createField("billingInfo", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.personPost</code>.
	 */
	public static final TableField<ServicecenterRecord, String> PERSONPOST = createField("personPost", org.jooq.impl.SQLDataType.VARCHAR.length(45), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.directName</code>.
	 */
	public static final TableField<ServicecenterRecord, String> DIRECTNAME = createField("directName", org.jooq.impl.SQLDataType.VARCHAR.length(150), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.actingUnder</code>.
	 */
	public static final TableField<ServicecenterRecord, String> ACTINGUNDER = createField("actingUnder", org.jooq.impl.SQLDataType.VARCHAR.length(45), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.changedBy_id</code>.
	 */
	public static final TableField<ServicecenterRecord, Integer> CHANGEDBY_ID = createField("changedBy_id", org.jooq.impl.SQLDataType.INTEGER, SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.email</code>.
	 */
	public static final TableField<ServicecenterRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.registrationСertificate</code>.
	 */
	public static final TableField<ServicecenterRecord, String> REGISTRATIONСERTIFICATE = createField("registrationСertificate", org.jooq.impl.SQLDataType.VARCHAR.length(45), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.ipn</code>.
	 */
	public static final TableField<ServicecenterRecord, String> IPN = createField("ipn", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * The column <code>dev_ie_arm.ServiceCenter.taxTreatment</code>.
	 */
	public static final TableField<ServicecenterRecord, String> TAXTREATMENT = createField("taxTreatment", org.jooq.impl.SQLDataType.VARCHAR.length(255), SERVICECENTER, "");

	/**
	 * No further instances allowed
	 */
	private Servicecenter() {
		this("ServiceCenter", null);
	}

	private Servicecenter(String alias, Table<ServicecenterRecord> aliased) {
		this(alias, aliased, null);
	}

	private Servicecenter(String alias, Table<ServicecenterRecord> aliased, Field<?>[] parameters) {
		super(alias, DevIeArm.DEV_IE_ARM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ServicecenterRecord, Integer> getIdentity() {
		return Keys.IDENTITY_SERVICECENTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ServicecenterRecord> getPrimaryKey() {
		return Keys.KEY_SERVICECENTER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ServicecenterRecord>> getKeys() {
		return Arrays.<UniqueKey<ServicecenterRecord>>asList(Keys.KEY_SERVICECENTER_PRIMARY, Keys.KEY_SERVICECENTER_AGREEMENTNO_UNIQUE);
	}
}
