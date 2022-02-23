package com.minhhh2004110025.buoi5;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(5);
        dog.name = "cici";

        System.out.println("Dog size: " + dog.getSize());
        System.out.println("Name: " + dog.name);
    }
}
