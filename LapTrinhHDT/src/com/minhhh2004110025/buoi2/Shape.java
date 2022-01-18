package com.minhhh2004110025.buoi2;

import java.util.Scanner;

public class Shape {
    String nameShape;
    Scanner scanner = new Scanner(System.in);
    
    public Shape(){

    }

    public String getName(){
        return nameShape;
    }

    public void setName(String nameShape){
        this.nameShape = nameShape;
    }

    public Shape (String nameShape) {
        this.nameShape = nameShape;
    }

    public void circle(){
        System.out.println("     ----------      ");
        System.out.println("  ---          ---   ");
        System.out.println(" --              --  ");
        System.out.println("-                 -  ");
        System.out.println(" --              --  ");
        System.out.println("  ---          ---   ");
        System.out.println("     ----------      ");
    }

    public void square(){
        System.out.println( " _______________");
        System.out.println(" |               |");
        System.out.println(" |               |");
        System.out.println(" |               |");
        System.out.println(" |               |");
        System.out.println(" |_______________|");
    }

    public void triangle(){
        System.out.println("           ***            ");
        System.out.println("       ***     ***        ");
        System.out.println("    ***          ***     ");
        System.out.println("  ***               ***  ");
        System.out.println("***                  ***");
        System.out.println(" ************************");
    }

    public void soundCircle(){
        System.out.println("Tích Tích Tích");
    }

    public void soundSquare(){
        System.out.println(" Từng Tứng Tưng Tưng Từng Tưng");
    }

    public void soundTriangle()
    {
        System.out.println("Tóc Tóc Tóc");
    }

    public void rotateShape(){
        System.out.println("Hình đang xoay......!");
    }

    public void menu(){
        do{
            System.out.println(">>1: CIRCLE");
            System.out.println(">>2: SQUARE");
            System.out.println(">>3: TRAINGLE ");
            System.out.println("Hãy chọn hình từ 1 --> 3: ");
            int key = scanner.nextInt();
            switch(key)
            {
                case 1:
                circle();
                rotateShape();
                soundCircle();
                break;
                case 2:
                square();
                rotateShape();
                soundSquare();
                break;
                case 3:
                triangle();
                rotateShape();
                soundTriangle();
                break;
                default: System.out.println("Hình Không Hợp Lệ!!!!");
                break;
            }
        }while(true); 
    }
}
