/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork9;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Hungyu Wei
 */
public class javawork9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words={"RADAR","WATER START","MILK KLIM","RESERVERED","IWI"};
        List listwords = Arrays.asList(words);
        findSymmetry(listwords);
    }
    static void findSymmetry(Iterable<String> iterable){
        Iterator iterator = iterable.iterator();
        boolean theSame = false;
        while(iterator.hasNext()){
            theSame = false;
            String a = (String)iterator.next();
            //out.println(a.length());
            for(int i =0; i< a.length()/2;i++){
                if(a.charAt(i)==a.charAt(a.length()-1-i)){
                    theSame = true;
                }
                else{
                    theSame = false;
                    break;
                }
            }
            if(theSame){
                out.println(a);
            }
        }
    }
}
