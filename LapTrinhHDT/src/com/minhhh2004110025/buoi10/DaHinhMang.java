package com.minhhh2004110025.buoi10;

import java.util.ArrayList;
import java.util.List;

import com.minhhh2004110025.buoi9.Animal;
import com.minhhh2004110025.buoi9.Cat;
import com.minhhh2004110025.buoi9.Dog;
import com.minhhh2004110025.buoi9.Pet;
import com.minhhh2004110025.buoi9.RobotDog;

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
            // if (animal instance Cat){
                // animal.makeNoise();
            // }
        }

        List<Pet> listPet = new ArrayList<>();
        Dog d = new Dog();
        Cat c = new Cat();
        RobotDog dogr = new RobotDog();

        // listPet.add(d);
        listPet.add(c);
        listPet.add(dogr);

     }

}
