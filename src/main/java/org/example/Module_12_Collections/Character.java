package org.example.Module_12_Collections;

import java.util.HashMap;
import java.util.Map;

public class Character {
    public static void main(String[] args) {

        String sentence = "Hello, Java";
        String[] character = sentence.toLowerCase().replaceAll("[^a-z]", "").split("");
        for (String letter : character) {
            System.out.println(letter);
        }

        Map<String, Integer> count = new HashMap<>();

        for (String letter : character) {
            if (count.containsKey(letter)) {
                count.put(letter, count.getOrDefault(letter, 0) + 1);
            } else {
                count.put(letter, 1);
            }
        }

        System.out.println("Кількість букв в реченні: ");
        for (Map.Entry<String, Integer> entry : count.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
