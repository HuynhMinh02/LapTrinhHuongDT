package com.minhhh2004110025.baitapvenha;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date nSX , nHH;

    public HangThucPham(){

    }
    public HangThucPham(String maHang) {
        this.setMaHang(maHang);
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date nSX, Date nHH) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNSX(nSX);
        this.setNHH(nHH);
    }

    public String getMaHang() {
        return maHang;
    }

    private void setMaHang(String maHang) {
        if (this.maHang != null) {
        this.maHang = maHang;
        }else {
            System.out.println("Mã hàng không được để rỗng!!!");
            this.maHang = "default";
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (this.tenHang != null) {
            this.tenHang = tenHang;
        }else {
            System.out.println("Tên hàng không được để rỗng!!");
            this.tenHang = "default";
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (this.donGia > 0) {
            this.donGia = donGia;
        }else {
            System.out.println("Đơn giá không được để âm!!");
        }
    }

    public Date getnSX() {
        return nSX;
    }

    public void setNSX(Date nSX) {
        if (nSX != null) {
            this.nSX = nSX;
            if (nSX.before(nHH)){
                this.nSX = nSX;
            }else{
                System.out.println("Ngày sản xuất phải trước ngày hết hạn!!");
                this.nSX = new Date();
            }
        }else{
            System.out.println("Ngày hết hạn không được rỗng!!");
            this.nSX = new Date();
        }
    }

    public Date getnHH() {
        return nHH;
    }

    public void setNHH(Date nHH) {
        if (nHH != null) {
            this.nHH = nHH;
            if (nHH.after(nSX)){
                this.nHH = nHH;
            }else{
                System.out.println("Ngày hết hạn phải sau ngày sản xuất!!");
                this.nHH = new Date();
            }
        }else {
            System.out.println("Ngày hết hạn không được rỗng!!");
            this.nHH = new Date(); // ngày hiện tại
        }
    }

    // hàm kiểm tra ngày hết hạn
    public boolean kiemtraHSD(){
        boolean isHetHan = false;
        if (this.nSX.before(new Date())){
            isHetHan = true;
        }
        return isHetHan;
    }
    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienViet = NumberFormat.getCurrencyInstance(localeVN);
        return "HangThucPham [donGia=" + tienViet.format(donGia) + ", maHang=" + maHang + ", nHH=" + sf.format(nHH) + ", nSX=" + sf.format(nSX) + ", tenHang="
                + tenHang + "]";
    }
    
    

    
}
