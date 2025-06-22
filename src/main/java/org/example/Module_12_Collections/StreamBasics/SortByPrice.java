package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByPrice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 67));
        products.add(new Product("Bread", 34));
        products.add(new Product("Coffee", 216));
        products.add(new Product("Orange", 78));
        products.add(new Product("Butter", 165));
        products.add(new Product("Oil", 86));
        products.add(new Product("Water", 35));
        products.add(new Product("Tea", 723));

        List<Product> filtered = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());


        System.out.println("Продукти за зростанням ціни: ");
        filtered.forEach(p -> System.out.println(" - " + p));

    }
}
