package org.example.Module_12_Collections;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);

        System.out.println("Числа в масиві: ");
        for (int number : numbers) {
            System.out.println(number);
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if(num < min){
                min = num;
            }
            sum += num;

        }

        System.out.println("\nМаксимальне число з масива: " + max);
        System.out.println("Мінімальне число з масива: " + min);
        System.out.println("Сума чисел масиву: " + sum);

        numbers.remove(Integer.valueOf(max));
        numbers.remove(Integer.valueOf(min));

        System.out.println("\nОновлений масив: ");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
