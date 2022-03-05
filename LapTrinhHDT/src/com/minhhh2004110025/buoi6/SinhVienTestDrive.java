package com.minhhh2004110025.buoi6;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(1, "HUYNH HUU MINH", 8, 9);
        SinhVien sv2 = new SinhVien(2, "JonaThan", 6, 7);
        SinhVien sv3 = new SinhVien();

        System.out.println("Nhập MSSV: ");
        int mssv = scanner.nextInt();
        sv3.setMSSV(mssv);

        System.out.println("Nhập họ và tên: ");
        String hoten = scanner.nextLine();
        sv3.setHoTen(hoten);

        System.out.println("Nhập điểm lí thuyết: ");
        float diemLt = scanner.nextFloat();
        sv3.setDiemLt(diemLt);

        System.out.println("Nhập điểm thực hành: ");
        float diemTh = scanner.nextFloat();
        sv3.setDiemTh(diemTh);

        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    
        scanner.close();

    }

}
