/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork5;

/**
 *
 * @author Hungyu Wei
 */

import java.util.Scanner;
import static java.lang.System.out;

public class Javawork5_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        out.printf("please enter number:");
        Scanner console = new Scanner(System.in);
        int number = 0;
        number = console.nextInt();
        out.println(number);
        Swap.swap(number,'A','B','C');
    }
}
