package org.example.Module_01_Variables_Data_Types_and_Operators;

public class CharAsciiValue {
    public static void main(String[] args) {
        char c = 'J';

        System.out.println("Значення символу с: " + c);

        int asciiCode = (int) c;

        System.out.println("ASCII-код символу '" + c + "': " + asciiCode);
    }
}

