package org.example.Module_12_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonUniqueWords {
    public static void main(String[] args) {
        String sentence1 = "Java is fast and secure";
        String sentence2 = "Python is easy and powerful";

        Set<String> set1 = new HashSet<>(Arrays.asList(sentence1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(sentence2.split(" ")));

        Set<String> uniqueInFirst = new HashSet<>(set1);
        uniqueInFirst.removeAll(set2);

        Set<String> uniqueInSecond = new HashSet<>(set2);
        uniqueInSecond.retainAll(set1);

        Set<String> result = new HashSet<>(uniqueInFirst);
        result.addAll(uniqueInSecond);

        System.out.println("Унікальні слова, що є лише в одному з речень: ");
        for (String word : result){
            System.out.println(" - " + word);
        }



    }
}
