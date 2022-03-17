package com.minhhh2004110025.buoi9;

public class Cat extends Feline implements Pet{


    public void beFriendly(){

    }

    public void play(){
        
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat sound.......");
        
    }

    @Override
    protected void eat() {
        System.out.println("Cat eating.......");
        
    }
    
}



