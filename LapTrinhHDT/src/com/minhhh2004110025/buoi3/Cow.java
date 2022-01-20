package com.minhhh2004110025.buoi3;

public class Cow {
    Double weight;
    int age;

    public Cow() {
        weight = 12.54 ;
    }

    public Cow(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    void moo(){
        if (weight < 14){
        System.out.println("Be be .....");
        }else {
            System.out.println("Ummmm Booooo ....");
        }
    }

}
