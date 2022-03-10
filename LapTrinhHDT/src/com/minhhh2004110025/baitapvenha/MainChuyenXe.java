package com.minhhh2004110025.baitapvenha;
import java.util.ArrayList;
import java.util.Scanner;
 
public class MainChuyenXe {
 
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrCXNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrCXNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chuyến xe nội thành: ");
        soChuyenNoiThanh = scanner.nextInt();
        System.out.print("Nhập số chuyến xe ngoại thành: ");
        soChuyenNgoaiThanh = scanner.nextInt();
         
        System.out.println("Nhập thông tin chuyến xe nội thành:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrCXNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhập thông tin chuyến xe ngoại thành:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrCXNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("-----Thông tin chuyến xe nội thành-----");
        for (int i = 0; i < arrCXNoiThanh.size(); i++) {
            System.out.println(arrCXNoiThanh.get(i).toString());
        }
         
        System.out.println("-----Thông tin chuyến xe ngoại thành-----");
        for (int i = 0; i < arrCXNgoaiThanh.size(); i++) {
            System.out.println(arrCXNgoaiThanh.get(i).toString());
        }
         
        System.out.println("Doanh thu từng chuyến xe: ");
        System.out.println("Doanh thu chuyến xe nội thành: " + doanhThuXeNoiThanh);
        System.out.println("Doanh thu chuyến xe ngoại thành: " + doanhThuXeNgoaiThanh);
    }
 
}
