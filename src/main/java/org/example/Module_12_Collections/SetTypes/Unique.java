package org.example.Module_12_Collections.SetTypes;

import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 2, 5};

        Set<Integer> unique = new HashSet<>();

        for (int num : numbers2){
            unique.add(num);
        }

        if (unique.size() == numbers2.length){
            System.out.println("Всі числа в масиві унікальні");
        } else {
            System.out.println("В масиві є дублікати чисел");
        }
    }
}
