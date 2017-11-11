package net._900913.d2d;

import net._900913.d2d.block.Cell;

import java.util.ArrayList;

public class Field {
    private int width;
    private int length;
    ArrayList<ArrayList<Cell>> field = new ArrayList<>();
    Field(int width, int length) {
        this.width = width;
        this.length = length;
        for (int i = 0; i < length; i++) {
            field.add(i, new ArrayList<>());
            for (int j = 0; j < width; j++) {
                field.get(i).add(j, new Cell(j, i));
            }
        }
    }
    public int getWidth() {
        return this.width;
    }
    public int getLength() {
        return this.length;
    }
    public boolean isEmpty(int x, int y) {
        return this.field.get(y).get(x).isEmpty();
    }
    public Cell getCell(int x, int y) {
        if (x < this.width) {
            if (y < this.length) {
                return this.field.get(y).get(x);
            }
        }
        return null;
    }
}
