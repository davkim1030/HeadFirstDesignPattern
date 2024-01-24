package src.chapter3.java.beverages;

import src.chapter3.java.beverages.dtos.Money;

public class Espresso extends Beverage {
    public Espresso() {
        super(new Money(0, 80), "Bitter espresso, need 2 sugars");
    }

    @Override
    public Money cost() {
        return this.price;
    }
}
