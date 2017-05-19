/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork8;

import java.util.Scanner;

/**
 *
 * @author Hungyu Wei
 */
public class JavaApplication8_1and2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1)
        };

        Scanner console = new Scanner(System.in);
        for(CashCard card : cards) {
            System.out.printf("為 (%s, %d, %d) 儲值：", 
                    card.number, card.balance, card.bonus);
            card.store(console.nextInt());
            System.out.printf("明細 (%s, %d, %d)%n",
                    card.number, card.balance, card.bonus);
        }
        try{
            cards[0].charge(23333333);
        }catch(InsufficientException e){
            e.printStackTrace();
            System.out.println(e.getRemain());
        }
    }
    
}
