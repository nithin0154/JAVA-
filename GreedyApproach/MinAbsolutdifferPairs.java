package GreedyApproach;
import java.util.*;

public class MinAbsolutdifferPairs {
    public static void main(String[] args) {
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        int[] diff  = new int[A.length];
        Arrays.sort(A);
        Arrays.sort(B);
        int sum =0;
        for (int i = 0; i < B.length; i++) {
             int val = A[i] -B[i];
             sum+=Math.abs(val);
        }
        System.out.println("The minimum difference is :"+sum);
    }
}
