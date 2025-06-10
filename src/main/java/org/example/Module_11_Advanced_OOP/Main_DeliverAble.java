package org.example.Module_11_Advanced_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main_DeliverAble {
    public static void main(String[] args) {
        List<DeliverAble> couriers = new ArrayList<>();
        couriers.add(new Drone());
        couriers.add(new Truck());
        couriers.add(new BikeCourier());


        DeliveryService deliveryService = new DeliveryService();
        deliveryService.deliverAll(couriers, "Ноутбук", "Проспект Тараса Шевченка");
    }
}
