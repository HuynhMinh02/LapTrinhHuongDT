package com.minhhh2004110025.baitapvenha;

import java.util.Scanner;

public class ThongTinChuyenXe {
    private int maSoChuyenXe, soXe, soTuyen;
    private String hoTenTaiXe, noiDen;
    private double doanhThu, soKmDiDuoc, soNgayDiDuoc;
    public Scanner sc = new Scanner(System.in);

    public ThongTinChuyenXe(){}

    public ThongTinChuyenXe(int maSoChuyenXe, int soXe, int soTuyen, String hoTenTaiXe, double doanhThu,
            double soKmDiDuoc) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.soXe = soXe;
        this.soTuyen = soTuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ThongTinChuyenXe(int maSoChuyenXe, int soXe, String hoTenTaiXe, String noiDen, double doanhThu,
            double soNgayDiDuoc) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.noiDen = noiDen;
        this.doanhThu = doanhThu;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    

    public int getMaSoChuyenXe() {
        return maSoChuyenXe;
    }

    public void setMaSoChuyenXe(int maSoChuyenXe) {
        this.maSoChuyenXe = maSoChuyenXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    private double tongDoanhThuNoiThanh(){
        double tdt = this.doanhThu * this.soTuyen;
        return tdt;
    }

    private double tongDoanhThuNgoaiThanh(){
        double tdt = this.doanhThu * this.soNgayDiDuoc;
        return tdt;
    }
    
    protected void nhapNoiThanh(){
        System.out.println("Nhap ma so chuyen xe: ");
        maSoChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("So xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("So tuyen: ");
        soTuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("So km di duoc: ");
        soKmDiDuoc = sc.nextInt();
        sc.nextLine();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    protected void nhapNgoaiThanh(){
        System.out.println("Nhap ma so chuyen xe: ");
        maSoChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("So xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Noi den: ");
        noiDen = sc.nextLine();
        System.out.println("So ngay di duoc: ");
        soNgayDiDuoc = sc.nextInt();
        sc.nextLine();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "\t Thong Tin Chuyen Xe: \n "+"Doanh Thu: " + doanhThu + ", Ho Ten Tai Xe: " + hoTenTaiXe + ", Ma So Chuyen Xe: "
                + maSoChuyenXe + ", Noi Den: " + noiDen + ", So Km Di Duoc: " + soKmDiDuoc + ", So Ngay Di Duoc: " + soNgayDiDuoc
                + ", So Tuyen: " + soTuyen + ", So Xe: " + soXe  + "\t\t Tong Doanh Thu Noi Thanh: \n\n" + tongDoanhThuNoiThanh() + " \t\t Tong Doanh Thu Ngoai Thanh: \n\n" + tongDoanhThuNgoaiThanh();
    }

}