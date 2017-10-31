package net._900913.d2d.block;

public class Wall extends Cell{
    Wall (int x, int y){
        super(x, y);
        isEmpty=false;
    }

    public boolean isEmpty(){
        return false;
    }

    public String toString(){
        String result = "";
        result+=String.format("Wall at (%d, %d)",x,y);
        return result;
    }

    public Cell destroy(){
        return new Cell(x, y);
    }
}
