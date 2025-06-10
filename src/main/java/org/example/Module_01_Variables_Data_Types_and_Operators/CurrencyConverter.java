package org.example.Module_01_Variables_Data_Types_and_Operators;

public class CurrencyConverter {
    private double amount;
    private double rate;

    public CurrencyConverter(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public double convertToUAH(){
        return rate * amount;
    }

    public static void main(String[] args) {
        CurrencyConverter convert = new CurrencyConverter(3.5, 45);
        System.out.println("Курс доллара: " + convert.rate);
        System.out.println("Конвертація " + convert.amount +  " доларів до гривні: " + convert.convertToUAH());
    }
}

