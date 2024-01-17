package test.chapter1.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import src.chapter1.java.flys.FlyNoWay;
import src.chapter1.java.flys.FlyWithWings;

public class TestFlyBehaviors {

    @Test
    public void testFlyNoWay() {
        // given: FlyNoWay 객체
        FlyNoWay flyNoWay = new FlyNoWay();

        // when: flyNoWay.fly() 호출
        String result = flyNoWay.fly();

        // then: "I can't fly" 리턴
       assertEquals("I can't fly", result);
    }

    @Test
    public void testFlyWithWings() {
        // given: FlyWithWings 객체
        FlyWithWings flyWithWings = new FlyWithWings();

        // when: flyWithWings.fly() 호출
        String result = flyWithWings.fly();

        // then: "I'm flying" 리턴
       assertEquals("I'm flying", result);
    }
}
