package org.example.Module_12_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful and versatile";
        String sentence2 = "Python is popular and another language";

        String[] words = sentence.split(" ");
        String[] words2 = sentence2.split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(words));
        Set<String> set2 = new HashSet<>(Arrays.asList(words2));

        set.retainAll(set2);
        System.out.println("Спільні слова: " + set);

    }
}
