package src.chapter3.java.decorators;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.dtos.Money;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(new Money(0, 80), beverage);
    }
}
