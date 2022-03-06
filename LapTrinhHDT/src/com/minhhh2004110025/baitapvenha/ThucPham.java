package com.minhhh2004110025.baitapvenha;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ThucPham {
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date nSX , nHH;

    public ThucPham() {

    }

    public ThucPham(int maHang, String tenHang, double donGia, Date nSX, Date nHH) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.nHH = nHH;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getnSX() {
        return nSX;
    }

    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }

    public Date getnHH() {
        return nHH;
    }

    public void setnHH(Date nHH) {
        this.nHH = nHH;
    } 

    public String toString() {
        //sử dụng phương thức Locale để biến đổi thep tiền tệ VN
        Locale locale = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String str = nf.format(donGia);

        //sử dụng phương thức SimpleDateFormat để dịnh dạng ngày tháng năm dd/MM/yyyy
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = df.format(nSX);
        String str2 = df.format(nHH);
        return "\t Thông tin về thực phẩm: \n" + "Mã hàng: " + getMaHang() + "Tên hàng: " + getTenHang() 
        + "Đơn giá: " + str + "Ngày sản xuất: " + str1 + "Hạn sử dụng: " + str2 ; 
        
    }

    //kiểm tra tên hàng không được để trống
    public boolean kiemTraTenHang(boolean th){
        if (this.tenHang =="" || this.tenHang.isEmpty()){
            System.out.println("Không được để trống tên hàng!!");
        }else { th = false;}
        return th;
    }

    
    //khởi tạo phương thức nhập ngày thàng năm
    public void setNSX (int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        // Calendar cung cấp phương thức chuyển đổi ngày giữa một thời điểm cụ thể theo thời gian
        cal.set(year, month -1, day);
        this.nSX = cal.getTime();
    }
    
    //nhập hạn sử dụng
    public void setNHH (int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        this.nHH = cal.getTime();
    }
    
    public boolean kiemTraNgay(boolean t) {
        if (this.getnSX().compareTo(this.getnHH()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }

    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getnHH().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}
