package com.minhhh2004110025.baithicuoiki;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputing {
    public Scanner nhap = new Scanner(System.in);
    private SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    
    /**
     * @return the nhap
     */
    public Scanner getNhap() {
        return nhap;
    }


    public HangHoa nhapHangHoa(){
        HangHoa hangHoa = null;
        try{
            System.out.println("Nhap Ma Hang Hoa: ");
            String maHang = nhap.nextLine();
            System.out.println("Nhap ten Hang Hoa: ");
            String tenHang = nhap.nextLine();
            System.out.println("So luong Hang Hoa: ");
            int soLuong = nhap.nextInt();
            System.out.println("Don Gia: ");
            double donGia = nhap.nextDouble();
            System.out.print("Ban chon loai nao 1-Thuc Pham, 2- Dien may>>, 3- Sanh su: ");
            int loai = nhap.nextInt();
            nhap.nextLine();

            if (loai ==1){
                System.out.println("Nhap ngay,thang,nam san xuat (dd-MM-yyyy): ");
                Date nSX = df.parse(nhap.nextLine());
                System.out.println("Nhap ngay,thang,nam het han (dd-MM-yyyy): ");
                Date nHH = df.parse(nhap.nextLine());
                System.out.println("Nhap vao nha cung cap: ");
                String nhaCungCap = nhap.nextLine();

                hangHoa = new HangThucPham(maHang, tenHang, soLuong, donGia, nSX, nHH, nhaCungCap);

            } else if (loai == 2){
                System.out.println("Nhap thoi gian bao hanh: (thang)");
                Double thoiGianBH = nhap.nextDouble();
                System.out.println("Nhap cong suat cua may: (W)");
                Double congSuat = nhap.nextDouble();

                    
                hangHoa = new HangDienMay(maHang, tenHang, soLuong, donGia, thoiGianBH, congSuat);
            }else if (loai == 3){
               
                System.out.println("Nhap vao ngay nhap kho: ");
                Date nNK = df.parse(nhap.nextLine());
                System.out.println("Nhap nha san xuat: ");
                String nhaSanXuat = nhap.nextLine();
                hangHoa = new HangSanhSu(maHang, tenHang, soLuong, donGia, nNK, nhaSanXuat);
            }else {
                System.out.println("Chon loai hang khong dung!!!!");
            }
            
        } catch (InputMismatchException ei) {
        System.out.println("Ban da nhap sai. Xin vui long nhap lai!");
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        return hangHoa;
    } 

}
    


