package src.chapter3.java.decorators;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.dtos.Money;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(new Money(0, 70), beverage);
    }
}
