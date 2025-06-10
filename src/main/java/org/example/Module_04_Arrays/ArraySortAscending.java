package org.example.Module_04_Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int num : numbers){
            System.out.println(num);
        }
    }
}
