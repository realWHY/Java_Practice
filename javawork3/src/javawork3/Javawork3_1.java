/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork3;

/**
 *
 * @author Hungyu Wei
 */
import static java.lang.System.out;
public class Javawork3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 496;
        int n = 1000;
        int remain = 0;
        while(n != 0)
        {
                while(m>=n)
                {
                    m = m-n;
                }
                remain = m;
                if(remain<n)
                {
                    m = n;
                    n =remain;
                }
        }
        //out.printf("remain = %d%n",remain);
        //out.printf("m=%d%n",m);
        //out.printf("n=%d%n",n);
        out.printf("Greatest Common Divisor is =%d%n",m);
    }
}
