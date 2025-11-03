

import java.util.Scanner;

public class Palindrome {
    public static void if_palidrome(int num){
        int rev= 0, res =0,intial = num;
        while(num!=0){            
            res = num%10;
            rev = rev*10+res;
            num = num/10;
        }
        System.out.println(rev+","+intial);
        if(intial == rev){
        System.out.println("The number is a palindrome!");
    }else{
        System.out.println("Number is not a palindrome");
    }
        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check palindrome : ");
        int num = sc.nextInt();
        if_palidrome(num);
        sc.close();
    }
    
}
