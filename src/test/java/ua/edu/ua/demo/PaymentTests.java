package ua.edu.ua.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ua.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ua.demo.payment.PayPalPaymentStrategy;
import ua.edu.ua.demo.payment.Payment;

public class PaymentTests {
    private Payment creditCardPayment;
    private Payment paypalPayment;
    private double price;

    @BeforeEach
    public void init() {
        creditCardPayment = new CreditCardPaymentStrategy();
        paypalPayment = new PayPalPaymentStrategy();
        price = 120.4;
    }

    @Test
    public void testCreditCardPayment() {
        boolean paidByCard = creditCardPayment.pay(price);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPayment() {
        boolean paidByPayPal = paypalPayment.pay(price);
        assert (paidByPayPal);
    }
}
