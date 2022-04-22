package com.minhhh2004110025.baithicuoiki;

import com.minhhh2004110025.baithicuoiki.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    private List<HangHoa> dShangHoa = new ArrayList<>();
    private Scanner nhap = new Scanner(System.in);
    private int slHangThucPham, slHangDienMay, slHangSanhsu;
    private Double thueTP = 0.05, thueDM = 0.1 , thueSS = 0.1;

    private static int sumTP, sumDM, sumSS , sum;
    private static int tienVATtp , tienVATdm , tienVATss , sumVAT ;

    public static int getSumTP() {
        return sumTP;
    }

    public static void setSumTP(int sumTP) {
        DanhSachHangHoa.sumTP = sumTP;
    }

    public static int getSumDM() {
        return sumDM;
    }

    public static void setSumDM(int sumDM) {
        DanhSachHangHoa.sumDM = sumDM;
    }

    public static int getSumSS() {
        return sumSS;
    }

    public static void setSumSS(int sumSS) {
        DanhSachHangHoa.sumSS = sumSS;
    }

    public int getSlHangDienMay() {
        return slHangDienMay;
    }

    public int getSlHangThucPham() {
        return slHangThucPham;
    }

    public int getSlHangSanhsu() {
        return slHangSanhsu;
    }

    public void add(HangHoa hangHoa) {
        dShangHoa.add(hangHoa);
    }

    public void inDanhSach() {
            for (HangHoa hangHoa : dShangHoa) {
                System.out.println(hangHoa);
            }
        
    }

    public void them(){
        ConsoleInputing consoleInputing = new ConsoleInputing();
        String nhapTiep = null;
        do {
            HangHoa hangHoa = consoleInputing.nhapHangHoa();
            this.add(hangHoa);
            System.out.print("Ban muon nhap tiep khong?Y/N>>");
            nhapTiep = consoleInputing.getNhap().nextLine();
        } while (nhapTiep.equalsIgnoreCase("Y"));
    }

    public HangHoa timkiemHangHoa(String id) {
        HangHoa hh = null;
        for (HangHoa hangH : dShangHoa) {
            if (hangH.getMaHang().equalsIgnoreCase(id)) {
                hh = hangH;
                System.out.println(hangH);
                break;
            }
            else
            System.out.println("Hang hoa khong ton tai trong kho!!!");
        }
        return hh;
    }

    public void sapXep() {
        Collections.sort(dShangHoa, (a, b) -> (int) (a.getDonGia() - b.getDonGia()));
    }

    public void xoa(String id) {
        HangHoa hHoa = null;
        for (HangHoa hangH : dShangHoa) {
            if (hangH.getMaHang().equalsIgnoreCase(id)) {
                hHoa = hangH;
                break;
            }
        }
        if (hHoa != null) {
            dShangHoa.remove(hHoa);
            System.out.println("Hang hoa da duoc xoa khoi kho!!!");
        } else {
            System.out.println("Hang hoa khong ton tai trong kho!!!");
        }
    }

    public void sua() { 
		try {
			System.out.println("Nhap ma hang can sua: ");
			String idSua = nhap.nextLine();
			HangHoa hh = null;

			for (HangHoa hangHoa : dShangHoa) {
                if (hangHoa.getMaHang().equals(idSua)) {
                    hh = hangHoa;
                    break;
                }
            }

			if (hh == null) {
				System.out.println("Ma san pham khong ton tai trong kho!!");
			}

			for (int i = 0; i < dShangHoa.size(); i++) {
				if (idSua.equals(dShangHoa.get(i).getMaHang())) {

					nhap.nextLine();

                    System.out.println("Nhap ten Hang Hoa: ");
                    String tenHang = nhap.nextLine();
                    System.out.println("So luong Hang Hoa: ");
                    int soLuong = nhap.nextInt();
                    System.out.println("Don Gia: ");
                    double donGia = nhap.nextDouble();
                    
                    
                    dShangHoa.get(i).setTenHang(tenHang);
                    dShangHoa.get(i).setSoLuong(soLuong);
                    dShangHoa.get(i).setDonGia(donGia);

                    System.out.println("Sua hang hoa thanh cong!!!");
                    break;
				}else
                System.out.println("Sua hang hoa that bai");
			}

		} catch (InputMismatchException ei) {
			System.out.println("Bạn đã nhập sai giá trị, xin vui lòng nhập lại!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

    public void tinhSLTungLoaiHang() {
        for (HangHoa hangHoa : dShangHoa) {
            if (hangHoa instanceof HangThucPham) {
                this.slHangThucPham++;
                
            }
            if (hangHoa instanceof HangDienMay) {
                this.slHangDienMay++;
                
            } else if (hangHoa instanceof HangSanhSu) {
                this.slHangSanhsu++;
                
            }
        }
    }

    public void tongSoLuongTungLoaiHang() {
        System.out.println("Tong so loai Hang Thuc Pham la: "+ slHangThucPham);
        System.out.println("Tong so loai Hang Dien May la: "+ slHangDienMay);
        System.out.println("Tong so loai Hang Sanh Su la: "+ slHangSanhsu);
    }

    public void tinhSLHangHoaTungLoai() {
        for (HangHoa hangHoa : dShangHoa) {
            if (hangHoa instanceof HangThucPham) {
                sumTP += hangHoa.getSoLuong();  
            }
            if (hangHoa instanceof HangDienMay) {
                sumDM += hangHoa.getSoLuong(); 
            } else if (hangHoa instanceof HangSanhSu) {
                sumSS += hangHoa.getSoLuong();
            }
        }
    }

    public void tongSlHangHoaTungLoai(){
        System.out.println("Tong so luong Hang Thuc Pham ton kho= " + sumTP);
        System.out.println("Tong so luong Hang Dien May ton kho= " + sumDM);
        System.out.println("Tong so luong Hang Sanh Su ton kho = " + sumSS);
    }

    public void tongHangHoa(){
        sum = sumTP + sumDM + sumSS;
        System.out.println("Tong so hang con trong kho la:" + sum);
    }

    public void tinhThueVATTungLoai() {
        for (HangHoa hangHoa : dShangHoa) {
            if (hangHoa instanceof HangThucPham) {
                tienVATtp += thueTP * hangHoa.getDonGia();
            }
            if (hangHoa instanceof HangDienMay) {
                tienVATdm += thueDM * hangHoa.getDonGia();
            } else if (hangHoa instanceof HangSanhSu) {
                tienVATss += thueSS * hangHoa.getDonGia();
            }
        }
    }

    public void tongThueVATTungLoai(){
        System.out.println("Tien VAT cua Hang Thuc Pham = " + tienVATtp);
        System.out.println("Tien VAT cua Hang Dien May = " + tienVATdm);
        System.out.println("Tien VAT cua Hang Sanh Su = " + tienVATss);
    }

    public void tongVAT(){
        sumVAT = tienVATtp + tienVATdm + tienVATss;
        System.out.println("Tong tien thue VAT cua tat ca hang hoa trong cua hang: " + sumVAT);
    }

    public void danhGiaBanHangHTP (){
        if ( this.getSumTP() > 0 ) {
            System.out.println("Hang Thuc Pham kho ban!!");
        } else 
            System.out.println("Hang Thuc Pham ban chay!!");
        
    }
    public void danhGiaBanHangHDM (){
        if (this.getSumDM() < 3){
            System.out.println("Hang Dien May ban duoc!");
        } else 
        System.out.println("Hang Dien May ban khong duoc!");

    }
    public void danhGiaBanHangHSS (){
        if (this.getSumSS() > 50){
            System.out.println("Hang Sanh Su ban cham!!!");
        } else 
            System.out.println("Hang Sanh Su ban chay !!!!");
        
    }

    public void writeToFile (){
        try {
            FileWriter fw = new FileWriter("hanghoa.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
    
            for (HangHoa hangHoa : dShangHoa) {
                bw.write(hangHoa.toString());
                bw.newLine();
            }
    
            bw.close();
            fw.close();
    
            System.out.println("Ghi file thanh cong!!!");

            
    
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void readToFile (){
        try {
            FileReader fr = new FileReader("hanghoa.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            while(true){
                if (line == null){
                    break;
                }
                line = br.readLine();
                System.out.println(line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void thongKe(){
        System.out.println("===============SO LUONG 3 LOAI HANG HOA ===============");
        this.tinhSLTungLoaiHang();
        this.tongSoLuongTungLoaiHang();
        System.out.println("============TONG SO LUONG CUA TUNG LOAI HANG HOA TRONG KHO========");
        this.tinhSLHangHoaTungLoai();
        this.tongSlHangHoaTungLoai();
        System.out.println("============TONG TAT CA SO LUONG HANG TRONG KHO=================");
        this.tongHangHoa();
        System.out.println("=================TIEN THUE CUA TUNG LOAI HANG====================");
        this.tinhThueVATTungLoai();
        this.tongThueVATTungLoai();
        System.out.println("=================TIEN THUE CUA HANG HOA TRONG CUA HANG====================");
        this.tongVAT();
    }


    
}
