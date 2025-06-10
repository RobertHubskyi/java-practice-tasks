package org.example.Module_11_Advanced_OOP;

public class Main {
    public static void main(String[] args) {
        PrintAble[] printAble = {
                new Report("Новини", "Погода у Львові"),
                new Invoice(2341, 234)
        };

        PrintService printService = new PrintService();
        printService.printAll(printAble);
    }
}
