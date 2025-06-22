package org.example.Module_12_Collections.SetTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonNames {
    public static void main(String[] args) {
        String[] groupA = {"Alice", "Bob", "Charlie", "Diana"};
        String[] groupB = {"Charlie", "Eva", "Alice", "Frank"};

        Set<String> set = new HashSet<>(Arrays.asList(groupA));
        Set<String> set2 = new HashSet<>(Arrays.asList(groupB));

        set.retainAll(set2);
        System.out.println("Унікальні імена, які є в обох списках: ");
        for(String name : set){
            System.out.println(name);
        }
    }
}
