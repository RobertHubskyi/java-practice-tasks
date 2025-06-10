package org.example.Module_04_Arrays;

public class ArrayFilterOddGreater10 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 15, 9, 22, 11};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0 && numbers[i] > 10){

                System.out.println(numbers[i]);
            }
        }
    }
}
