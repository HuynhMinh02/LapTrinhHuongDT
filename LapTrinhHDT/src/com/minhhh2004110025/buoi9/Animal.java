package com.minhhh2004110025.buoi9;

public abstract class Animal {

    private String picture;
    private String food;
    private int hunger;


    //method - behaivor
    protected abstract void makeNoise();

    protected void sleep(){
        System.out.println("Sleeping ...");
    }

    protected abstract void eat();

    protected void roam(){
        System.out.println("Roaming ...");
    }
}
