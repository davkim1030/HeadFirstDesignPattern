package src.chapter1.java.ducks;

import src.chapter1.java.flys.FlyNoWay;
import src.chapter1.java.quacks.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak(), "Rubber Duck");
    }
}
