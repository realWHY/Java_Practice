/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork9;

/**
 *
 * @author Hungyu Wei
 */
import static java.lang.System.out;
public class Javawork9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IterableString<String> a = new IterableString<>("imd fhg");
        a.forEach();
    }
    
}

class IterableString<E>{
    String string;
    IterableString(String string){
        this.string = string;
    }
    
    void forEach(){
        for(int i =0; i<string.length();i++){
            out.println(string.charAt(i));
        }
    }
    
}
