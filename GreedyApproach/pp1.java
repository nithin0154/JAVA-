package GreedyApproach;

public class pp1 {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        if (n==0) {
            System.out.println(0);
        }
        int l=0,r=0;
        int ans= 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='R') {
                r++;
            }else if (str.charAt(i)=='L') {
                l++;
            }
            if (r==l) {
                ans++;
            }
        }
        System.out.println("The maximum no of partitions :"+ans);
    }
}
