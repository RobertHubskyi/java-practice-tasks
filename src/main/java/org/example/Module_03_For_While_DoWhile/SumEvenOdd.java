package org.example.Module_03_For_While_DoWhile;

public class SumEvenOdd {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Сума парних чисел: " + evenSum);
        System.out.println("Сума не парних чисел: " + oddSum);
    }
}
