package org.example.Module_12_Collections.SetTypes;

import java.util.HashSet;

public class SetTasks {
    public static void main(String[] args) {
        String[] names = {
                "Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eva"
        };

        HashSet<String> name = new HashSet<>();

        for(String n : names){
            name.add(n);
        }

        System.out.println("Унікальні імена: ");
        for (String n : name){
            name.add(n);
            System.out.println(n);
        }
    }
}
