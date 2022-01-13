package com.minhhh2004110025.buoi2;

public class SinhVienGDUTestDrive {
    public static void main(String[] args) {
        SinhVienGDU sv1 = new SinhVienGDU("Nguyễn Minh Tuán", 18, "Nam" , "Khoa CNTT", 8.0 );
        SinhVienGDU sv2 = new SinhVienGDU("Lê Việt Đức", 18, "Nam" , "Khoa CNTT", 9.0 );
        SinhVienGDU sv3 = new SinhVienGDU("Huỳnh Hữu Minh", 18, "Nam" , "Khoa CNTT", 8.5 );
        
        sv1.inThongTin();
        sv2.inThongTin();
        sv3.inThongTin();
    }
}