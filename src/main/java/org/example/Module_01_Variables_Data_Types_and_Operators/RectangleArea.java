package org.example.Module_01_Variables_Data_Types_and_Operators;

public class RectangleArea {
    private int height;
    private int width;

    public RectangleArea(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculateArea() {
        return height * width;
    }

    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea(5, 12);
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());

    }

}
