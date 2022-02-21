package com.minhhh2004110025.baitapTet.lap4;

public class main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Tivi", 2000 ,199);
        SanPham sp11 = new SanPham();
        SanPham sp21 = new SanPham();
        sp11.nhap();
        sp21.nhap();
        sp11.xuat();
        sp21.xuat();
        SanPham sp2 = new SanPham("Tủ lạnh", 2000);
        sp1.xuat();
        sp2.xuat();
        SanPham sp = new SanPham();
        sp.nhapDanhSachSP();
        sp.xuatDanhSachSP();
    }
}
