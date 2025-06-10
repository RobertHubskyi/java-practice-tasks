package org.example.Module_04_Arrays;

public class ArrayMin {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 15, 6, 12};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Найменше число в масиві: " + min);
    }
}
