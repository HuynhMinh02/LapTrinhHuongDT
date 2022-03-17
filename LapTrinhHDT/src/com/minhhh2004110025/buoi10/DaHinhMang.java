package com.minhhh2004110025.buoi10;

import com.minhhh2004110025.buoi9.Animal;
import com.minhhh2004110025.buoi9.Cat;
import com.minhhh2004110025.buoi9.Dog;

public class DaHinhMang {
     public static void main(String[] args) {
         
        Animal dsA[] = new Animal[4];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsA[0] = dog;
        dsA[1] = dog2;
        dsA[2] = cat;
        dsA[3] = cat2;

        for (Animal animal : dsA) {
            animal.makeNoise();
        }

     }
     
}
