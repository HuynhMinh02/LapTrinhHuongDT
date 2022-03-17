package com.minhhh2004110025.baithigiuaky;

public class GiaoDichDat extends GiaoDich{
    private int loaiDat;

    public GiaoDichDat(int loaiDat){
        super();
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat() {
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    
    public void nhapThongTinGiaoDich(){
        super.nhapThongTinGiaoDich();
        System.out.println("Loại đất: " );
        scanner.nextInt();
    }
    
    public Double TinhTien() {
        if (loaiDat == 1) return this.thanhTien = this.dienTich * this.donGia * 1.5; 
        else return this.thanhTien = this.dienTich * this.donGia;
    }

    @Override
    public String toString() {
        String temp ;
        if (loaiDat == 1) temp = "A" ;
        else if (loaiDat == 2) temp = "B" ;
        else temp = "C" ;
        return "Giao Dịch Đất: " + super.toString() + "Loại đất: " + temp + "Thành tiền: " + thanhTien ;
    }

    
}
