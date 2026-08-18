package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class Address {
    @Id
    private int addressid;
    private String street;
    private String city;
    private String state;
    private int zip;

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(int addressid,String street, String city, String state, int zip) {
        this.addressid = addressid;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address() {
        super();
    }
    @Override
    public String toString() {
        return "org.example.Address{" +
                "addressid=" + addressid + '\'' +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

}
