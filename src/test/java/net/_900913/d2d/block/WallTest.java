package net._900913.d2d.block;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WallTest {
    @Test
    public void testCreate() {
        Wall wall = new Wall(1, 2);

        assertEquals("X position", 1, wall.getX());
        assertEquals("Y position", 2, wall.getY());
        assertEquals("Is empty", false, wall.isEmpty());
        assertEquals("toString", "Wall at (1, 2)", wall.toString());
    }

    @Test
    public void testDestroyTheWall() {
        Wall wall = new Wall(1, 2);
        Cell cell = wall.destroy();

        assertEquals("X position", 1, cell.getX());
        assertEquals("Y position", 2, cell.getY());
        assertEquals("Is empty", true, cell.isEmpty());
    }
}
