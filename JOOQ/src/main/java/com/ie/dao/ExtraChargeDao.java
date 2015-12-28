package com.ie.dao;


import com.ie.entities.dev_ie_arm.tables.records.ExtrachargeRecord;

public interface ExtraChargeDao {

    Integer create(ExtrachargeRecord extrachargeRecord);

    ExtrachargeRecord read(Integer id);

    boolean update(ExtrachargeRecord extrachargeRecord);

    boolean delete(ExtrachargeRecord extrachargeRecord);

}
