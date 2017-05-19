/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork3;

import static java.lang.System.out;

/**
 *
 * @author Hungyu Wei
 */
public class javawork3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int group = 0;
        for(a=0; a<10;a++)
        {
            for(b=0; b<10;b++)
            {
                for(c=0; c<10; c++)
                {
                    if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == a*100+b*10+c)
                    {
                       group++;
                       out.printf("---------group %d----------%n",group);
                       out.println(a);
                       out.println(b);
                       out.println(c);
                    }
                }
            }
        }
    } 
}
