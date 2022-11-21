package ua.edu.ua.demo.decorators;

import lombok.NoArgsConstructor;
import ua.edu.ua.demo.items.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        super(item, 4,"decorated with basket ");
    }
}
