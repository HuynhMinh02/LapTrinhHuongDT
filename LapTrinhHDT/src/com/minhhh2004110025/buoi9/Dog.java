package com.minhhh2004110025.buoi9;

public class Dog extends Animal {


    //cai de hanh vi
    @Override
    public void makeNoise() {
        System.out.println("Making gau gau ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating pone ...");
    }

    //bo sung them hanh vi 
    public void protectHouse(){
        System.out.println("Protecting ...");
    }


    public void chaseCat(){
        System.out.println("Chasing cat ...");
    }
    
}
