package com.minhhh2004110025.baithicuoiki;

public class HangDienMay extends HangHoa{
    private Double thoiGianBH;
    private Double congSuat;

    public HangDienMay() {}

    public HangDienMay(Double thoiGianBH, Double congSuat) {
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }

    public HangDienMay(String maHang, String tenHang, int soLuong, double donGia, Double thoiGianBH, Double congSuat) {
        super(maHang, tenHang, soLuong, donGia);
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }

    public Double getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(Double thoiGianBH) {
        if (thoiGianBH >= 0){
            this.thoiGianBH = thoiGianBH;
        }else {
            System.out.println("Thoi gian bao hanh khong co hoac da het bao hanh!!");
        }
    }

    public Double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Double congSuat) {
        if (congSuat > 0){
            this.congSuat = congSuat;
        }else{
            System.out.println("Cong suat khong the bang 0 !!!");
        }
    }
 
    @Override
    public String toString() {
        return  super.toString() +" \t\t Cong Suat: " + this.getCongSuat()+" (W)" + " \t Thoi Gian BH: " + this.getThoiGianBH()+ "thang";
    }

    
   


}
