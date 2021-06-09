package javatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDoStuff {

    @Test
    public void testDoStuff() {
        DoStuff doStuff = new DoStuff(1, 2);
        assertEquals(2, doStuff.Multiply());
    }

    @Test
    public void testDoStuffFail() {
        DoStuff doStuff = new DoStuff(5, -1);
        assertEquals(-5, doStuff.Multiply());
    }

}