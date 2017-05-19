/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungyu Wei
 */

  class Cards{
        String card;
        Cards(String card){
            this.card = card;
        }
        public String toS(){
            return card;
        }
    }   
  
public class javawork4_2 {
      
    public static void main(String[] args) {
        int num = 8;
        int i = 0;
        Cards[] shufflecard = new Cards[8];
      
        for(Enumcard  a : Enumcard.values())//http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
        {
            shufflecard[i] = new Cards(a.toString());
            //System.out.println(shufflecard[0].toS());
            i++;
        }
        shuffle(shufflecard,num);
        for(Cards b : shufflecard)
        {
            System.out.println(b.toS());
        }
    }
    
    public static void shuffle(Cards[] card, int num)
    {
        for(int i =0; i <8; i++)
        {
            int randonNum = (int)(Math.random()*(num));
           // System.out.println(randonNum);
            Cards tmp = card[randonNum];
            card[randonNum] = card[i];
            card[i] = tmp;   
        }
    }
}

enum Enumcard{
    aaa,bbb,ccc,ddd,eee,fff,ggg,hhh
}
