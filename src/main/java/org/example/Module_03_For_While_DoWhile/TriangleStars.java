package org.example.Module_03_For_While_DoWhile;

public class TriangleStars {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}