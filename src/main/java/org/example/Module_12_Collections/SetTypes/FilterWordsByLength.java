package org.example.Module_12_Collections.SetTypes;

import java.util.HashSet;
import java.util.Set;

public class FilterWordsByLength {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "pear", "apple", "grape", "kiwi", "banana", "melon"
        };

        Set<String> fruit = new HashSet<>();


        for (String word : words){
            if (word.length() > 4){
                fruit.add(word);
            }
        }

        System.out.println("Слова, які мають більше ніж 4 букви: ");
        for (String w : fruit){
            System.out.println(w);
        }
    }
}
