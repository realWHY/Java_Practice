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
public class Exercise1 {
    public static void dump(InputStream src, OutputStream dest) throws IOException{
        try(InputStream input = src; OutputStream output= dest){
            byte[] data = new byte[1024];
            int length;
            while((length = input.read(data)) != -1){
                output.write(data,0,length);
            }
        }
        catch(IOException e){
            FileOutputStream writer = new FileOutputStream("aat.log");
           // OutputStreamWriter err = new OutputStreamWriter(writer,"UTF-8");
            PrintStream aa = new PrintStream(writer);
            e.printStackTrace(aa);
        }
    }
}
