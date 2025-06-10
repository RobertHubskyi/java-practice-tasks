package org.example.Module_12_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Unite {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();

        names.add("Robert");
        names.add("Den");
        names.add("Sol");
        names.add("Nas");

        names2.add("Dan");
        names2.add("Den");
        names2.add("Nas");

        System.out.println("Cписок імен до об'єднання та видалення дублікатів: "
                + names + " + " + names2);

        names.addAll(names2);
        Set<String> unique = new LinkedHashSet<>(names);
        names = new ArrayList<>(unique);

        System.out.println("\nСписок імен після об'єдання та видалення дублікатів: ");
        for (String name : names){
            System.out.println(name);
        }
    }
}
