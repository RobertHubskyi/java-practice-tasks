package org.example.Module_07_OOP;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Периметр прямокутника зі сторонами " + rectangle.getWidth() + " і " +
                rectangle.getHeight() + " = " + rectangle.getPerimeter());
        System.out.println("Площа прямокутника зі сторонами " + rectangle.getWidth() + " і " +
                rectangle.getHeight() + " = " +rectangle.getArea());

    }
}
