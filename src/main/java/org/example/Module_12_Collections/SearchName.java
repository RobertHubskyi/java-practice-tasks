package org.example.Module_12_Collections;

import java.util.ArrayList;

public class SearchName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Robert");
        names.add("Den");
        names.add("Sol");
        names.add("Nas");

        System.out.println("Список імен: ");
        for (String name : names){
            System.out.println(name);
        }

        String nameToReplace = "Sol";
        String newName = "Bob";

        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(nameToReplace)){
                names.set(i, newName);
            }
        }

        System.out.println("\nОновлений список:");
        for (String name : names){
            System.out.println(name);
        }
    }
}
