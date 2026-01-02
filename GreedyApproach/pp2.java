package GreedyApproach;

import java.util.ArrayList;

public class pp2 {
    public static int kthOdd(int R,int L, int k){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = R; i >= L; i--) {
            if (i % 2 != 0) {
                list.add(i);
                count++;
            }
        }
        if (count < k) {
            return 0;
        }
        System.out.println(list);
        return list.get(k - 1);
    }
    
    public static void main(String[] args) {
        int L = -10;
        int R= 10;
        System.out.println(kthOdd(R, L, 8));
    }
}
