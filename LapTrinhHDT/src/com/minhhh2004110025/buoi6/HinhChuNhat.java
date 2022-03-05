package com.minhhh2004110025.buoi6;

public class HinhChuNhat {
    private float dai = 0, rong = 0;
    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
    public double tinhChuVi(){
        return (this.dai * this.rong) * 2;
    }
    public double tinhDienTich(){
        return this.dai * this.rong;
    }

    public String toString() {
        String string = "Chieu Dai: " + this.dai + "Chieu Rong: " + this.rong;
        string += "Chu vi: " + this.tinhChuVi()+"Dien Tich: "  + this.tinhDienTich();
        return string;
    }

    
}
