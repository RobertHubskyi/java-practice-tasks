package org.example.Module_12_Collections.StreamBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllProductsFromOrders {
    public static void main(String[] args) {

        List<Product> order1Products = Arrays.asList(
                new Product("Milk", 67, "Dairy"),
                new Product("Butter", 165, "Dairy"),
                new Product("Coffee", 216, "Drinks")
        );

        List<Product> order2Products = Arrays.asList(
                new Product("Bread", 34, "Bakery"),
                new Product("Cake", 86, "Bakery"),
                new Product("Tea", 723, "Drinks")
        );

        Order order1 = new Order("Alice", order1Products);
        Order order2 = new Order("Bob", order2Products);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        List<Product> allProducts = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println("Продукти з усіх замовлень:");

        allProducts.forEach(product -> System.out.println(" - " + product));
    }
}



