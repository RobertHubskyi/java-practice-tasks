package org.example.Module_11_Advanced_OOP;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата карткою: " + cardNumber + ", сума: " + amount);
    }
}
