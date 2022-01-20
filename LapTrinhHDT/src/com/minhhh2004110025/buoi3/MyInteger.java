package com.minhhh2004110025.buoi3;

public class MyInteger {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MyInteger(int initailValue) {
        value = initailValue;
    }
    
    public MyInteger (){
        this (0);
    }

    public MyInteger(MyInteger other){
        this(other.value);
    }

    public boolean greaterThan(MyInteger other) {
        return (this.value > other.value);
    }

    public boolean lessThan(MyInteger other){
        return (other.greaterThan(this));
    }

    public MyInteger increment(){
        value++;
        return this;
    }
}
