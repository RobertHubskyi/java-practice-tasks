package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindExpensiveProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Orange", 78));
        products.add(new Product("Butter", 165));
        products.add(new Product("Oil", 86));
        products.add(new Product("Water", 35));
        products.add(new Product("Tea", 723));

        Optional<Product> expensiveProduct = products.stream()
                .filter(p -> p.getPrice() > 500)
                .findFirst();

        if (expensiveProduct.isPresent()) {
            System.out.println("Знайдено продукт дорожчий за 500: " + expensiveProduct.get());
        } else {
            System.out.println("Продукт дорожчий за 500 - не знайдено");


        }
    }
}