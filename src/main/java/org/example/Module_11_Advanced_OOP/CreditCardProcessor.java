package org.example.Module_11_Advanced_OOP;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитною картою на суму: " + amount + "грн");
    }
}
