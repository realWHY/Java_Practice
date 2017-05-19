/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork8;

/**
 *
 * @author Hungyu Wei
 */
class CashCard {
    String number;
    int balance;
    int bonus;
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    
    void store(int money) {  // 儲值時呼叫的方法
        try{
            if(money > 0) {
                this.balance += money;
                if(money >= 1000) { 
                    this.bonus++;
                }
            }
            else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            throw e;
        }
    }
    
    void charge(int money) throws InsufficientException{ // 扣款時呼叫的方法
        if(money > 0) {
            try{
                if(money <= this.balance) {
                    this.balance -= money;
                }
                else {
                    throw new InsufficientException("Not enough",this.balance);
                } 
            }catch(InsufficientException e){
                e.printStackTrace();
                throw e;
            }
        }
        else {
            System.out.println("扣負數？這不是叫我儲值嗎？");
        }
    }
    
    int exchange(int bonus) {  // 兌換紅利點數時呼叫的方法
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}

