package com.minhhh2004110025.buoi6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
         car.setColor("black");
         car.setCarPriced(3000);

         System.out.println("Color: " + car.getCarColor());
         System.out.println("Price: " + car.getCarPriced());

    }
}
