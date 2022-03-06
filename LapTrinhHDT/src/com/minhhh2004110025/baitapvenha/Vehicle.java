package com.minhhh2004110025.baitapvenha;

public class Vehicle {

    private String chuXe, loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle(){
    }

    public Vehicle(String chuXe, String loaiXe, int dungTich, double triGia){
        this.chuXe = chuXe;
        this. loaiXe = loaiXe;
        this. dungTich = dungTich;
        this. triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double tinhThue() {
        double thueXe;
        if (dungTich < 100) thueXe = triGia * 0.01;
        else if (dungTich >= 100 && dungTich <= 200) thueXe = triGia * 0.03;
        else thueXe = triGia * 0.05;
        return thueXe;
    }

    @Override
    public String toString() {
        return "\t ================Danh sách thông tin xe================== \n"+"\t Tên chủ xe: " + getChuXe() + "\tLoại xe" + getLoaiXe() + "\tDung tích" + getDungTich() + "\tTrị giá" + getTriGia() + "\tThuế phải nộp" + tinhThue();
    }
    
    
}
