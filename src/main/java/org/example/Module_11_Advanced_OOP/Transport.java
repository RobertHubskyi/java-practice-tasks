package org.example.Module_11_Advanced_OOP;

abstract class Transport {
    abstract void move();

    public void printType(){
        System.out.println("Це транспорт");
    }

    public static void main(String[] args) {
        Transport[] transports = {
                new Car(),
                new Bike()
        };

        for (Transport transport : transports){
            transport.move();
        }
    }
}
