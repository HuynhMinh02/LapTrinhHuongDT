package com.minhhh2004110025.buoi2203;

import com.minhhh2004110025.buoi9.Dog;

public class DanhSachThuTestDrive {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();


        DanhSachThu danhSachThu = new DanhSachThu();
        danhSachThu.them(dog);

       Dog dogTimDuoc = danhSachThu.timKiemDog("cho");
    }
}
