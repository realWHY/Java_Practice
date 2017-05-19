/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork10;

import java.io.*;

/**
 *
 * @author Hungyu Wei
 */
public class javawork10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
            dump(new InputStreamReader(new FileInputStream("aa.txt"), "UTF-8"),
                 new OutputStreamWriter(new FileOutputStream("bb.txt"),"UTF-8"));    
        }catch(IOException  ex){
             ex.printStackTrace();
        }
    }
    
    public static void dump(Reader src, Writer dest)throws IOException{
        try(Reader input = src; Writer output = dest){
            char[] data = new char[1024];
            int length;
            while((length = input.read(data))!=-1){
                output.write(data,0,length);
            }
        }
    }
}
