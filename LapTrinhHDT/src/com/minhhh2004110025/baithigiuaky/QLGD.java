package com.minhhh2004110025.baithigiuaky;

import java.util.List;
import java.util.Scanner;

public class QLGD {
    public static void main(String[] args) {
        ListGiaoDich GD = new ListGiaoDich();
        Scanner scanner = new Scanner(System.in);
        int x;
        do{
            System.out.println("==================MENU=================");
            System.out.println("1. Thêm giao dịch đất!");
            System.out.println("2. Thêm giao dịch nhà!");
            System.out.println("3. Hiển thị danh sách giao dịch!");
            System.out.println("4. Xem tổng số lượng GD!");
            System.out.println("5. Trung bình giao dịch!");
            x = scanner.nextInt();
        switch (x) {
            case 1:
                GD.addGiaoDich(1);
                break;
            case 2:
                GD.addGiaoDich(2);
                break;
            case 3:
                GD.HienThiDs();
                break;
            case 4:
                GD.tongSL();
                break;
            case 5:
                GD.TBThanhTienGD();
                break;
        }
        
    }
    while(x != 0);
    System.out.println("Thoát!! Tạm biệt");
}
}
