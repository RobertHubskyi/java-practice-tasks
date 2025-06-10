package org.example.Module_12_Collections;

import java.lang.Character;
import java.util.HashSet;
import java.util.Set;

public class UniqueLetters {
    public static void main(String[] args) {
        String[] words = {"Java", "Set", "Array", "Map", "Collection"};

        Set<Character> characters = new HashSet<>();

        for(String word : words){
            for (char c : word.toLowerCase().toCharArray()){
                characters.add(c);
            }
        }
        System.out.println("Унікальні літери в словах: ");
        for (char ch  : characters){
            System.out.println(ch + " - ");

        }

    }
}
