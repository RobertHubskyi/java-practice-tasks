package org.example.Module_12_Collections.SetTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsFromSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful".toLowerCase();

        Set<String> words = new HashSet<>(Arrays.asList(sentence.split(" ")));

        System.out.println("Унікальні слова в реченні: ");
        for(String word : words){
            System.out.println(word);

        }
    }
}
