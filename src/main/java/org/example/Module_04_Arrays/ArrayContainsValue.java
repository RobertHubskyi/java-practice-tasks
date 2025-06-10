package org.example.Module_04_Arrays;

public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 13};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                found = true;
                break;

            }
        }
        if(found){
            System.out.println("Число знайдено");
        } else {
            System.out.println("Число не знайдено");
        }
    }
}
