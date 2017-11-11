package net._900913.d2d;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import net._900913.d2d.block.Cell;
import org.junit.Test;

public class FieldTest {
    @Test
    public void testCreate() {
        Field field = new Field(60,40);
        assertEquals("Field width", 60, field.getWidth());
        assertEquals("Field length", 40, field.getLength());
        assertEquals("Is cell empty", true, field.isEmpty(30,20));
        assertTrue("Is returned object is instance of Cell class", (field.getCell(50, 40) instanceof Cell && field.getCell(50, 40) != null));
        Cell cell = field.getCell(50, 39);
        assertEquals("Check X coordinate", 50, cell.getX());
        assertEquals("Check Y coordinate", 39, cell.getY());
    }

}
