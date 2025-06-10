package org.example.Module_04_Arrays;

public class ArrayCountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 5, 2, 5, 9};
        int target = 5;
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                count++;

            }
        }
        System.out.println("Число: " + target + ", зустрічається: " + count + " разів");
    }
}
