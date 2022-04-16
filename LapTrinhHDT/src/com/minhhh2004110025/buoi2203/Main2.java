package com.minhhh2004110025.buoi2203;

public class Main2 {
    public static void main(String[] args) {
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        String nhapTiep = null;

        ConsoleInputing consoleInputing = new ConsoleInputing();

        do {
            GiaoDich giaoDich = consoleInputing.nhapGiaoDich();
            danhSachGiaoDich.them(giaoDich);
            System.out.print("Ban muon nhap tiep khong?Y/N>>");
            nhapTiep = consoleInputing.getNhap().nextLine();

        } while (nhapTiep.equalsIgnoreCase("Y"));

        // GiaoDich giaoDich = danhSachGiaoDich.timKiemGiaoDich("GD001");

        // danhSachGiaoDich.xoaGiaoDich(giaoDich);

        // // sua
        // GiaoDich giaoDichSua = danhSachGiaoDich.timKiemGiaoDich("GD001");

        // int viTri = danhSachGiaoDich.timViTriCuaGD(giaoDichSua);

        // giaoDich.setDonGia(450);
        // giaoDich.setDienTich(1000);

        // danhSachGiaoDich.suaGiaoDich(viTri, giaoDichSua);

    }

}
