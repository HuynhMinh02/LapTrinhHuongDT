package com.minhhh2004110025.buoi4;

public class Square {
    String soundFile = "square.aif";

    public Square(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println("Hình đang xoay 360 độ.....");
    }

    void playSound() {
        System.out.println("Play " + this.soundFile);
    }
}
