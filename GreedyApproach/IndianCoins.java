package GreedyApproach;

import java.util.ArrayList;
import java.util.Scanner;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int V = sc.nextInt();
        int n = coins.length;
        int i = n - 1;
        while (V > 0 && i>=0) {
            if (V - coins[i] >= 0) {
                int val  = coins[i];
                V = V - val;
                list.add(val);
            } else {
                i--;
            }
        }
        System.out.println(list);
        sc.close();
    }
}
