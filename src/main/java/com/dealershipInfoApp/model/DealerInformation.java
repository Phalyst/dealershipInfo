package com.dealershipInfoApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DealerInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dealerShipId;
    private String dealerShipName;
    private String line1;
    private String line2;
    private String suburb;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public int getDealerShipId() {
        return dealerShipId;
    }

    public void setDealerShipId(int dealerShipId) {
        this.dealerShipId = dealerShipId;
    }

    public String getDealerShipName() {
        return dealerShipName;
    }

    public void setDealerShipName(String dealerShipName) {
        this.dealerShipName = dealerShipName;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }






}
