package org.example.Module_07_OOP;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5);
        triangle.getArea();
        System.out.println("Площа трикутнка зі сторонами: " + triangle.getHeight() + " і "
                + triangle.getBase() + " = " + triangle.getArea());

    }
}
