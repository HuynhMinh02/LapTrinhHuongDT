package com.minhhh2004110025.baitapTet.games;

public class Player {
    int number = 0;
    public void guess(){
        number = (int) (Math.random() *10); // đoán số trong khoảng từu 1 đến 10
        System.out.println("I'm guessing" + number);
    }
}
