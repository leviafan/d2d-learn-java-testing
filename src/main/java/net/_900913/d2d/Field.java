package net._900913.d2d;

import net._900913.d2d.block.Cell;

import java.io.*;
import java.nio.Buffer;
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
    public int fillFromFile(String fileName) {
//File format: text. One line - one row of the field. O - empty cell, W - wall.
        String line;
        try {
            File file = new File(fileName);
            FileInputStream inputFileStream = new FileInputStream(new File(fileName));
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputFileStream));
            for (int i=0;i<this.length;i++) {
                line = inputReader.readLine();
                if (line!=null) {
                    int j=0;
                    while (j<this.width && j<line.length()) {
                        switch(line.charAt(j)) {
                            case 'W':
                                field.get(i).get(j).setWall();
                                break;
                            default:
                                break;
                        }
                        j++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
            return 1;
        } catch (java.io.IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            return 2;
        }
        return 0;
    }
}
