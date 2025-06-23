package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionProductsByPrice {
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

        Map<Boolean, List<Product>> partitioned = products.stream()
                .collect(Collectors.partitioningBy(p -> p.getPrice() < 100));

        List<Product> cheapProducts = partitioned.get(true);
        List<Product> expensiveProducts = partitioned.get(false);

        System.out.println("Продукти дешевші за 100 грн: ");
        cheapProducts.forEach(System.out::println);

        System.out.println("Продукти дорожчі за 100 грн: ");
        expensiveProducts.forEach(System.out::println);

    }
}
