package org.example.Module_04_Arrays;

public class ArrayEvenSum {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 10, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                sum += numbers[i];
            }
        }
        System.out.println("Сума парни чисел: " + sum);
    }

}
