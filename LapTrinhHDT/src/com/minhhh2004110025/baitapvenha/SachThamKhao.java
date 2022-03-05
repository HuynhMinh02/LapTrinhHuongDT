package com.minhhh2004110025.baitapvenha;

public class SachThamKhao extends Book{
    private Double thue ;
    private Double thanhTien;

    Book book = new Book();

    public SachThamKhao(){
    }

    public Double getThue() {
        return thue;
    }

    public void setThue(Double thue) {
        this.thue = thue;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapSach (){
        book.nhapSach();
        System.out.println("Nhập thuế: ");
        thue = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return book.toString() + ", thuế: " + this.thue;
    }
    
}
