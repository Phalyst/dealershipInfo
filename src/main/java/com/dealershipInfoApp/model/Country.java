package com.dealershipInfoApp.model;

import javax.persistence.*;

@Entity

@Table(indexes = @Index(name="index_countrycode",columnList = "COUNTRY_CODE"))
public class Country{


    @Id
    @Column(name = "COUNTRY_CODE", nullable = false)
    private String countryCode;

    private String name;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }



}
