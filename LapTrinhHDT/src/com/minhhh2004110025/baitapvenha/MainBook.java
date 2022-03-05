package com.minhhh2004110025.baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;
 
public class MainBook {
     
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSGK = new ArrayList<>();
        ArrayList<SachThamKhao> arrSTK = new ArrayList<>();
        int soSGK, soSTK;
        double tinhTongTienSGK = 0;
        double tinhTongTienSTK = 0 ;
        double tongDonGiaSachThamKhao = 0;
        double trungBinhCongDonGia = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập số sách giáo khoa: ");
        soSGK = scanner.nextInt();

        System.out.print("Nhập số sách tham khảo: ");
        soSTK = scanner.nextInt();
         
        System.out.println("==================Nhập thông tin sách giáo khoa:=================");
        for (int i = 0; i < soSGK; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.nhapSach();
            arrSGK.add(sgk);
        }
         
        System.out.println("====================Nhập thông tin sách tham khảo:=================");
        for (int i = 0; i < soSTK; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachThamKhao stk = new SachThamKhao();
            stk.nhapSach();
            arrSTK.add(stk);
        }
        
        System.out.println("===================Thông tin sách giáo khoa ==================");
        for (int i = 0; i < arrSGK.size(); i++) {
            System.out.println(arrSGK.get(i).toString());
        }
         
        System.out.println("================Thông tin sách tham khảo =====================");
        for (int i = 0; i < arrSTK.size(); i++) {
            System.out.println(arrSTK.get(i).toString());
        }


        System.out.println("================Tính tổng thành tiền cho từng loại sách ==========");

        for (int i = 0; i < arrSGK.size(); i++) {
            if (arrSGK.get(i).getNumber() == 0) {
                tinhTongTienSGK += arrSGK.get(i).getSoLuong() * 
                arrSGK.get(i).getDonGia() * 50 / 100;
            } else if (arrSGK.get(i).getNumber() == 1) {
                tinhTongTienSGK += arrSGK.get(i).getSoLuong() * 
                arrSGK.get(i).getDonGia();
            }
        }
        System.out.println("Tổng tiền sách giáo khoa = " + tinhTongTienSGK);

        for (int i = 0; i < arrSTK.size(); i++) {
            tinhTongTienSTK += arrSTK.get(i).getSoLuong() * 
            arrSTK.get(i).getDonGia() + arrSTK.get(i).getThue();
        }
        System.out.println("Tổng tiền sách tham khảo = " + tinhTongTienSTK);
         

        System.out.println("===============Trung bình cộng đơn giá các sách tham khảo=================");
        for (int i = 0; i < arrSTK.size(); i++) {
            tongDonGiaSachThamKhao += arrSTK.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachThamKhao /arrSTK.size();
        }
        System.out.println("Trung bình cộng đơn giá các sách tham khảo = " + trungBinhCongDonGia);
         
        System.out.println("==================Các sách giáo khoa của nhà xuất bản X =================");
        for (int i = 0; i < arrSGK.size(); i++) {
            if (arrSGK.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSGK.get(i).toString());
            }
        }
    }
 
}
