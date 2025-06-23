package org.example.Module_12_Collections.StreamBasics;

import java.util.List;

public class Order {
    private String customer;
    private List<Product> products;

    public Order(String customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return customer + ": " + products.size() + " products";
    }
}
