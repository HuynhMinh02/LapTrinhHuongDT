package com.minhhh2004110025.baithicuoiki;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham extends HangHoa{
    private Date ngaySanXuat , ngayHetHan;
    private String nhaCungCap ;


    public HangThucPham(){
        
    }
    
    public HangThucPham(String maHang, String tenHang, int soLuong, double donGia, Date ngaySanXuat, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuong, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan != null){
            if (ngayHetHan.after(this.ngaySanXuat)){
                this.ngayHetHan = ngayHetHan;
            }else {
                System.out.println("Ngay het han phai sau ngya sn xuat !!!");
                this.ngayHetHan = new Date();
            }
        } else {
            System.out.println("Ngay het hang khong duoc rong !!!");
            this.ngayHetHan = new Date();
        }
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        return "HangThucPham " + super.toString() +"[ngayHetHan=" + ngayVietNam.format(ngayHetHan) + ", ngaySanXuat=" + ngayVietNam.format(ngaySanXuat) + ", nhaCungCap=" + nhaCungCap
                + "]";
    }

    
    
}
