package test.chapter3.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import src.chapter3.java.beverages.Beverage;
import src.chapter3.java.beverages.DarkRoast;
import src.chapter3.java.beverages.Decaf;
import src.chapter3.java.beverages.Espresso;
import src.chapter3.java.beverages.HouseBlend;
import src.chapter3.java.beverages.dtos.Money;
import src.chapter3.java.decorators.Milk;
import src.chapter3.java.decorators.Mocha;
import src.chapter3.java.decorators.Soy;
import src.chapter3.java.decorators.Whip;

import java.util.List;

public class TestBeverages {
    @Test
    public void testBeveragesCostShouldGetExpectedPrice() {
        // Given: 여러 종류의 beverage들이 준비 됨
        Beverage darkRoast = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();

        // Expected: cost()를 호출 시, 예상한 값을 반환한다
        assertTrue(new Money(3, 20).isEquals(darkRoast.cost()));
        assertTrue(new Money(1, 80).isEquals(decaf.cost()));
        assertTrue(new Money(0, 80).isEquals(espresso.cost()));
        assertTrue(new Money(1, 1).isEquals(houseBlend.cost()));
    }

    @Test
    public void testDecoratorsShouldAddBeverageAndItsPrice() {
        // Given: 여러 beverage들이 준비됨
        Beverage darkRoast = new DarkRoast();

        // Expected 1: getDescription() 호출 시, 인자로 받은 beverage의 description 반환
        Beverage darkRoastWithMilk = new Milk(darkRoast);
        assertEquals(darkRoast.getDescription(), darkRoastWithMilk.getDescription());

        // Expected 2: cost()를 호출 시, decorator의 price와 beverage의 price를 더한 값을 반환한다  3.20 + 0.50 == 3.70
        assertTrue(new Money(3, 70).isEquals(darkRoastWithMilk.cost()));

        // Expected 3: 추가적인 decorator 넣으면 해당 값도 합산                                   3.70 + 1.00 == 4.70
        Beverage darkRoastWithMilkAndWhip = new Whip(darkRoastWithMilk);
        assertTrue(new Money(4, 70).isEquals(darkRoastWithMilkAndWhip.cost()));

        // Expected 4: 추가적인 decorator 넣으면 해당 값도 합산                                   4.70 + 0.70 == 5.40
        Beverage darkRoastWithMilkAndWhipAndMocha = new Mocha(darkRoastWithMilkAndWhip);
        assertTrue(new Money(5, 40).isEquals(darkRoastWithMilkAndWhipAndMocha.cost()));

        // Expected 5: 추가적인 decorator 넣으면 해당 값도 합산                                   5.40 + 0.80 == 6.20
        Beverage darkRoastWithMilkAndWhipAndMochaAndSoy = new Soy(darkRoastWithMilkAndWhipAndMocha);
        assertTrue(new Money(6, 20).isEquals(darkRoastWithMilkAndWhipAndMochaAndSoy.cost()));
    }
}
