package org.example.Module_11_Advanced_OOP;

public class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    double withdraw(double amount) {
        if (amount >= 0 && (balance - amount) >= 100){

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

    public static void main(String[] args) {

    }
}
