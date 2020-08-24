package com.example;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Address {


    @NotBlank
    private String country;
    @NotBlank
    private String city;

    private Integer pincode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
}
