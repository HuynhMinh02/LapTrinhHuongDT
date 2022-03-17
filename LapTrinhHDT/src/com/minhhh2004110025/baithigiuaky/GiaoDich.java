package com.minhhh2004110025.baithigiuaky;

import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    protected String maGD;
    protected String nGD;
    protected Double donGia , thanhTien;
    protected Float dienTich;
    protected int soLuong;

    Scanner scanner = new Scanner(System.in);


    private void GiaoDich(){

    }

    private void GiaoDich(String maGD, String nGD, Double donGia , Float dienTich , double ttien , int soLuong){
        this.maGD = maGD;
        this.nGD = nGD;
        this.dienTich = dienTich;
        this.donGia = donGia;
        this.thanhTien = ttien;
        this.soLuong = soLuong;
    }

    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }
    public String getnGD() {
        return nGD;
    }
    public void setnGD(String nGD) {
        this.nGD = nGD;
    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public Float getDienTich() {
        return dienTich;
    }
    public void setDienTich(Float dienTich) {
        this.dienTich = dienTich;
    }
    
    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }
    

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapThongTinGiaoDich(){
        System.out.println("Mã giao dịch: " );
        scanner.nextLine();
        System.out.println("Ngày giao dịch: ");
        scanner.nextLine();
        System.out.println("Đơn giá: ");
        scanner.nextDouble();
        System.out.println("Diện tích: ");
        scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "GiaoDich [Mã Giao Dịch: " + maGD + ", Ngày Giao Dịch: " + nGD + ", Đơn Giá: " + donGia + ", Diện tích: " + dienTich + "]";
    }

    

    
}
