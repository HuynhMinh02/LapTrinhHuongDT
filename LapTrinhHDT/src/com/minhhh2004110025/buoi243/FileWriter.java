package com.minhhh2004110025.buoi243;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    public FileWriter(String string) {
    }

    public static void write(String fileName, String s) {

        PrintWriter out =  null;
        try {
            File file = new File(fileName);
            out = new PrintWriter(file);

            out.println(s);
            // out.close();

        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("File đéo tồn tại , code gà!!!");
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally........");
            try {
                out.close();   
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

}
