package Jaeger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark2Test {
    private Mark2 mark2;

    @Before
    public void before() {
        mark2 = new Mark2("Puma Real", "Panama");
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
}
