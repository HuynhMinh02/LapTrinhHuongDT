package com.minhhh2004110025.baithicuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa{
    
    private Date ngayNhapKho;
    private String nhaSanXuat;

    
    public HangSanhSu(){

    }
    public HangSanhSu(Date ngayNhapKho, String nhaSanXuat) {
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }

    public HangSanhSu(String maHang, String tenHang, int soLuong, double donGia, Date ngayNhapKho, String nhaSanXuat) {
        super(maHang, tenHang, soLuong, donGia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        if (ngayNhapKho != null){
            this.ngayNhapKho = ngayNhapKho;
        }else{
            System.out.println("Ngay nhao kho khong duoc bo trong!!!");
            this.ngayNhapKho = new Date();
        }
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        return super.toString() +" \t\t Ngay Nhap Kho: " + df.format(ngayNhapKho) + " \t\t Nha San Xuat: " + this.nhaSanXuat ;
    }
   


}
