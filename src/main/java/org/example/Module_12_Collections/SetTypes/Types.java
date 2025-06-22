package org.example.Module_12_Collections.SetTypes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Types {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();

        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Banana");

        HashSet<String> vegetable = new HashSet<>();

        vegetable.add("Banana");
        vegetable.add("Apple");
        vegetable.add("Orange");
        vegetable.add("Mango");
        vegetable.add("Apple");
        vegetable.add("Orange");

        LinkedHashSet<String> drinks = new LinkedHashSet<>();

        drinks.add("Banana");
        drinks.add("Apple");
        drinks.add("Orange");
        drinks.add("Mango");
        drinks.add("Apple");
        drinks.add("Banana");

        TreeSet<String> sorted = new TreeSet<>();

        sorted.add("Banana");
        sorted.add("Apple");
        sorted.add("Orange");
        sorted.add("Mango");


        System.out.println("Set: ");
        for (String fruits : fruit) {
            System.out.println(fruits);
        }

        System.out.println("\nLinkedHashSet: ");
        for (String drink : drinks) {
            System.out.println(drink);
        }

        System.out.println("\nHashSet: ");
        for (String vegetables : vegetable) {
            System.out.println(vegetables);

        }


        System.out.println("\nTreeSet:");
        for (String item : sorted) {
            System.out.println(item);
        }
    }
}
