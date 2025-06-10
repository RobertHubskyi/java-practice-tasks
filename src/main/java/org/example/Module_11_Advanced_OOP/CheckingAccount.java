package org.example.Module_11_Advanced_OOP;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    double withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
        }
        return balance;
    }

    @Override
    double deposit(double amount) {
        if (amount >= 0){
            balance += amount;
        }
        return  balance;
    }
}
