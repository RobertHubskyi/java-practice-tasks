package org.example.Module_12_Collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Robert");
        names.add("Den");
        names.add("Sol");
        names.add("Den");
        names.add("Sol");
        names.add("Nas");

        System.out.println("Унікальні імена: ");
        for (String name : names) {
            System.out.println(" - " + name);
        }
    }
}

