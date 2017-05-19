/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungyu Wei
 */

import java.util.Scanner;
public class javawork4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int answer = 0;
        Scanner console = new Scanner(System.in);
        num = Integer.parseInt(console.nextLine());
        answer = fib(num);
        System.out.println(answer);
            
    }
    
    public static int fib(int num)
    {
        int ans = 0; 
        int[] ansArray = new int[num]; 
        if(num == 1)
        {
            ans = 0;
        }
        else if(num == 2)
        {
            ans = 1;
        }
        else if(num>=3)
        {
            ans = fib(num-2)+fib(num-1);
        }
        return ans;
    }  
}
