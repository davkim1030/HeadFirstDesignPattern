package src.chapter1.java.ducks;

import src.chapter1.java.flys.FlyWithWings;
import src.chapter1.java.quacks.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack(), "Mallard Duck");
    }
}
