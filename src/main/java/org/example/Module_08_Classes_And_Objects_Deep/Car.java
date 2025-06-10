package org.example.Module_08_Classes_And_Objects_Deep;

public class Car {
    private String brand;
    private int year;
    private String color;

    public Car(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.color = "Black";
    }


    public Car() {
        this.brand = "Unknown";
        this.year = 2000;
        this.color = "White";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void introduction(){
        System.out.println("Бренд: " + brand + ", рік випуску: " + year + ", колір: " + color);
    }

    public static void main(String[] args) {
        Car[] car = {
                new Car("AUDI", 2024,"Grey"),
                new Car("Mercedes", 2023),
                new Car()
        };

        for (Car vehicle : car){
            vehicle.introduction();
        }
    }
}
