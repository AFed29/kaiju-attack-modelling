package Jaeger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark1Test {
    private Mark1 mark1;

    @Before
    public void before() {
        mark1 = new Mark1("Cherno Alpha", "Russia");
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
}
