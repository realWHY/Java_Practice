/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork7_2;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Hungyu Wei
 */
public class Clip implements Playable{
    ArrayList<Playable> clip = new ArrayList<Playable>();
    public void collectFrame(Playable FrameClip){
        clip.add(FrameClip);
    }
    
    @Override
    public void play(){
       for(Playable obj:clip){
           obj.play();
       }
    }
}
