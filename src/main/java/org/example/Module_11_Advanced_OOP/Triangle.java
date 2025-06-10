package org.example.Module_11_Advanced_OOP;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override

    public double getArea() {
        return 0.5 * height * base;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
        return base + 2 * side;
    }
}
