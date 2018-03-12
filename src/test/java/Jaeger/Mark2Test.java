package Jaeger;

import Kaiju.Category3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark2Test {
    private Mark2 mark2;
    private Category3 category3;

    @Before
    public void before() {
        mark2 = new Mark2("Puma Real", "Panama");
        category3 = new Category3("Yamarashi");
    }

    @Test
    public void canGetName() {
        assertEquals("Puma Real", mark2.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(180, mark2.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(50, mark2.getAttackValue());
    }

    @Test
    public void canGetCountryOfOrigin() {
        assertEquals("Panama", mark2.getCountryOfOrigin());
    }

    @Test
    public void canLoseHealth() {
        mark2.loseHealth(100);
        assertEquals(80, mark2.getHealthValue());
    }

    @Test
    public void canPunchCategory3() {
        mark2.rocketPunch(category3);
        assertEquals(250, category3.getHealthValue());
    }
}
