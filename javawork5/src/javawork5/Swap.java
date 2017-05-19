/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork5;
import static java.lang.System.out;
/**
 *
 * @author Hungyu Wei
 */
public class Swap {
    static void swap(int num, char start, char temp, char dest){
        if(num == 1)
        {
            out.printf("the plate %d move: %c to %c %n",num, start, dest);
        }
        else
        {
            swap(num-1,start, dest, temp);
            out.printf("the plate %d move: %c to %c %n",num, start, dest);
            swap(num-1,temp, start, dest);
        }
    }
}
