package com.minhhh2004110025.buoi2;

import java.util.Scanner;

public class SinhVienGDU {
    int id;
    String name;
    Double diemTB;

    Scanner scanner = new Scanner(System.in);

    
    void nhapThongTin() {   
        System.out.println ("Nhập tên sinh viên: " );
        name = scanner.nextLine();
        System.out.println("Nhập id: ");
        id = scanner.nextInt();
        System.out.println ("Nhập điểm trung bình: " );
        diemTB = scanner.nextDouble();
    }
    void inThongTin() {
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Tên sinh vien: " + name);
        System.out.println ("Điểm trung bình: " + diemTB);
    }
}
