package org.example.Module_08_Classes_And_Objects_Deep;

public class Address {
    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }


    @Override
    public String toString() {
        return city + ", вул. " + street + ", буд. " + houseNumber;
    }
}