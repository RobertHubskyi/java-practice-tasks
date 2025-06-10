package org.example.Module_11_Advanced_OOP;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract double deposit(double amount);

    abstract double withdraw(double amount);

    public void printInfo(){
        System.out.println("Баланс: " + balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new SavingAccount(3000);
        BankAccount bankAccount1 = new CheckingAccount(1500);
        bankAccount.withdraw(2900);
        bankAccount.printInfo();

        bankAccount1.withdraw(1500);
        bankAccount1.printInfo();


    }
}
