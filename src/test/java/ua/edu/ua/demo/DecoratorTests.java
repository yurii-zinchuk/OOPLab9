package ua.edu.ua.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ua.demo.decorators.AbstractDecorator;
import ua.edu.ua.demo.decorators.BasketDecorator;
import ua.edu.ua.demo.decorators.PaperDecorator;
import ua.edu.ua.demo.decorators.RibbonDecorator;
import ua.edu.ua.demo.flowers.Flower;
import ua.edu.ua.demo.items.Item;
import ua.edu.ua.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ua.demo.payment.PayPalPaymentStrategy;
import ua.edu.ua.demo.payment.Payment;

import java.util.Objects;

public class DecoratorTests {
    private Item item;

    @BeforeEach
    public void init() {
        item = new Flower(13, "red", 47);
    }

    @Test
    public void testDecorators() {
        item = new PaperDecorator(item);
        assert (Objects.equals(item.price(), 60.0));

        item = new RibbonDecorator(item);
        assert (Objects.equals(item.price(), 100.0));

        item = new BasketDecorator(item);
        assert (Objects.equals(item.price(), 104.0));
    }
}
