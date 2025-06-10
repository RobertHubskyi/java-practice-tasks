package org.example.Module_11_Advanced_OOP;

public class Drone implements DeliverAble {
    @Override
    public void deliver(String item, String address) {
        System.out.println("Дрон доставляє: " + item + ", за адресом: " + address);
    }
}
