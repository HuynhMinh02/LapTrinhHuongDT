package com.minhhh2004110025.buoi10;

import com.minhhh2004110025.buoi9.Cat;
import com.minhhh2004110025.buoi9.Dog;

public class KhongDaHinhMang {
    
    public static void main(String[] args) {
        
        Dog dsDog[] = new Dog[2];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dsDog[0] = dog ;
        dsDog[1] = dog2 ;

        for (Dog d : dsDog) {
            
            // System.out.println(d);
            d.makeNoise();
        }

        Cat dsCat[] = new Cat[2];

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsCat[0] = cat ;
        dsCat[1] = cat2 ;

        for (Cat c : dsCat) {
            c.makeNoise();
        }

    }
}
// viết code không có đa hình.