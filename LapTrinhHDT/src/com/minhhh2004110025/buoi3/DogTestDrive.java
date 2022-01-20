package com.minhhh2004110025.buoi3;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.size = 9;
        Dog dog2 = new Dog();
        dog2.size = 15;

        dog1.bark();
        dog1.setBigger();
        dog1.bark();

        dog2.bark();
        dog2.setBigger();
        dog2.bark();

    }
    
}
