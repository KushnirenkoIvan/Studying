package org.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestInfo {

    private Integer id;
    private Date creationDate;
    private String info;
    private Integer errorCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public TestInfo() {
    }

    public TestInfo(Integer id, Date creationDate, String info, Integer errorCode) {
        this.id = id;
        this.creationDate = creationDate;
        this.info = info;
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
                ", id=" + id +
                ", creationDate=" + creationDate +
                "errorCode=" + errorCode +
                ", info='" + info + '\'' +
                '}';
    }
}
