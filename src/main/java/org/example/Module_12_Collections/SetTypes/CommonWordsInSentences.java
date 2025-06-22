package org.example.Module_12_Collections.SetTypes;

import java.util.*;

public class CommonWordsInSentences {
    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful and fun",
                "Learning Java is fun",
                "Fun with Java and programming"
        };


        Set<String> commonWords = new HashSet<>(Arrays.asList(sentences[0].toLowerCase().split(" ")));


        for (int i = 1; i < sentences.length; i++) {
            Set<String> currentWords = new HashSet<>(Arrays.asList(sentences[i].toLowerCase().split(" ")));
            commonWords.retainAll(currentWords);
        }

        System.out.println("Слова, які зустрічаються в кожному реченні:");
        for (String word : commonWords) {
            System.out.println(word);
        }
    }
}