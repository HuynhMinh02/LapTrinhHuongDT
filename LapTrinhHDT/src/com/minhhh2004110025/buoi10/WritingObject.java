package com.minhhh2004110025.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.minhhh2004110025.baitapvenha.HangThucPham;


public class WritingObject {

    public static void main(String[] args) throws IOException {
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //HangThucPham
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mi Gau Do ", 4_000, new Date(), new Date());

        //code voi abstract
        List<HangThucPham> list = new ArrayList<>();
        list.add(htp);
        list.add(htp2);

        //3.
        //objOut.writeObject(htp);
        objOut.writeObject(list);

        System.out.println(htp);

        //4. 
        objOut.close();
    }
    
}
