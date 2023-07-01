package com.hackbytesII.latlongAPI.DAO;

import org.springframework.context.annotation.Bean;

public class LocationData {

    private String street;
    private String city;
    private String state;
    private int zip;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
