package org.example.Module_11_Advanced_OOP;

public class PaymentService {
    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
