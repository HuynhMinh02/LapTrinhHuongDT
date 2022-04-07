package com.minhhh2004110025.baithicuoiki;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class HangHoa {
    private String maHang ;
    private String tenHang;
    private int soLuong ;
    private double donGia;

    public HangHoa(){

    }

    public HangHoa(String maHang, String tenHang, int soLuong, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        if (maHang != null){
            this.maHang = maHang;
        }else {
            System.out.println("Ma hang khong duoc de rong !!!");
            this.maHang = null;
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong duoc rong!");
            this.tenHang = "xxxxxxxxxxxxx";
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0){
            this.soLuong = soLuong;
        }else {
            System.out.println("So luong phai >= 0 !!");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        }else {
            System.out.println("Don gia phai > 0 !!");
        }
    }

    @Override
    public String toString() {

        Locale localeVN = new Locale("vi" , "VN");
        NumberFormat tienViet = NumberFormat.getCurrencyInstance(localeVN);

        return "HangHoa [maHang= " + maHang + ", soLuong= " + soLuong + ", tenHang= " + tenHang +  "Don gia= " + tienViet.format(donGia) + "]";
    }
}
