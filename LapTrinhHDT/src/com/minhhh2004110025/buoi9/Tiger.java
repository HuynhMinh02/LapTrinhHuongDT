package com.minhhh2004110025.buoi9;

public class Tiger extends Feline {
    public Tiger(){
        
    }

    @Override
    public void makeNoise() {

        System.out.println("Tiger sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("EAting ... meat, cat, dog");
    }
}
