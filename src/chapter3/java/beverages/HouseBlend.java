package src.chapter3.java.beverages;

import src.chapter3.java.beverages.dtos.Money;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super(new Money(1, 1), "Well made house blend");
    }

    @Override
    public Money cost() {
        return price;
    }
}
