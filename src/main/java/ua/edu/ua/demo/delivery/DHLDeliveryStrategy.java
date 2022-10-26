package ua.edu.ua.demo.delivery;

import ua.edu.ua.demo.items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public List<Item> deliver(List<Item> toDeliver) {
        System.out.println("Delivered by DHL.");
        return toDeliver;
    }
}
