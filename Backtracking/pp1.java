package Backtracking;

public class pp1 {
    public static void printSolution(int[][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] maze, int x , int y) {
        return (x>=0 && x<maze.length &&y>=0 && y<maze.length && maze[x][y]==1);
    }
    public static boolean solveMaze(int[][] maze){
        int N = maze.length;
        int solution[][] = new int[N][N];
        if (solveMazeUtil(maze, solution, 0, 0)==false) {
            System.out.println("solution doesn't exist");
            return false;
        }
        printSolution(solution);
        return true;
    }
    public static boolean solveMazeUtil(int[][] maze,int[][] solution, int i, int j){
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1){
            solution[i][j]=1;
            return true;
        }
        //check if maze[i][j] is valid 
        if(isSafe(maze,i,j)==true){
            if(solution[i][j]==1){
                return false;
            }
            solution[i][j]=1;
            if(solveMazeUtil(maze, solution, i+1, j)){
                return true;
            }
            if (solveMazeUtil(maze, solution, i, j+1)) {
                return true;
            }
            solution[i][j]=0;
            return false;
        }
       return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0},
                      {1,1,0,1},
                      {0,1,0,0},
                      {1,1,1,1}};
        int solution[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        solveMaze(maze);
    }
}
