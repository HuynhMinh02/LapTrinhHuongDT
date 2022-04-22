package com.minhhh2004110025.baithicuoiki;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        Scanner scanner = new Scanner(System.in);

        try{
            String Date1 = "18-04-2022";
            String Date2 = "20-04-2022";
            String Date3 = "25-04-2022";
            String Date4 = "30-04-2022";
            String Date5 = "16-04-2022";
            String Date6 = "14-04-2022";
            String Date7 = "10-04-2022";
            String Date8 = "22-04-2022";
            String Date9 = "26-04-2022";
            Date d1 = df.parse(Date1);
            Date d2 = df.parse(Date2);
            Date d3 = df.parse(Date3);
            Date d4 = df.parse(Date4);
            Date d5 = df.parse(Date5);
            Date d6 = df.parse(Date6);
            Date d7 = df.parse(Date7);
            Date d8 = df.parse(Date8);
            Date d9 = df.parse(Date9);
            HangHoa htp = new HangThucPham("HTP01", "Mi Hao Hao", 10, 3_000, d1, d4, "ACECOOK");
            HangHoa htp1 = new HangThucPham("HTP02", "Sting", 6, 8_000, d2, d9, "PEPSI");
            HangHoa htp2 = new HangThucPham("HTP03", "Xuc Xich", 10, 5_000, d6, d8, "ABBY");
            HangHoa hdm1 = new HangDienMay("HDM01", "Tu Lanh", 3, 10_000_000, 24.0, 90.0);
            HangHoa hdm2 = new HangDienMay("HDM02", "May Lanh", 1, 7_000_000, 24.0, 120.0);
            HangHoa hdm3 = new HangDienMay("HDM03", "May Giat", 4, 6_000_000, 24.0, 80.0);
            HangHoa hdm4 = new HangDienMay("HDM04", "May Rua Chen", 0, 5_0000_000, 24.0, 160.0);
            HangHoa hss1 = new HangSanhSu("HSS01", "Dia", 10, 11_000, d5 , "Bat Trang");
            HangHoa hss2 = new HangSanhSu("HSS02", "Binh Tra", 15, 10_000, d3 , "Bat Trang");
            HangHoa hss3 = new HangSanhSu("HSS03", "Ly", 0, 20_000, d8 , "Bat Trang");
            danhSachHangHoa.add(htp);
            danhSachHangHoa.add(htp1);
            danhSachHangHoa.add(htp2);
            danhSachHangHoa.add(hdm1);
            danhSachHangHoa.add(hdm2);
            danhSachHangHoa.add(hdm3);
            danhSachHangHoa.add(hdm4);
            danhSachHangHoa.add(hss1);
            danhSachHangHoa.add(hss2);
            danhSachHangHoa.add(hss3);

        }catch (Exception e){
            e.getCause();
        }
    
        int key1;
        do {
            System.out.println("|>>>>>>>>>>>>>>>>>MENU<<<<<<<><<<<<<<<|");
            System.out.println("|>>1. Them Hang Hoa                   |");
            System.out.println("|>>2. Xuat Danh sach Hang Hoa         |");
            System.out.println("|>>3. Xoa Hang Hoa                    |");
            System.out.println("|>>4. Sua Hang Hoa                    |");
            System.out.println("|>>5. Tim kiem Hang Hoa               |");
            System.out.println("|>>6. Thong ke Hang Hoa               |");
            System.out.println("|>>7. Sap xep Hang Hoa                |");
            System.out.println("|>>8. Danh gia muc do buon ban        |");
            System.out.println("|>>9. Ghi file                        |");
            System.out.println("|>>10. Doc file                       |");
            System.out.println("|>>11. Ket thuc                       |");
            System.out.println("|>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<|");
            System.out.print("Hay lua chon chuc tu 1 -> 11: ");
            int key2 = scanner.nextInt();
            scanner.nextLine();
            switch (key2) {
                case 1:
                    System.out.println(
                            "________________________________Ban da chon chuc nang Them Hang Hoa_____________________________________");
                    danhSachHangHoa.them();
                    danhSachHangHoa.writeToFile();
                    break;

                case 2:
                    System.out.println(
                            "________________________________Ban da chon chuc nang Xuat Danh sach Hang Hoa___________________________");
                    danhSachHangHoa.inDanhSach();
                    break;

                case 3:
                    System.out.println(
                            "________________________________Ban da chon chuc nang Xoa Hang Hoa______________________________________");
                    System.out.println("Nhap ma hang can xoa khoi kho!!!");
                    String idxoa = scanner.nextLine();
                    danhSachHangHoa.xoa(idxoa);
                    danhSachHangHoa.inDanhSach();
                    break;

                case 4:
                    System.out.println(
                            "_________________________________Ban da chon chuc nang Sua Hang Hoa______________________________________");
                    danhSachHangHoa.sua();
                    danhSachHangHoa.inDanhSach();
                    break;

                case 5:
                    System.out.println(
                            "__________________________________Ban da chon chuc nang Tim kiem Hang Hoa________________________________");
                    System.out.println("Nhap ma Hang Hoa can tim: ");
                    String maHang = scanner.nextLine();
                    danhSachHangHoa.timkiemHangHoa(maHang);
                    break;

                case 6:
                    System.out.println(
                            "_________________________________Ban da chon chuc nang Thong ke Hang Hoa________________________________ ");
                    danhSachHangHoa.thongKe();
                    break;

                case 7:
                    System.out.println(
                            "______________________________Ban da chon chuc nang Sap xep Hang Hoa _____________________________________");
                    danhSachHangHoa.sapXep();
                    System.out.println("Danh sach sau khi sap xep ");
                    danhSachHangHoa.inDanhSach();
                    break;

                case 8:
                    System.out.println(
                            "______________________________Ban da chon chuc nang Danh gia muc do buon ban________________________________");
                    danhSachHangHoa.tinhSLHangHoaTungLoai();
                    danhSachHangHoa.danhGiaBanHangHTP();
                    danhSachHangHoa.danhGiaBanHangHDM();
                    danhSachHangHoa.danhGiaBanHangHSS();
                    break;

                case 9:
                    System.out.println(
                            "_______________________________Ban chon Ghi du lieu vao file_______________________________________");
                    danhSachHangHoa.writeToFile();
                    break;

                case 10:
                    System.out.println(
                            "_______________________________Ban chon Doc du lieu tu file_______________________________________");
                    danhSachHangHoa.readToFile();
                    break;

                case 11:
                    System.out.println("Ban da chon chuc nang thoat!!! Tam biet!!!");
                    System.exit(0);
            }
            System.out.println("Chon 1 de tiep tuc, chon 0 de thoat: ");
            key1 = scanner.nextInt();

        } while (key1 == 1);

    }
}
