/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork7_2;
import static java.lang.System.out;
/**
 *
 * @author Hungyu Wei
 */
public class Frame implements Playable {
    private String name;
    private String action;
    public Frame(String name, String action){
        this.name = name;
        this.action = action;
    }
    
    @Override
    public void play(){
        out.printf("%s do %s%n",name, action);
    }
}
