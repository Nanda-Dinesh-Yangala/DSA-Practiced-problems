package BackTracking;

public class Maze_AllPaths {

        public static void main(String[] args) {

            boolean board[][] = { {true,true,true},
                    {true,true,true},
                    {true,true,true}};
            maze("",board,0,0);

        }
        static void maze(String p,boolean[][] maze,int r,int c){

            if (r == maze.length - 1 && c == maze[0].length-1) {
                // c == maze[0].length - 1: This checks if the current column (c) is the last column in the maze
                System.out.println(p);
                return ;
            }

            if( maze[r][c] == false ){//if it false return or // if it is visited that cell then return
                // not false is true here// we can write like this-->  if(!maze[r][c]) { return; }
                return;
            }
            //if it is not false
            // i am considering this block in my path
            maze[r][c] = false;   // Mark the current cell as visited /// make a change

            if (r < maze.length - 1 ) {
                maze(p + 'D',maze, r + 1, c);
            }

            if (c < maze[0].length-1) {
                maze(p + 'R',maze, r, c + 1);
            }
            if(r>0){
                maze(p+'u',maze,r-1,c);
            }
            if (c>0){
                maze(p+'L',maze,r,c-1);
            }

            // this line is where the function will be over
// so before the function gets removed,also remove the changes that were made by  that function.

            maze[r][c]= true; // reverse that change when that work is done.
            // Unmark the current cell as visited for backtracking
        }
    }

