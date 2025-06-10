package org.example.Module_12_Collections;

import java.util.ArrayList;

public class NameLength {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Robert");
        names.add("Den");
        names.add("Sol");
        names.add("Nast");
        names.add("Dan");


        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < 4) {
                names.remove(i);
                i--;
            }
        }

        System.out.println("Імена довжиною 4+ символа: ");
        for (String name : names){
            System.out.println(name);
        }
    }
}
