package cog_test;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int lsum =0, rsum=0;
        int mid = num.length()/2;
        if(num.length()%2==0){
            System.out.println("Not Balanced");
        }else {
            for (int i = 0; i < mid; i++) {
                lsum =lsum+ (num.charAt(i)-'0');
            }
            for (int i = mid+1; i < num.length(); i++) {
                rsum = rsum+ (num.charAt(i) - '0');
            }
            if (lsum==rsum) {
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }
        }
     
        sc.close();
    }
}
