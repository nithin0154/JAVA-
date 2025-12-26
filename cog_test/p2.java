package cog_test;

import java.util.Scanner;

public class p2 {
    public static void solve(int n){
        int ans = countWays(0 , 0,n);
        System.out.println("The no of unique paths :"+ans);

    }
    public static int countWays(int i, int j,int n){
        if(i>=n || j>=n){
            return 0;
        }
        if (i==n-1 && j ==n-1) {
            return 1;
        }
        int rightWays = countWays(i, j+1, n);
        int downWays = countWays(i+1, j, n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }
}
