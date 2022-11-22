package ua.edu.ua.demo.items;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Observer {
    private List<Order> orders;

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void notifyDelivered() {
        for (;;){
            for (Order order : orders) {
                if (order.getDelivered()){
                    order.getCustomer().getNotified();
                    orders.remove(order);
                }
            }
        }
    }
}
