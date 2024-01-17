package src.chapter1.java.ducks;

import src.chapter1.java.flys.FlyBehavior;
import src.chapter1.java.quacks.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String name) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.name = name;
    }
    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "All ducks float, even decoys!";
    }

    public String display() {
        return "I'm " + name + "!";
    }
}
