package com.minhhh2004110025.baithigiuaky;

public class GiaoDichNha extends GiaoDich{
    private int loaiNha;

    public GiaoDichNha(int loaiNha) {
        super();
        this.loaiNha = loaiNha;
    }

    public GiaoDichNha() {
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNloaiNha) {
        this.loaiNha = loaiNha;
    }

    public void nhapThongTinGiaoDich(){
        super.nhapThongTinGiaoDich();
        System.out.println("Loại đất: " );
        scanner.nextInt();
    }

    public Double TinhTien() {
        if (loaiNha == 1) return this.thanhTien = this.dienTich * this.donGia;
        else return this.thanhTien = this.dienTich * this.donGia * 0.9;
    }

    @Override
    public String toString() {
        String temp;
        if (loaiNha == 1) temp = "Cao cấp";
        else temp = "thường" ; 
        return "Giao Dịch Đất: " + super.toString() + "Loại nhà: " + temp + "Thành tiền: " + thanhTien ;
    }
    
}
