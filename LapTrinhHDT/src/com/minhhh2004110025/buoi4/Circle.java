package com.minhhh2004110025.buoi4;

public class Circle {
    String soundFile = "circle.aif";

    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println("Hình đang xoay 360 độ.....");
    }

    void playSound() {
        System.out.println("Play sound " + this.soundFile);
    }
}

    