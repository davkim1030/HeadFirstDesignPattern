package src.chapter3.java.decorators;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.dtos.Money;

public class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Money price, Beverage beverage) {
        super(price, beverage.getDescription());
        this.beverage = beverage;
    }
    @Override
    public Money cost() {
        return this.price.add(this.beverage.getPrice());
    }
}
