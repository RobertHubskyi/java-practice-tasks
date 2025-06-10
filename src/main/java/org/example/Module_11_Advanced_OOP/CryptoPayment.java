package org.example.Module_11_Advanced_OOP;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютою з гаманця: " + walletAddress + ". Сума: " + amount);
    }
}
