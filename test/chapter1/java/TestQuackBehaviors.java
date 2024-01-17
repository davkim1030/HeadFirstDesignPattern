package test.chapter1.java;

import org.junit.jupiter.api.Test;
import src.chapter1.java.quacks.MuteQuack;
import src.chapter1.java.quacks.Quack;
import src.chapter1.java.quacks.Squeak;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuackBehaviors {
    @Test
    public void testQuack() {
        // given: Quack 객체
        Quack quack = new Quack();

        // when: quack.quack() 호출
        String result = quack.quack();

        // then: "Quack" 리턴
        assertEquals("Quack", result);
    }

    @Test
    public void testSquack() {
        // given: Squeak 객체
        Squeak squeak = new Squeak();

        // when: squeak.quack() 호출
        String result = squeak.quack();

        // then: "Squeak" 리턴
        assertEquals("Squeak", result);
    }

    @Test
    public void testMuteQuack() {
        // given: MuteQuack 객체
        MuteQuack muteQuack = new MuteQuack();

        // when: muteQuack.quack() 호출
        String result = muteQuack.quack();

        // then: "Silence" 리턴
        assertEquals("<< Silence >>", result);
    }
}
