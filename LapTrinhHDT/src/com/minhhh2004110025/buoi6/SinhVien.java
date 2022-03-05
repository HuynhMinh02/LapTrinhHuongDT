package com.minhhh2004110025.buoi6;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String hoTen;
    private float diemLt , diemTh ;

    public int getMSSV() {
        return mssv;
    }
    public void setMSSV(int mssv) {
        this.mssv = mssv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLt() {
        return diemLt;
    }
    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }
    public float getDiemTh() {
        return diemTh;
    }
    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }
    public SinhVien (){

    }
    public SinhVien(int maSv, String hoTen, float diemLt, float diemTh) {
        this.mssv = maSv;
        this.hoTen = hoTen;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
    }
    private float tinhDiemTb(){
       float tb = (this.diemLt + this.diemTh) / 2;
       return tb;
    }

    public String toString() {
        String string = "\t Thông tin sinh viên \n" + "MSSV:" + getMSSV() + "\t Name: " + " " + getHoTen() + "\t Điểm LT: " + getDiemLt() + "\t Điểm TH " + getDiemTh() + "\t Điểm TB: " + tinhDiemTb();
        return string;
    }
} 
