package com.minhhh2004110025.buoi3;

public class Dog {
    int size;
    String name;
    String breed;

    public Dog(){

    }

    public Dog(String name, String breed, int size){
        this.name = name;
        this.size = size;
        this.breed = breed;
    }

    void bark() {
        if (size > 14){
            System.out.println("Ruff! Ruff!");
        }else {
            System.out.println("Yip! Yip!");
        }
    }

    void setBigger() {
        size += 6;
    }

    void run() {
        System.out.println("Running....");
        this.bark();
    }
}
