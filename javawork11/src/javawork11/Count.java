package javawork11;
import static java.lang.System.out;
import java.util.concurrent.Executor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungyu Wei
 */
public class Count {
    private Executor executor;
    Count(Executor executor){
        this.executor = executor;
    }
    public void count(){
        for(int i =0;i<3;i++){
            executor.execute(()-> {
                for(int j =0;j<5; j++) 
                    out.printf("j=%d%n",j);
            });
        }
    }
}
