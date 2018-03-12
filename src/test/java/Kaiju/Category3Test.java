package Kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Category3Test {
    private Category3 category3;

    @Before
    public void before() {
        category3 = new Category3("Knifehead");
    }

    @Test
    public void canGetName() {
        assertEquals("Knifehead", category3.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(300, category3.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(90, category3.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roar!", category3.roar());
    }

    @Test
    public void canLoseHealth() {
        category3.loseHealth(30);
        assertEquals(270, category3.getHealthValue());
    }
}
