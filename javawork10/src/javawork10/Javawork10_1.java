/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.StringWriter;

/**
 *
 * @author Hungyu Wei
 */
public class Javawork10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try{
            FileInputStream reader = new FileInputStream("aa.txt");
            FileOutputStream writer = new FileOutputStream("bb.txt");
            Exercise1.dump(reader, writer);
            System.out.println(writer.toString());
        }catch(IOException e){
             FileOutputStream writer = new FileOutputStream("aaMain.log");
             OutputStreamWriter err = new OutputStreamWriter(writer,"UTF-8");
             PrintStream aa = new PrintStream(writer);
             e.printStackTrace(aa);
        }
    }
    
}
