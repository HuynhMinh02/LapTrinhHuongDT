package com.minhhh2004110025.buoi2;

import java.util.Scanner;

public class SinhVienGDU {
    int tuoi;
    String name;
    Double diemTB;
    String khoa;
    String gioiTinh;

    Scanner scanner = new Scanner(System.in);

    public SinhVienGDU(){

    }
    public SinhVienGDU(String name, int age, String gt, String kH, Double diemTB){
        this.name = name;
        this.tuoi = age;
        this.gioiTinh = gt;
        this.khoa = kH;
        this.diemTB = diemTB;
    }
    public String getName(){
         return name;
    }
    public int getAge(){
         return tuoi;
    }
    public String getGt(){
        return gioiTinh;
    }
    public String getKhoa(){
        return khoa;
    }
    public Double getDiemTB(){
        return diemTB;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.tuoi = tuoi;
    }
    public void setGt(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }

    public void nhapThongTin() {   
        System.out.println ("Nhập tên sinh viên: " );
        name = scanner.nextLine();
        System.out.println("Nhập tuoi: ");
        tuoi = scanner.nextInt();
        System.out.println("Nhập gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập khoa: ");
        khoa = scanner.nextLine();
        System.out.println ("Nhập điểm trung bình: " );
        diemTB = scanner.nextDouble();
    }
    public void inThongTin() {
        System.out.println("Tên sinh vien: " + name);
        System.out.println("Age: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Nhập khoa: " + khoa);
        System.out.println ("Điểm trung bình: " + diemTB);
    }
}
