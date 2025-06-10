package org.example.Module_07_OOP;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);

        System.out.println(bankAccount.getBalance());
    }
}
