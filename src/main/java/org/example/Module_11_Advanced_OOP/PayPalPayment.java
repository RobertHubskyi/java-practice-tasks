package org.example.Module_11_Advanced_OOP;

public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + email + ", сума: " + amount);
    }
}
