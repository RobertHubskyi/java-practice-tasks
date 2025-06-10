package org.example.Module_12_Collections;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HowMany {
    public static void main(String[] args) {
        String sentence = "I will work, as a Java Developer, it's will be true";
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").split(" ");
        for (String word : words){
            System.out.println(word);
        }

        Map<String, Integer> count = new HashMap<>();

        for (String word : words){
            if (count.containsKey(word)){
                count.put(word, count.get(word) + 1);
            }else {
                count.put(word, 1);
            }
        }

        System.out.println("Підрахування кількості слів в реченні: ");
        for (Map.Entry<String, Integer> entry : count.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
