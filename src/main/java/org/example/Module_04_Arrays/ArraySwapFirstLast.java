package org.example.Module_04_Arrays;

public class ArraySwapFirstLast {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int temp = 0;
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
