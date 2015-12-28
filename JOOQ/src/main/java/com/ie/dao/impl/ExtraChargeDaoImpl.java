package com.ie.dao.impl;


import com.ie.dao.ExtraChargeDao;
import com.ie.entities.dev_ie_arm.tables.records.ExtrachargeRecord;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExtraChargeDaoImpl implements ExtraChargeDao {


    @Autowired
    private DefaultDSLContext dsl;


    @Override
    public Integer create(ExtrachargeRecord extrachargeRecord) {
        return null;
    }

    @Override
    public ExtrachargeRecord read(Integer id) {
        return null;
    }

    @Override
    public boolean update(ExtrachargeRecord extrachargeRecord) {
        return false;
    }

    @Override
    public boolean delete(ExtrachargeRecord extrachargeRecord) {
        return false;
    }

}
