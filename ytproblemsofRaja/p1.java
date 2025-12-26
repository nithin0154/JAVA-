package ytproblemsofRaja;

import java.util.Scanner;

public class p1 {
    static boolean isSorted(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the length of array:");
       int n = sc.nextInt();
       int[] nums = new int[n];
       for (int i = 0; i < n; i++) {
        nums[i]=sc.nextInt();
       }
       System.out.println(isSorted(nums));
       sc.close();
    }
}
