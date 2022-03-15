package com.minhhh2004110025.buoi9;

public abstract class Shape {
    protected int x, y;
    Shape(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public Shape(){
        
    }

    public abstract void draw();
    public abstract void erase();

    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        draw();
    }
}
