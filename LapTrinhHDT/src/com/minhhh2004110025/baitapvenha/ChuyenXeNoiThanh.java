package com.minhhh2004110025.baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeNoiThanh extends ThongTinChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;
     
    public ChuyenXeNoiThanh() {
        super();
    }
 
    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
 
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public Scanner getScanner() {
        return scanner;
    }
 
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe(); 
        scanner.nextLine();
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        soKmDiDuoc = scanner.nextDouble();
    }

    public String toString() {
        return super.toString() + ", số tuyến: " + this.soTuyen + ", số km đi được: " + this.soKmDiDuoc;
    }
}
