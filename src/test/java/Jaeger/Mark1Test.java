package Jaeger;

import Kaiju.Category1;
import Kaiju.Category4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark1Test {
    private Mark1 mark1;
    private Category1 category1;
    private Category4 category4;

    @Before
    public void before() {
        mark1 = new Mark1("Cherno Alpha", "Russia");
        category1 = new Category1("Trespasser");
        category4 = new Category4("Raiju");
    }

    @Test
    public void canGetName() {
        assertEquals("Cherno Alpha", mark1.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(110, mark1.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(40, mark1.getAttackValue());
    }

    @Test
    public void canGetCountryOfOrigin() {
        assertEquals("Russia", mark1.getCountryOfOrigin());
    }

    @Test
    public void canLoseHealth() {
        mark1.loseHealth(30);
        assertEquals(80, mark1.getHealthValue());
    }

    @Test
    public void canPunchCategory1() {
        mark1.rocketPunch(category1);
        assertEquals(60, category1.getHealthValue());
    }

    @Test
    public void canPunchCategory4() {
        mark1.rocketPunch(category4);
        assertEquals(360, category4.getHealthValue());
    }
}
