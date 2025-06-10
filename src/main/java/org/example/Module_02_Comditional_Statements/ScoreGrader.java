package org.example.Module_02_Comditional_Statements;

public class ScoreGrader {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Оцінка: A");
        } else if (score >= 75) {
            System.out.println("Оцінка: B");
        } else if (score >= 60) {
            System.out.println("Оцінка: C");
        } else {
            System.out.println("Оцінка: F");
        }
    }
}


