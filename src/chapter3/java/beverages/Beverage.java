package src.chapter3.java.beverages;

import src.chapter3.java.beverages.dtos.Money;

public abstract class Beverage {
    protected String description;
    protected Money price;

    public Beverage(Money price, String description) {
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Money getPrice() {
        return this.price;
    }

    public abstract Money cost();
}
