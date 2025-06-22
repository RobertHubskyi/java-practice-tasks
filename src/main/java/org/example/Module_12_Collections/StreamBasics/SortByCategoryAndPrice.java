package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByCategoryAndPrice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 67, "Dairy"));
        products.add(new Product("Bread", 34, "Bakery"));
        products.add(new Product("Coffee", 216, "Drinks"));
        products.add(new Product("Butter", 165, "Dairy"));
        products.add(new Product("Water", 35, "Drinks"));
        products.add(new Product("Cake", 86, "Bakery"));
        products.add(new Product("Apple", 20, "Fruits"));

        List<Product> sorted = products.stream()
                .sorted(Comparator.comparing(Product::getCategory)
                        .thenComparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Продукти відсортовані спочатку за категорією, далі за ціною: ");
        sorted.forEach(s -> System.out.println(" - " + s));
    }
}
