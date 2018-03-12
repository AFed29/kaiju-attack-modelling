package Jaeger;

import Kaiju.Category2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark3Test {
    private Mark3 mark3;
    private Category2 category2;

    @Before
    public void before() {
        mark3 = new Mark3("Gipsy Danger", "USA");
        category2 = new Category2("Ragnarok");
    }

    @Test
    public void canGetName() {
        assertEquals("Gipsy Danger", mark3.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(300, mark3.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(100, mark3.getAttackValue());
    }

    @Test
    public void canGetCountryOfOrigin() {
        assertEquals("USA", mark3.getCountryOfOrigin());
    }

    @Test
    public void canLoseHealth() {
        mark3.loseHealth(80);
        assertEquals(220, mark3.getHealthValue());
    }

    @Test
    public void canPunchCategory2() {
        mark3.rocketPunch(category2);
        assertEquals(100, category2.getHealthValue());
    }
}
