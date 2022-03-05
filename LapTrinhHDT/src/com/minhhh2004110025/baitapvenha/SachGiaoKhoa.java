package com.minhhh2004110025.baitapvenha;

public class SachGiaoKhoa extends Book {
    private String tinhTrang;
    private int number;
    private double thanhTien;

    Book book = new Book();
 
    public SachGiaoKhoa() {
    }
 
    public SachGiaoKhoa(String tinhTrang, int number) {
        this.tinhTrang = tinhTrang;
        this.number = number;
    }
 
 
    public String getTinhTrang() {
        return tinhTrang;
    }
 
 
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
 
    public int getNumber() {
        return number;
    }
 
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String tinhTrangSach(int x) {
        switch (number) {
            case 0:
                tinhTrang = "cũ";
                break;
            case 1:
                tinhTrang = "mới";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        book.nhapSach();
        System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
        number = scanner.nextInt();
    }
     
    public String toString() {
        return book.toString() + ", Tình trạng sách: " + this.tinhTrangSach(number);
    }
}
