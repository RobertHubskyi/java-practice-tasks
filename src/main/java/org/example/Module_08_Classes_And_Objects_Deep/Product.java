package org.example.Module_08_Classes_And_Objects_Deep;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public Product() {
        this.name = "Невідомий";
        this.price = 0.0;
        this.quantity = 0;
    }

    public void printInfo() {
        System.out.println("Назва: " + name + ", ціна: " + price + ", кількість: " + quantity);
    }

    public static void main(String[] args) {
        Product[] product = {
                new Product("Молоко", 45, 2),
                new Product("Сметана", 54),
                new Product()
        };


        for (Product product1 : product){
            product1.printInfo();
        }
    }
}
