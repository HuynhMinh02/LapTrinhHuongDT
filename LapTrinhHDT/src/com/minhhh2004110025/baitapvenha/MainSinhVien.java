package com.minhhh2004110025.baitapvenha;

import java.util.Scanner;

public class MainSinhVien {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTin(SinhVien sv){
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        sc.nextLine();
        do {
            System.out.println("Nhập số điện thoại bao gồm 7 số: ");
            sc.nextLine();
        } while (sv.getSDT().length() != 7);
    }

    public static void main(String[] args) {
        SinhVien sv[] = null ;
        int a, n = 0 ;

        do{
            System.out.println("|>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<|");
            System.out.println("|>>1: Nhập thông tin sinh viên!!    |");
            System.out.println("|>>2: Xuất danh sách sinh viên!     |");
            System.out.println("|>>3: Kết thúc!! Thoát!!            |");
            System.out.println("|>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<|");
            System.out.println("Bấm số để chọn (1/2/3)");
            a =sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("=============Bạn đã chọn chức năng nhập thông tin sinh viên!!===============");
                    System.out.print("Nhập số lượng sinh viên: ");
                    n=sc.nextInt();
                    sv = new SinhVien[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i+1) + ": ");
                        sv[i] = new SinhVien();
                        nhapThongTin(sv[i]);
                    }
                    break;
                case 2:
                    System.out.println("=============Bạn đã chọn chức năng xuất danh sách sinh viên!!===============");
                    SinhVien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getId() > sv[j].getId()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
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
