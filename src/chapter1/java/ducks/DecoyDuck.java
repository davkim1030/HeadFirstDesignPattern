package src.chapter1.java.ducks;

import src.chapter1.java.flys.FlyNoWay;
import src.chapter1.java.quacks.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack(), "Decoy Duck");
    }
}
