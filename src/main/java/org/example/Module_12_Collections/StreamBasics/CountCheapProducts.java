package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.List;

public class CountCheapProducts {
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

        long countCheap = products.stream()
                .filter(p -> p.getPrice() < 200)
                .count();

        System.out.println("Кількість продуктів дешевших за 200: " + countCheap);

    }
}
