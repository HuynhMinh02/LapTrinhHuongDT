package com.minhhh2004110025.buoi5;

public class IntSquare {
    private double squareValue; //implementation

    //Abstraction

    //interfaces
    public double getSquare(int value) {
        //implementation - thuật toán
        this.calculateSquare(value);
        return this.squareValue;
    }

    //implementation
    private void calculateSquare(int value) {
        this.squareValue = Math.pow(value, 2);
    }
}
