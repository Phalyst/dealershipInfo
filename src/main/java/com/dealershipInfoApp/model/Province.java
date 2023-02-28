package com.dealershipInfoApp.model;

import javax.persistence.*;

@Entity
@IdClass(ProvinceCompositeKey.class)
public class Province {

    @Id
    private String provinceCode;

    @Id
    private String countryCode;
    private String name;
    public String getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
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
        this.name = name;
    }
}
