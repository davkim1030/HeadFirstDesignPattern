package src.chapter1.java.quacks;

public class MuteQuack implements QuackBehavior{
    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
