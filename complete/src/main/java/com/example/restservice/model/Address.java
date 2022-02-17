package com.example.restservice.model;

public class Address {

    private int numb;
    private String street;
    private String city;
    private String postalCode;

    public Address(int numb, String street, String city, String postalCode) {
        this.numb = numb;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
