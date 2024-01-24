package src.chapter3.java.beverages.dtos;

public class Money {
    private final int DOLLAR_CENT_RATE = 100;

    private int amount;

    public Money() {
        this.amount = 0;
    }

    public Money(int dollar, int cent) {
        if (dollar < 0 || cent < 0)
            throw new NegativeValueError();
        this.amount = dollar * DOLLAR_CENT_RATE + cent;
    }

    public int getDollar() {
        return (this.amount / this.DOLLAR_CENT_RATE);
    }

    public int getCent() {
        return (this.amount % this.DOLLAR_CENT_RATE);
    }

    public boolean isEquals(Money money) {
        return this.amount == money.amount;
    }

    public Money add(Money money) {
        this.amount += money.amount;
        return this;
    }

    public Money sub(Money money) {
        int amount = this.amount - money.amount;
        if (amount < 0)
            throw new NegativeValueError();

        this.amount = amount;
        return this;
    }

    public Money multiply(int times) {
        this.amount *= times;
        return this;
    }

    public Money divide(int divider) {
        if (divider < 0)
            throw new NegativeValueError();

        this.amount /= divider;
        return this;
    }

    public String toString() {
        return String.format("%d.%02d", this.getDollar(), this.getCent());
    }
}
