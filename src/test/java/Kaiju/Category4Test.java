package Kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Category4Test {
    private Category4 category4;

    @Before
    public void before() {
        category4 = new Category4("Otachi");
    }

    @Test
    public void canGetName() {
        assertEquals("Otachi", category4.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(400, category4.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(120, category4.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("ROAAAARRR!!", category4.roar());
    }

    @Test
    public void canLoseHealth() {
        category4.loseHealth(50);
        assertEquals(350, category4.getHealthValue());
    }

    @Test
    public void canFly() {
        assertEquals("Otachi flies away...", category4.fly());
    }
}

