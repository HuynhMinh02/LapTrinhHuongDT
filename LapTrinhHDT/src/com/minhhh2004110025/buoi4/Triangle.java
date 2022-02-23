package com.minhhh2004110025.buoi4;

public class Triangle {
    private String soundFile = "triangle.aif";

    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println("Hình đang xoay 360 độ.....");
    }

    void playSound() {
        System.out.println("Play " + this.soundFile);
    }
    
}
