package org.example.Module_03_For_While_DoWhile;

public class SkipEvenWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20){
            if (i % 2 == 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
