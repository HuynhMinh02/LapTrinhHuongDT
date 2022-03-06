package com.minhhh2004110025.baitapvenha;

import java.util.Scanner;

public class MainVehicle {
    public static Scanner sc = new Scanner(System.in);

    public static void nhapXe(Vehicle vehicle){
        sc.nextLine();
        System.out.print("Nhập tên chủ xe: ");
        sc.nextLine();
        System.out.print("Nhập dung tích xe: ");
        sc.nextInt();
        System.out.print("Nhập loại xe: ");
        sc.nextLine();
        System.out.print("Nhập trị giá xe: ");
        sc.nextDouble();
    }
    public static void main(String[] args) {
        int a,n=0;
        Vehicle v[] = null;
        do{
            System.out.println("|>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<|");
            System.out.println("|>>1: Nhập thông tin xe!!           |");
            System.out.println("|>>2: Xuất bảng kê khai tiền thuế!  |");
            System.out.println("|>>3: Kết thúc!! Thoát!!            |");
            System.out.println("|>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<|");
            System.out.println("Bấm số để chọn (1/2/3)");
            a =sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("=============Bạn đã chọn chức năng nhập thông tin xe!!===============");
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    v = new Vehicle[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                }
                break;
                case 2:
                    System.out.println("=============Bạn đã chọn chức năng xuất bảng kê khai tiền thuế!!===============");
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                    for (int i = 0; i < n; i++) {
                        v[i].tinhThue();
                    }
                    break;
                case 3:
                System.out.printf("Bạn chọn chức năng thoát!! Tạm biêt!!");
                System.exit(0);

                default: System.out.println("Lựa chọn sai!!");
            }
        }while (true);
    }
}

