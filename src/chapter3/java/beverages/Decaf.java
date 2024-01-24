package src.chapter3.java.beverages;

import src.chapter3.java.beverages.dtos.Money;

public class Decaf extends Beverage {
    public Decaf() {
        super(new Money(1, 80), "Decaf, it's okay to drink at night");
    }

    @Override
    public Money cost() {
        return this.price;
    }
}
