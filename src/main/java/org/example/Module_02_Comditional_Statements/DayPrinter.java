package org.example.Module_02_Comditional_Statements;

public class DayPrinter {
    public static void main(String[] args) {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Сьогодні понеліок");
                break;

            case 2:
                System.out.println("Сьогодні вівторок");
                break;

            case 3:
                System.out.println("Сьогодні середа");
                break;

            case 4:
                System.out.println("Сьогодні четвер");
                break;

            case 5:
                System.out.println("Сьогодні п'ятниця");
                break;

            case 6:
                System.out.println("Сьогодні субота");
                break;

            case 7:
                System.out.println("Сьогодні неділя");
                break;

            default:
                System.out.println("Невідомий день");
        }


    }
}


