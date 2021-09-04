package com.company;

public class DeliveryAddress {

    private CountryEnum countryEnum;
    private String city;
    private String street;

    public CountryEnum getCountryEnum() {
        return countryEnum;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public DeliveryAddress(CountryEnum countryEnum, String city, String address) {
        this.countryEnum = countryEnum;
        this.city = city;
        this.street = address;
    }
}
