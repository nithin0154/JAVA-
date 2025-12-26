package Backtracking;

public class Gridways {
    public static int noOfWays(int n, int m,int i, int j){
        if(i==n-1 && j == m-1){// base case
            return 1;
        }else if(i==n || j ==n){//Boundary cross condition
            return 0;
        }
        int rightWays = noOfWays(n, m, i, j+1);
        int downWays = noOfWays(n, m, i+1, j);

        return rightWays+downWays;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(noOfWays(n, m, 0, 0));
    }
}
