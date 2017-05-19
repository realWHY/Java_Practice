/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork7_2;

/**
 *
 * @author Hungyu Wei
 */
public class Javawork7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame a = new Frame("beginning","Sing");
        Frame b = new Frame("man show up","jump");
        Frame c = new Frame("woman show up","sit");
        Frame d = new Frame("animals","show up");
        Frame e = new Frame("man","hunt the animals one by one");
        Frame f = new Frame("woman","robs the animals");
        
        Clip clip1 = new Clip();
        clip1.collectFrame(b);
        clip1.collectFrame(c);
        
        Clip clip2 = new Clip();
        clip2.collectFrame(d);
        clip2.collectFrame(e);
        
        Clip clipall = new Clip();
        clipall.collectFrame(a);
        clipall.collectFrame(clip1);
        clipall.collectFrame(clip2);
        clipall.collectFrame(f);
        
        clipall.play();
    }
    
}
