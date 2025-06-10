package org.example.Module_01_Variables_Data_Types_and_Operators;

public class PriceWithTax {
    private double price = 99.99;
    private double taxRate = 0.2;

    public PriceWithTax(double price, double taxRate) {
        this.price = price;
        this.taxRate = taxRate;
    }

    public double calculateFullPrice() {
        return price + (price * taxRate);
    }

    public static void main(String[] args) {
        PriceWithTax product = new PriceWithTax(10.0, 0.5);
        System.out.println("Ціна продукту без податку: " + product.price);
        System.out.println("Податок на продукт: " + product.taxRate);
        System.out.println("Вартість продукту(із врахуванням податку): " + product.calculateFullPrice());
    }
}
