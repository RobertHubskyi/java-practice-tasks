package org.example.Module_12_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " грн";
    }

    public static void main(String[] args) {
        Map<String, List<Product>> product = new HashMap<>();

        product.putIfAbsent("Food", new ArrayList<>());
        product.get("Food").add(new Product("Milk", 54));
        product.get("Food").add(new Product("Cheese", 180));
        product.get("Food").add(new Product("But", 176));
        product.get("Food").add(new Product("Bread", 35));

        product.putIfAbsent("Drinks", new ArrayList<>());
        product.get("Drinks").add(new Product("Water", 15));
        product.get("Drinks").add(new Product("Juice", 75));
        product.get("Drinks").add(new Product("Coca-cola", 54));
        product.get("Drinks").add(new Product("Tea", 132));
        product.get("Drinks").add(new Product("Coffee", 241));

        product.putIfAbsent("Tech", new ArrayList<>());
        product.get("Tech").add(new Product("Laptop", 54360));
        product.get("Tech").add(new Product("Phone", 52500));
        product.get("Tech").add(new Product("Watch", 18000));
        product.get("Tech").add(new Product("Computer", 75210));

        for (Map.Entry<String, List<Product>> entry : product.entrySet()) {
            System.out.println("Категорія: " + entry.getKey());
            for (Product products : entry.getValue()) {
                System.out.println(" - " + products);
            }
        }

        for (Map.Entry<String, List<Product>> entry : product.entrySet()) {
            double total = 0;
            for (Product p : entry.getValue()){
                total += p.getPrice();
            }

            System.out.println("Сума у категорії: " + entry.getKey() + ": " + total + " грн");
        }
    }
}
