package BackTracking;

import java.util.ArrayList;

public class Maze_Full_Code {
    public static void main(String[] args) {
        //1st  one
        System.out.println(mage(3, 3));
        // 2nd one
        path("", 3, 3);

        //3r one ArrayList formate this one
        System.out.println(pathRet("", 3, 3));

        //4th one

        boolean board[][] = { {true,true,true},
                              {true,false,true},
                              {true,true,true}};

        pathRestriction("",board,0,0);


    }


    static int mage(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = mage(r - 1, c);
        int right = mage(r, c - 1);
        return left + right;
    }


    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }

    }


    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {

            ans.addAll(pathRet(p + 'D', r - 1, c));

        }
        if (c > 1) {
            ans.addAll(pathRet(p + 'R', r, c - 1));

        }
        return ans;

    }

    static void pathRestriction(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if( maze[r][c] == false ){   // not false is true here// we can write like this-->  if(!maze[r][c]) { return; }
            return;
        }

        if (r < maze.length - 1 ) {
            pathRestriction(p + 'D',maze, r + 1, c);
        }

        if (c < maze[0].length-1) {
            pathRestriction(p + 'R',maze, r, c + 1);
        }

    }

}