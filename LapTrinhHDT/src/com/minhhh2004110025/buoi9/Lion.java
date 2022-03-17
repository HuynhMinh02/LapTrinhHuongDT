package com.minhhh2004110025.buoi9;

public class Lion extends Feline{
    @Override
    public void makeNoise() {
        System.out.println("Making Lion noise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eating meat ...");
    }
}
