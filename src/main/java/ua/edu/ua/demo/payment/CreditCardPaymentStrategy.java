package ua.edu.ua.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by a credit card.");
        return true;
    }
}
