package com.minhhh2004110025.buoi6;

public class Car {
    private String carColor;
    private double carPriced;

    public void setColor(String color) {
        this.carColor = color;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public void setCarPriced(double carprice){
        if (carprice > 0){
            this.carPriced = carprice;
        }else{
            System.out.println("Gia khong hop le!!");
        }
    }

    public double getCarPriced() {
        return this.carPriced;
    }
}
