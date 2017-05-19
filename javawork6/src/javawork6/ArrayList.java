/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork6;

import java.util.Arrays;

/**
 *
 * @author Hungyu Wei
 */
public class ArrayList {
    Object[] elems;
    int next;
   
    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Object o) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = o;
    }
    
    public Object get(int index) {
        return elems[index];
    }
    
    public int size() {
        return next;
    }
}
