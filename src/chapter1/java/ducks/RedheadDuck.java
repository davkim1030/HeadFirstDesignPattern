package src.chapter1.java.ducks;

import src.chapter1.java.flys.FlyWithWings;
import src.chapter1.java.quacks.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack(), "Redhead Duck");
    }
}
