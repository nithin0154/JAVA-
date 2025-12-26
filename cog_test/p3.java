package cog_test;

import java.util.Scanner;

public class p3 {
    public static void fChar(String s){
        int[] nums = new int[26];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=0;
        }
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i)-'a';
            nums[k]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                char c =  (char)(97+i);
                System.out.println(c);
                return;
            }
            
        }
        System.out.println(-1);
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       fChar(s);
       sc.close();
   }
}
