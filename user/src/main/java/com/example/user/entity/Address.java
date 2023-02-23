package com.example.user.entity;

import io.swagger.v3.oas.annotations.links.Link;

import java.util.Map;

public class Address {
    private String street;
    private String number;
    private String country;
    private String city;
    private String postCode;
    private String ID;
    private Map<String, Link> link;
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Map<String, Link> getLink() {
        return link;
    }

    public void setLink(Map<String, Link> link) {
        this.link = link;
    }
}
