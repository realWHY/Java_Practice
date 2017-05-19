/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungyu Wei
 */
import static java.lang.System.out;
public class javawork4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]  num= {70,80,31,37,10,1,48,60,33,80};
        int smallNum = 0;
        int position = 0;
        boolean swapflag = false;
        for(int i =0; i<num.length;i++)
        {
            smallNum = num[i];
             swapflag = false;
            for(int j =i; j<(num.length);j++)
            {
                if(num[j]<smallNum)
                {
                    smallNum = num[j];
                    position = j;
                    swapflag = true;
                }
            }
             if(swapflag)
            {
                swap(num, i, position);
            }
             
             out.printf("---------------%d--------------%n",i);
             for(int a: num)
             {      
                out.printf("%d\t",a);
             }
             out.printf("%n");
        }     
    }
    
    public static void swap(int[] numArray,int oriposition, int desposition)
    {
        int tmp = 0;
        tmp = numArray[oriposition];
        numArray[oriposition] = numArray[desposition];
        numArray[desposition] = tmp;
    }
}
