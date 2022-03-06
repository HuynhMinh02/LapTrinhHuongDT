package com.minhhh2004110025.baitapvenha;

public class SinhVien {
    private String name , address , sDT;
    private int id;
    private static int autoID = 1;

    public SinhVien(){

    } 

    public SinhVien(String name, String address, String sDT) {
        this.id = autoID++;
        this.name = name;
        this.address = address;
        this.sDT = sDT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSDT() {
        return sDT;
    }

    public void setSDT(String sDT) {
        this.sDT = sDT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\t Nhập thông tin SV \n" + id + "\nHọ và tên: " + getName() + "\n Địa chỉ: " + getAddress() + "\n Số điện thoại:" + getSDT();
    }

    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", id, name, address, sDT);
    }
}
