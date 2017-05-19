/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork5;

/**
 *
 * @author Hungyu Wei
 */
import static java.lang.System.out;

public class javawork5_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maze[][]={
            {2,2,2,2,2,2,2},
            {0,0,0,0,0,0,2},
            {2,0,2,0,2,0,2},
            {2,0,0,2,0,2,2},
            {2,2,0,2,0,2,2},
            {2,0,0,0,0,0,2},
            {2,2,2,2,2,0,2}
        };
        
        Visit.visit(maze, new Point(6,5), new Point(1,0));
        Print.print(maze);
    }
    
}

class Point{
    int x = 0;
    int y = 0;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Visit{
    static public boolean visit(int[][] maze, Point start, Point end){
        boolean SUCCESS = false;
        out.printf("start : %d\n",maze[start.x][start.y]);
	 out.printf("end : %d\n",maze[end.x][end.y]);
        if(maze[start.x][start.y] == 0)
        {
            maze[start.x][start.y] = 1;
          
            if(maze[end.x][end.y] == 0 && 
            (visit(maze, new Point(start.x-1,start.y), end) ||
             visit(maze, new Point(start.x+1,start.y), end) ||
             visit(maze, new Point(start.x,start.y+1), end) ||
             visit(maze, new Point(start.x,start.y-1), end)) == false)
             {
                 maze[start.x][start.y] = 0;
             }
      
        }    
        if(maze[end.x][end.y] == 1)
        {
            SUCCESS = true;
        }
        return SUCCESS;
    }
}

class Print{
 
    static void print(int[][] maze){
         for(int[] i : maze)
        {
            for(int j:i)
            {
                    switch(j)
                    {
                            case 0: 
                                    out.printf("  ");
                            break;

                            case 1: 
                                    out.printf("◇");
                            break;

                            case 2: 
                                    out.printf("█");
                            break;			
                    }
            }
            out.printf("\n");
        }
    }  
}