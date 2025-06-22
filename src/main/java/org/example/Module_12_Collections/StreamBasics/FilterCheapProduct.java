package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCheapProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 22));
        products.add(new Product("Tea", 42));
        products.add(new Product("Coffee", 216));
        products.add(new Product("Potato", 45));

        List<Product> filtered = products.stream()
                .filter(p -> p.getPrice() < 100)
                .collect(Collectors.toList());

        System.out.println("Продукти дешевші за 100грн: ");
        for (Product product : filtered){
            System.out.println(" - " + product);
        }
    }
}
