package org.example.Module_07_OOP;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(2, 5)
        };

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Площа круга: " + shape.getArea());
            } else if (shape instanceof Triangle) {
                System.out.println("Площа трикутника: " + shape.getArea());
            }
        }
    }
}
