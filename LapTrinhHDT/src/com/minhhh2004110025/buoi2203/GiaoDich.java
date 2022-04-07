package com.minhhh2004110025.buoi2203;

import java.util.Date;

public abstract class GiaoDich {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;
    
    
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * @return the dienTich
     */
    public double getDienTich() {
        return dienTich;
    }
    

    public abstract double tinhTien();

    public GiaoDich(){}
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    /**
     * @param maGiaoDich
     * @param ngayGiaoDich
     * @param donGia
     * @param dienTich
     */
    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich [dienTich=" + dienTich + ", donGia=" + donGia + ", maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + ngayGiaoDich + "]";
    }
}
