package org.example.Module_11_Advanced_OOP;

public class Main_PaymentMethod {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethod = {
                new CreditCardPayment("1234-5678-9012-3456", "123"),
                new PayPalPayment("Joe@gmail.ua"),
                new CryptoPayment("wsafsafa")
        };

        PaymentService paymentService = new PaymentService();
        for (PaymentMethod method : paymentMethod){
            paymentService.processPayment(method, 250.0);
        }
    }
}
