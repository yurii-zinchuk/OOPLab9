package ua.edu.ua.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by PayPal.");
        return true;
    }
}
