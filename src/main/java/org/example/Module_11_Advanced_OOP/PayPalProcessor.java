package org.example.Module_11_Advanced_OOP;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на суму: " + amount + "грн");
    }
}
