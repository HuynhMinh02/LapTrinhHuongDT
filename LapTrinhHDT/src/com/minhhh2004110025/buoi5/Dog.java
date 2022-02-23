package com.minhhh2004110025.buoi5;

public class Dog {
    private int size; 
    String name;
    String breed;
    
    public void setSize(int size) {
        if (size > 0) {
        this.size = size;
        }else{
            System.out.println("Size không hợp lệ!!!");
        }
    }

    public int getSize() {
        return this.size;
    }

    public void setName(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}