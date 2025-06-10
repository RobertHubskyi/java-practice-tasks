package org.example.Module_12_Collections;

import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Den");
        names.add("Robert");
        names.add("Sol");
        names.add("Nas");
        names.add("Dan");

        System.out.println("Початковий список:");

        for (String name : names){
            System.out.println(name);
        }

        names.set(1, "Роберт");
        names.remove("Den");

        System.out.println("\nЗмінений список: ");

        for (String name : names){
            System.out.println(name);
        }
    }
}
