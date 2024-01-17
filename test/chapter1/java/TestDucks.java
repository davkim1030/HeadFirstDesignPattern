package test.chapter1.java;

import org.junit.jupiter.api.Test;
import src.chapter1.java.ducks.DecoyDuck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDucks {
    @Test
    public void testDecoyDuck() {
        // given: DecoyDuck 객체
        DecoyDuck decoyDuck = new DecoyDuck();

        // expected: DecoyDuck의 하위 메서드들이 예상대로 동작하는지 확인
        assertEquals("I'm Decoy Duck!", decoyDuck.display());
        assertEquals("<< Silence >>", decoyDuck.performQuack());
        assertEquals("I can't fly!", decoyDuck.performFly());
        assertEquals("All ducks float, even decoys!", decoyDuck.swim());
    }

    @Test
    public void testMallardDuck() {
        // given: MallardDuck 객체
        src.chapter1.java.ducks.MallardDuck mallardDuck = new src.chapter1.java.ducks.MallardDuck();

        // expected: MallardDuck의 하위 메서드들이 예상대로 동작하는지 확인
        assertEquals("I'm Mallard Duck!", mallardDuck.display());
        assertEquals("Quack", mallardDuck.performQuack());
        assertEquals("I'm flying!", mallardDuck.performFly());
        assertEquals("All ducks float, even decoys!", mallardDuck.swim());
    }

    @Test
    public void testRedheadDuck() {
        // given: RedheadDuck 객체
        src.chapter1.java.ducks.RedheadDuck redheadDuck = new src.chapter1.java.ducks.RedheadDuck();

        // expected: RedheadDuck의 하위 메서드들이 예상대로 동작하는지 확인
        assertEquals("I'm Redhead Duck!", redheadDuck.display());
        assertEquals("Quack", redheadDuck.performQuack());
        assertEquals("I'm flying!", redheadDuck.performFly());
        assertEquals("All ducks float, even decoys!", redheadDuck.swim());
    }

    @Test
    public void testRubberDuck() {
        // given: RubberDuck 객체
        src.chapter1.java.ducks.RubberDuck rubberDuck = new src.chapter1.java.ducks.RubberDuck();

        // expected: RubberDuck의 하위 메서드들이 예상대로 동작하는지 확인
        assertEquals("I'm Rubber Duck!", rubberDuck.display());
        assertEquals("Squeak", rubberDuck.performQuack());
        assertEquals("I can't fly!", rubberDuck.performFly());
        assertEquals("All ducks float, even decoys!", rubberDuck.swim());
    }
}
