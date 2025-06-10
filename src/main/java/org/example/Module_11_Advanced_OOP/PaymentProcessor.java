package org.example.Module_11_Advanced_OOP;

public interface PaymentProcessor {
    void processPayment(double amount);


    public static void main(String[] args) {
        PaymentProcessor[] processor = {
                new CreditCardProcessor(),
                new PayPalProcessor()
        };

        for (PaymentProcessor processor1 : processor){
            processor1.processPayment(230);
        }
    }

}
