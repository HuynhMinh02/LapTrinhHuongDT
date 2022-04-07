package com.minhhh2004110025.buoi2203;

import java.util.Date;

public class GiaoDichDat extends GiaoDich{
    private char loaiDat;

    public char getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhTien() {
        double tien;
        if(this.loaiDat == 'C' && this.loaiDat == 'B'){
            tien = this.getDienTich() * this.getDonGia();
        }else{
            tien = this.getDienTich() * this.getDonGia() * 1.5;
        }
        return tien;
    }

    /**
     * @param maGiaoDich
     * @param ngayGiaoDich
     * @param donGia
     * @param dienTich
     * @param loaiDat
     */
    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);//cha
        this.loaiDat = loaiDat;//con
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "GiaoDichDat [loaiDat=" + loaiDat + "]" + super.toString();
    }

    
    
}
