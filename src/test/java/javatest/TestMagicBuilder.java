package javatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

    @Test
    public void testAdd1() {
        assertEquals(7, MagicBuilder.Add(2,5));
        assertEquals(7, MagicBuilder.Add(1,6));
        assertEquals(7, MagicBuilder.Add(-1,8));
    }

    @Test
    public void testAdd1() {
        assertEquals(100, MagicBuilder.Add(99, 1));
        assertEquals(-10, MagicBuilder.Add(10, -20));
    }
}