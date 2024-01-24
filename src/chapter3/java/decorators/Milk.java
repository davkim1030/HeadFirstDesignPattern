package src.chapter3.java.decorators;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.dtos.Money;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(new Money(0, 50), beverage);
    }
}
