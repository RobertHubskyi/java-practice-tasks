package org.example.Module_11_Advanced_OOP;

public class Truck implements DeliverAble{
    @Override
    public void deliver(String item, String address) {
        System.out.println("Вантажівка доставляє: " + item + ", за адресом: " + address);
    }
}
