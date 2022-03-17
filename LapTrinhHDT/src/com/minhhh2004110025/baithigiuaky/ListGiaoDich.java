package com.minhhh2004110025.baithigiuaky;

public class ListGiaoDich{
    GiaoDich gd[] = new GiaoDich[50];
    private int soGD , sumdat , sumnha , sum1 , dem ;

    public ListGiaoDich(){
        soGD = 0;
        for (int i = 0; i < 50; i++)
        gd[i] = new GiaoDich();
    }

    public void addGiaoDich(int temp){
        if (soGD > 50)
        System.out.println("Không thể thêm thông tin giao dịch!!!!");
        else{
            if (temp == 1){
                gd[soGD] = new GiaoDichDat();
                GiaoDichDat dat = new GiaoDichDat();
                dat.nhapThongTinGiaoDich();
                dat.thanhTien = dat.TinhTien();
                gd[soGD] = dat;
                sumdat += dat.soLuong;
            }else
            gd[soGD] = new GiaoDichNha();
            GiaoDichNha nha = new GiaoDichNha();
            nha.nhapThongTinGiaoDich();
            nha.thanhTien = nha.TinhTien();
            gd[soGD] = nha;
            sumnha += nha.thanhTien;
            sum1 += nha.soLuong;
            dem ++;
        }
        soGD++;
    }

    public void HienThiDs(){
        for (int i =0 ; i < soGD ; i++){
            System.out.println("Số Giao Dịch: " + (i + 1));
            System.out.println(gd[i].toString());
        }
    }

    public void tongSL(){
        System.out.println("Tổng số lượng GD đất: "+ sumdat);
        System.out.println("Tổng số lượng GD nhà: "+ sumnha);
    }


    public void TBThanhTienGD(){
        System.out.println("Trung bình thành tiền của giao dịch: " + (sum1/dem));
    }
}

