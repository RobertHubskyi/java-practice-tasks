package org.example.Module_11_Advanced_OOP;

public class CheckOutService {
    public void makePayment(PaymentProcessor processor, double amount) {
        processor.processPayment(200);
    }
}
