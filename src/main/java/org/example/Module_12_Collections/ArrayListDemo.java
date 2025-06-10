package org.example.Module_12_Collections;

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Strawberry");
        fruit.add("Blueberry");
        fruit.add("Orange");

        System.out.println("Фрукти: " + fruit);
        System.out.println("Кількість фруктів у масиві: " + fruit.size());
        System.out.println("Перший фрукт: " + fruit.get(0) + "  ||  Другий: " + fruit.get(4));
    }
}
