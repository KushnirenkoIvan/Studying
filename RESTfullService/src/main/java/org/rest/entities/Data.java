package org.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Data {

    @JsonIgnore
    private Integer id;

    @JsonIgnore
    private Integer userId;

    @JsonProperty("user_data")
    private String data;

    @JsonProperty("creation_date")
    private Date creation_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Data() {
    }

    public Data(Integer id, Integer userId, String data, Date creation_date) {
        this.id = id;
        this.userId = userId;
        this.data = data;
        this.creation_date = creation_date;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", userId=" + userId +
                ", data='" + data + '\'' +
                ", creation_date=" + creation_date +
                '}';
    }
}
