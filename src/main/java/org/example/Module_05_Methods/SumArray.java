package org.example.Module_05_Methods;

public class SumArray {
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] data = {1, 9, 2, 15, 5};
        int result = sumArray(data);
        System.out.println("Сума масиву: " + result);

    }
}
