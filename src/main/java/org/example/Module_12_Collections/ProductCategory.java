package org.example.Module_12_Collections;

import java.util.*;

public class ProductCategory {
    public static void main(String[] args) {
        Map<String, List<String>> productsByCategory = new HashMap<>();

        productsByCategory.putIfAbsent("Food", new ArrayList<>());
        productsByCategory.get("Food").add("Bread");
        productsByCategory.get("Food").add("But");
        productsByCategory.get("Food").add("Cheese");
        productsByCategory.get("Food").add("Milk");

        productsByCategory.putIfAbsent("Drinks", new ArrayList<>());
        productsByCategory.get("Drinks").add("Energy");
        productsByCategory.get("Drinks").add("Coca-cola");
        productsByCategory.get("Drinks").add("Water");
        productsByCategory.get("Drinks").add("Juice");

        List<Double> pricesOfDrinks = Arrays.asList(27.4, 50.7, 15.2, 76.3);
        List<Double> pricesOfFood = Arrays.asList(15.5, 170.5, 300.5, 60.4);
        double sumOfFood = 0;
        double sumOfDrinks = 0;

        for (double price : pricesOfFood){
            sumOfFood += price;

        }
        for (double price : pricesOfDrinks){
            sumOfDrinks += price;

        }

       for (Map.Entry<String, List<String>> entry : productsByCategory.entrySet()){
           System.out.println("\nКатегорія: " + entry.getKey());
           for (String product : entry.getValue()){
               System.out.println(" - " + product);
           }

       }

        double averageOfFood = sumOfFood / pricesOfFood.size();
        double averageOfDrinks = sumOfDrinks / pricesOfDrinks.size();

        System.out.println("Середня ціна продуктів: " + averageOfFood);
        System.out.println("Середня ціна напоїв: " + averageOfDrinks);

    }
}
