package com.minhhh2004110025.hocki2.structured;

import java.util.Scanner;

public class Bank_structured {
    static int account_number = 123456;
    static int account_banlance = 0;
    static Scanner input;
    public static void main(String[] args){
        input = new Scanner(System.in);
        deposit();
        withdraw();
        show();
    }
    static void deposit() {
        System.out.print("Nhập vào số tiền cần gửi: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount; // thao tác lên data
    }
    static void withdraw(){
        System.out.print("Nhập vào số tiền cần rút: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount; // thao tác lên data
    }
    static void show() {
        System.out.println("Thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println ("Account balance: " + account_banlance );
    }
}   
