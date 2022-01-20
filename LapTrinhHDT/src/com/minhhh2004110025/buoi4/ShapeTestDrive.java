package com.minhhh2004110025.buoi4;

public class ShapeTestDrive {
    public static void main(String[] args) {
        System.out.println("Hình Tam Giác");
        Triangle triangle = new Triangle("Tích Tích Tich .....");
        triangle.rotate();
        triangle.playSound();

        System.out.println("Hình Vuông");
        Square square = new Square("Tóc Tóc Tóc ....");
        square.rotate();
        square.playSound();

        System.out.println("Hình Tròn");
        Circle circle = new Circle("Từng Tứng Tưng Tưng Từng Tưng ......");
        circle.rotate();
        circle.playSound();
    }
}
