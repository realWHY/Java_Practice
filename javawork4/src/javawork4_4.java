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
import static java.lang.System.out;
public class javawork4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] searchNum = {22, 4 ,64, 32, 12, 6};
        Scanner console = new Scanner(System.in);
        int num = 0;
        int i =0;
        num = Integer.parseInt(console.next());
        //out.println(num);
 
        for(int search:searchNum)
        {
            i++;
            if(num == search)
            {
                out.printf("find the number : %d%n",search);
                break;
            }
            if(i == searchNum.length && num!=search)
            {
                out.println("-1");
            }
            
        }
        
    }

    private static Object Math() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
