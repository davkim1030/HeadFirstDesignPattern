package src.chapter3.java.decorators;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.dtos.Money;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(new Money(1, 0), beverage);
    }
}
