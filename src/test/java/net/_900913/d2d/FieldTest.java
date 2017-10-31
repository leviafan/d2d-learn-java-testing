package net._900913.d2d;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FieldTest {
    @Test
    public void testCreate() {
        Field field = new Field(60,40);
        assertEquals("Field width", 60, field.getWidth());
        assertEquals("Field height", 40, field.getHeight());
        assertEquals("Is cell empty", true, field.isEmpty(30,20));
    }

}
