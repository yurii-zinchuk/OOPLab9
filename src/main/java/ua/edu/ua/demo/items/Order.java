package ua.edu.ua.demo.items;

import lombok.Getter;
import ua.edu.ua.demo.delivery.Delivery;
import ua.edu.ua.demo.payment.Payment;
import ua.edu.ua.demo.user.AppUser;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Order {
    private final LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private boolean delivered;
    private final AppUser customer;

    public Order(AppUser customer) {
        this.customer = customer;
        items = new LinkedList<>();
        delivered = false;
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
        System.out.println("Paying for order...");
        boolean paid = payment.pay(calculateTotalPrice());
        if (paid) {
            System.out.println("Payment successful.");
            System.out.println("Delivering the order...");
            List<Item> deliveredItems =  delivery.deliver(items);
            if (deliveredItems.equals(items)){
                System.out.println("Delivery successful.");
                delivered = true;
            }
        } else {
            System.out.println("Payment failed.");
        }
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }

    public boolean getDelivered() {
        return delivered;
    }
}

