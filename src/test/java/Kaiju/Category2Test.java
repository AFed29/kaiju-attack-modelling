package Kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Category2Test {
    private Category2 category2;

    @Before
    public void before() {
        category2 = new Category2("Onibaba");
    }

    @Test
    public void canGetName() {
        assertEquals("Onibaba", category2.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(200, category2.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(60, category2.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Raww", category2.roar());
    }
}