package ua.edu.ua.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ua.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ua.demo.delivery.PostDeliveryStrategy;
import ua.edu.ua.demo.flowers.*;
import ua.edu.ua.demo.items.Item;

import java.util.LinkedList;
import java.util.List;

public class DeliveryTests {
    private DHLDeliveryStrategy DHLDelivery;
    private PostDeliveryStrategy postDelivery;
    private List<Item> deliveryItems;

    @BeforeEach
    public void init() {
        DHLDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();

        deliveryItems = new LinkedList<>();
        deliveryItems.add(new RomashkaFlower(FlowerColor.WHITE, 17, 20));
        deliveryItems.add(new CactusFlower(FlowerColor.RED, 25, 37));
        deliveryItems.add(new FlowerPack(new RomashkaFlower(FlowerColor.BLUE, 19, 30),
                3));
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new CactusFlower(FlowerColor.GREEN, 50, 100));
        deliveryItems.add(bucket);
    }

    @Test
    public void testDHLDelivery() {
        List<Item> delivered = DHLDelivery.deliver(deliveryItems);
        assert (delivered instanceof LinkedList<Item>);
    }

    @Test
    public void testPostDelivery() {
        List<Item> delivered = postDelivery.deliver(deliveryItems);
        assert(delivered instanceof LinkedList<Item>);
    }
}
