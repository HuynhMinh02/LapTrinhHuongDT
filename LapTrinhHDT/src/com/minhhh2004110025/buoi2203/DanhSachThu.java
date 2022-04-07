package com.minhhh2004110025.buoi2203;

import java.util.ArrayList;
import java.util.List;

import com.minhhh2004110025.buoi9.Animal;
import com.minhhh2004110025.buoi9.Dog;

public class DanhSachThu {
    private List<Animal> danhSach = new ArrayList<>();


    public void them(Animal animal){
        danhSach.add(animal);
    }

    public Animal timKiemThu(String ten){
        Animal animal  = null;

        for (Animal a : danhSach) {
            if(a.getTen().equals(ten)){
                animal = a;
            }
        }

        return animal;

    }

    public Dog timKiemDog(String ten){
        Dog dog  = null;
        for (Animal a : danhSach) {
            if(a.getTen().equals(ten) && a instanceof Dog){
                dog = (Dog) a;
            }
        }
        return dog;
    }
    
}
