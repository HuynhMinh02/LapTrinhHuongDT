package com.minhhh2004110025.baitapTet.lap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPham {
    private String name;
    private double price;
    private double discount;
    List<SanPham> lsSp = new ArrayList<SanPham>();
    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public SanPham(){

    }

    public SanPham(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public SanPham(String name, double price){
        this.name = name;
        this.price = price;
        this.discount = 0;
    }

    private double getThueNhapKhau(){
        return price * 0.1;
    }

    public void xuat(){
        System.out.println("=============THÔNG TIN SẢN PHẨM=============");
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá sản phẩm: " + price);
        System.out.println("Giảm giá: " + discount);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        System.out.println("================NHẬP THÔNG TIN SẢN PHẨM=================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        this.price = scanner.nextDouble();
        System.out.println("Nhập giảm giá sản phẩm: ");
        this.discount = scanner.nextDouble();
    }

    public void nhapDanhSachSP(){
        System.out.println("Nhập số lượng sản phẩm mà bạn muốn thêm: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            SanPham sp = new SanPham();
            sp.nhap();
            lsSp.add(sp);
            
        }
    }
    public void xuatDanhSachSP(){
        System.out.printf("%-20S %-20S %-20S %-20S\n", "Tên sản phẩm", "Đơn giá", "Giảm giá", "Thuế nhập nhẩu");
        for (SanPham sanPham : lsSp) {
        sanPham.xuat();
        }
    }
}
