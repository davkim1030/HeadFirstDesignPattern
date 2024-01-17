package src.chapter1.java;

import src.chapter1.java.ducks.DecoyDuck;
import src.chapter1.java.ducks.Duck;
import src.chapter1.java.ducks.MallardDuck;
import src.chapter1.java.ducks.RedheadDuck;
import src.chapter1.java.ducks.RubberDuck;

import java.util.List;

class Chapter1 {
    public static void main(String[] args) {
        List<Duck> ducks = List.of(
            new DecoyDuck(),
            new MallardDuck(),
            new RedheadDuck(),
            new RubberDuck()
        );

        for (Duck duck : ducks) {
            System.out.println(duck.display());
            System.out.println(duck.swim());
            System.out.println(duck.performFly());
            System.out.println(duck.performQuack());
            System.out.println();
        }
    }
}