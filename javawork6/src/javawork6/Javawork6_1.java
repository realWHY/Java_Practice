/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork6;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Hungyu Wei
 */
public class Javawork6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newArrayList names = new newArrayList();
        collectNameTo(names);
        out.println("訪客名單：");
        printUpperCase(names);
    }
    
    
        static void collectNameTo(newArrayList names) {
        Scanner userInput = new Scanner(System.in);
        while(true) {
            out.print("訪客名稱：");
            String name = userInput.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(newArrayList names) {
            out.println(names.toString()); 
    }
}

class newArrayList extends ArrayList{
    @Override
    public String toString(){
        String string = new String();
        for(int i =0; i<this.next;i++){
            string += this.elems[i];
            string += "\n";
        }
        return  string;
    }
}
