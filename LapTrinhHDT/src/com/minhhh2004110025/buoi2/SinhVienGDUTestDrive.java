package com.minhhh2004110025.buoi2;

public class SinhVienGDUTestDrive {
    public static void main(String[] args) {
        SinhVienGDU tuanStudent = new SinhVienGDU("Nguyễn Minh Tuán", 18, "Nam" , "Khoa CNTT", 8.0 );
        SinhVienGDU ducStudent = new SinhVienGDU("Lê Việt Đức", 18, "Nam" , "Khoa CNTT", 9.0 );
        SinhVienGDU minhStudent = new SinhVienGDU("Huỳnh Hữu Minh", 18, "Nam" , "Khoa CNTT", 8.5 );
        
        tuanStudent.inThongTin();
        ducStudent.inThongTin();
        minhStudent.inThongTin();
    }
}