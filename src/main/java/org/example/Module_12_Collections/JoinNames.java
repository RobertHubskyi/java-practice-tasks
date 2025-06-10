package org.example.Module_12_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JoinNames {
    public static void main(String[] args) {
        Set<String> groupA =  new HashSet<>(Arrays.asList("Robert", "Den", "Sol", "Nas", "Vas"));
        Set<String> groupB =  new HashSet<>(Arrays.asList("Robert", "Dan", "Vet", "Yur", "Oleg", "Nas"));

        groupA.retainAll(groupB);
        System.out.println("Список спільних імен: " + groupA);

    }
}
