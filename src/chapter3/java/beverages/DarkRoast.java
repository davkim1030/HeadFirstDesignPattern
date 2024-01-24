package src.chapter3.java.beverages;

import src.chapter3.java.beverages.dtos.Money;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super(new Money(3, 20), "Premium dark roasted coffee");
    }

    @Override
    public Money cost() {
        return this.price;
    }
}
