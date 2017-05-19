/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork6;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hungyu Wei
 */
public class javawork6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newArrayList2 names1 = new newArrayList2();
        newArrayList2 names2 = new newArrayList2();
        out.println("Please enter names to array1: ");
        collectNameTo(names1);
        out.println("------------------------------------");
        out.println("Please enter names to array2: ");
        collectNameTo(names2);
        if(names1.equals(names2))
        {
            out.println("the two array are the same");
        }
        else
        {
            out.println("the two array are NOT the same");
        }
    }
    
    static void collectNameTo(newArrayList2 names) {
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
    
}

class newArrayList2 extends ArrayList{
    @Override
    public boolean equals(Object anobject){
        boolean comp = false;
        if(this == anobject)
        {
            comp = true;
        }
        else
        {
            if(anobject instanceof newArrayList2)
            {
                newArrayList2 anobjecttmp =(newArrayList2)anobject;
                if(this.size() == anobjecttmp.size())
                {
                    comp = Arrays.equals(this.elems,anobjecttmp.elems);
                }
                else
                {
                    comp = false;
                }
            }
        }
        return comp;
    }
}