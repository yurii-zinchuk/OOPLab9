package ua.edu.ua.demo.decorators;

import lombok.NoArgsConstructor;
import ua.edu.ua.demo.items.Item;

public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Item item) {
        super(item, 40,"decorated with ribbon ");
    }
}
