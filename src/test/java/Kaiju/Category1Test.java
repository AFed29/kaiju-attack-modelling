package Kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Category1Test {
    private Category1 category1;

    @Before
    public void before() {
        category1 = new Category1("Trespasser");
    }

    @Test
    public void canGetName() {
        assertEquals("Trespasser", category1.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, category1.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(30, category1.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("rawww", category1.roar());
    }

    @Test
    public void canLoseHealth() {
        category1.loseHealth(20);
        assertEquals(80, category1.getHealthValue());
    }
}
