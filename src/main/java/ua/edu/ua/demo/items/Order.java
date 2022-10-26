package ua.edu.ua.demo.items;

import ua.edu.ua.demo.delivery.Delivery;
import ua.edu.ua.demo.payment.Payment;

import java.util.LinkedList;

public class Order {
    private final LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        items = new LinkedList<>();
    }

    public void setDeliverStrategy(Delivery delivery) {
        System.out.println(delivery.getClass().getSuperclass().toString() + "is being used.");
        this.delivery = delivery;
    }

    public void setPaymentMethod(Payment payment) {
        System.out.println(payment.getClass().getSuperclass().toString() + "is being used.");
        this.payment = payment;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item i : items) {
            price += i.price();
        }
        return price;
    }

    public void processOrder() {
        boolean paid = payment.pay(calculateTotalPrice());

        if (paid) {
            System.out.println("Payment successful.");
            delivery.deliver(items);
        }
        else {
            System.out.println("Payment failed.");
        }
    }

    public void addItem(Item i) {items.add(i);}

    public void removeItem(Item i) {items.remove(i);}
}

