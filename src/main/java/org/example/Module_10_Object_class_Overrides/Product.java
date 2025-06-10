package org.example.Module_10_Object_class_Overrides;

import org.example.Module_07_OOP.Person;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product[] p = {
                new Product("Молоко", 22),
                new Product("Сметана", 32),
                new Product("Кефір", 27)
        };

        for( Product product : p){

            System.out.println(product);
        }
    }
}
