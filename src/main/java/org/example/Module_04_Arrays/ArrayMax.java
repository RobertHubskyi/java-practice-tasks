package org.example.Module_04_Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 15, 6, 12};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальне число в масиві: " + max);
    }
}
