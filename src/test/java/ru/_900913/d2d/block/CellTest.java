package ru._900913.d2d.block;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CellTest {
    @Test
    public void testCreate() {
        Cell cell = new Cell(1, 2);

        assertEquals("X position", 1, cell.getX());
        assertEquals("Y position", 2, cell.getY());
        assertEquals("Is empty", true, cell.isEmpty());
        assertEquals("toString", "empty Cell at (1, 2)", cell.toString());
    }
}
