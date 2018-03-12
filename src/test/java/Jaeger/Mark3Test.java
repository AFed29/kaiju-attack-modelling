package Jaeger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mark3Test {
    private Mark3 mark3;

    @Before
    public void before() {
        mark3 = new Mark3("Gipsy Danger", "USA");
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
}
