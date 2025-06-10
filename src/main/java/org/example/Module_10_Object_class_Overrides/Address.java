package org.example.Module_10_Object_class_Overrides;

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
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }



    public static void main(String[] args) {
        Address address = new Address("Lviv", "Shevchenka", 21);
        System.out.println(address);
    }
}
