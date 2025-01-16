package BackTracking;

import java.util.Arrays;

public class Printing_Path_Numbers {
    public static void main(String[] args) {

        boolean board[][]={ {true,true,true},
                            {true,true,true},
                           {true,true,true}};
       // number("",board,0,0,);
int [][] path = new int[board.length][board[0].length];
number("",board,0,0,path,1);

    }
    static void number(String p,boolean maze[][],int r,int c ,int path[][],int step){

        if(r == maze.length - 1  && c == maze[0].length-1){
            path[r][c] = step;
            for(int []arr : path){
                System.out.println(Arrays.toString(arr));
            }
                System.out.println(p);
            System.out.println();
            return ;
        }
        if(maze[r][c] == false){
            return ;
        }
        maze[r][c] = false;

        if(r < maze.length-1){
            number(p+'D',maze,r+1,c,path,step+1);
        }
        if(c < maze[0].length-1){
            number(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            number(p+'u',maze,r-1,c,path,step+1);
        }
        if(c > 0){
            number(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c] =true;

    }
}