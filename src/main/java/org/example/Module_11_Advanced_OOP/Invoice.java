package org.example.Module_11_Advanced_OOP;

public class Invoice implements PrintAble {
        private int invoiceNumber;
        private double amount;

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println("Замовлення: " + invoiceNumber + ", на суму: " + amount);
    }
}
