package com.minhhh2004110025.buoi2203;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<GiaoDich> danhSach = new ArrayList<>();

    private int soLuongGiaoDichDat;
    private int soluongGiaoDichNha;

    /**
     * @return the soLuongGiaoDichDat
     */
    public int getSoLuongGiaoDichDat() {
        return soLuongGiaoDichDat;
    }

    /**
     * @return the soluongGiaoDichNha
     */
    public int getSoluongGiaoDichNha() {
        return soluongGiaoDichNha;
    }

    public void them(GiaoDich giaoDich){

        danhSach.add(giaoDich);

    }

    public void inDanhSach(){
        for (GiaoDich giaoDich : danhSach) {
            System.out.println(giaoDich);
        }
    }

    public void tinhTongSLTungLoai(){
        for (GiaoDich giaoDich : danhSach) {
            if(giaoDich instanceof GiaoDichDat){
                this.soLuongGiaoDichDat++;
            }else{
                this.soluongGiaoDichNha++;
            }
        }
    }

    public double tinhTongTBGDDat(){
        double tienGDDat = 0.0;
        int dem = 0;
        for (GiaoDich giaoDich : danhSach) {

            if(giaoDich instanceof GiaoDichDat){
                dem++;
                tienGDDat += giaoDich.tinhTien();
            }
            
        }
        return tienGDDat/dem;
    }
    // // timKiem
    // public void timKiemGiaoDich() {
    //     GiaoDichDat giaoDich = null;
    //     for (GiaoDich gd : danhSach) {
    //         if (gd.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)){
    //             giaoDich = gd;
    //         }
    //     }
    //     return giaoDich;

    // }
    //xoa
    public void xoaGiaoDich(GiaoDich giaoDich) {
        this.danhSach.remove(giaoDich);
        
    }

    
}
