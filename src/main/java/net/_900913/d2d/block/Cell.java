package net._900913.d2d.block;

public class Cell {
    protected int x;
    protected int y;
    protected boolean isEmpty;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        isEmpty = true;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean isEmpty(){
        return isEmpty;
    }
    public String toString(){
        String result = "";
        if (isEmpty){
            result+=String.format("empty Cell at (%d, %d)",x,y);
        } else{
            result+=String.format("filled Cell at (%d, %d)",x,y);
        }
        return result;
    }
    public void setWall() {
        this.isEmpty = false;
    }
    public void clean() {
        this.isEmpty = true;
    }
}
