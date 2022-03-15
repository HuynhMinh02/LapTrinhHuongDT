package com.minhhh2004110025.buoi9;

public class Circle extends Shape{
    private int radius;
    public Circle(int _x, int _y, int _r) {
        super(_x, _y);
        radius = _r;
    }

    public void draw(){
        System.out.println("Drawing Circle at " + x + "," + y);
    }

    public void erase(){
        System.out.println("Erase Circle at " + x + "," + y);
    }

}
