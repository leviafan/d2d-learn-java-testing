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
        assertTrue("Is returned object is instance of Cell class", (field.getCell(50, 39) instanceof Cell && field.getCell(50, 39) != null));
        Cell cell = field.getCell(50, 39);
        assertEquals("Check X coordinate", 50, cell.getX());
        assertEquals("Check Y coordinate", 39, cell.getY());
    }
    @Test
    public void testFillFieldFromFile() {
        Field field = new Field (60,40);
        assertEquals("Field filling succeeded", 0, field.fillFromFile("maps/TestFieldMap"));
        assertTrue("Points empty cell at 0,0", field.isEmpty(0,0));
        assertTrue("Points filled cell at 23,0", !field.isEmpty(23,0));
        assertTrue("Points empty cell at 30,20", field.isEmpty(30,20));
        assertTrue("Points filled cell at 18,10", !field.isEmpty(18,10));
    }
    @Test
    public void testCreateMovingObject() {
        Field field = new Field (60,40);
        assertEquals("Field filling succeeded", 0, field.fillFromFile("maps/TestFieldMap"));
        MovingObject movingObject = new MovingObject(field,0,1);
        assertTrue("Object created on wall -> create failed", movingObject==null);
        MovingObject movingObject = new MovingObject(field,0,2);
        assertTrue("Object created on empty cell -> create succeeded", movingObject!=null);
        assertTrue("Try to step right (success)", movingObject.Move(4));
        assertTrue("Try to step down (fail)", movingObject.Move(2));
    }
}
