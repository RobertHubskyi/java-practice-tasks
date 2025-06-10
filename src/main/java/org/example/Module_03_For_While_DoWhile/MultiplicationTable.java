package org.example.Module_03_For_While_DoWhile;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++){
           int product  = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
