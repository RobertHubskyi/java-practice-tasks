package org.example.Module_11_Advanced_OOP;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void printInfo() {
        System.out.println("Площа: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Колір: " + getColor());
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Синій", 7, 2),
                new Circle("Білий", 2),
                new Triangle("Рожевий", 3, 7 )
        };

        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
