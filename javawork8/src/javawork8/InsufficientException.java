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
public class InsufficientException extends Exception{
    private int remain;
    public InsufficientException(String message, int remain){
        super(message);
        this.remain = remain;
    }
    public int getRemain(){
        return remain;
    }
}
