package com.bibek.fileReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteText {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("demo.text", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("hellow");
            pw.println("hi there");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try {
//            File f = new File("demo.txt");
//        } catch () {
//
//        }
    }
}
