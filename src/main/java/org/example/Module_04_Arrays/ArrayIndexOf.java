package org.example.Module_04_Arrays;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 13};
        int target = 9;
        boolean found = false;
        int index = -1;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                found = true;
                index = i;

            }
        }

        if (index != -1){
            System.out.println("Число: " + target + ", за індесом: " + index + " знайдено");
        } else {
            System.out.println("Число не знайдено");
        }
    }
}
