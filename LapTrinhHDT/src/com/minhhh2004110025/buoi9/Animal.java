package com.minhhh2004110025.buoi9;

public abstract class Animal {

    private String picture;
    private String food;
    private int hunger;
    private String name;


    

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getTen() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //method - behaivor
    public abstract void makeNoise();

    protected void sleep(){
        System.out.println("Sleeping ...");
    }

    protected abstract void eat();

    protected void roam(){
        System.out.println("Roaming ...");
    }
}
