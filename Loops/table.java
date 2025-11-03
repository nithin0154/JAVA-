package Loops;

import java.util.Scanner;

public class table {
          
    public static void main(String[] args) {
        System.out.println("Enter the number table you want to print :");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        System.out.println("Multiplication table of "+ n+" is:");
          for (int i = 1; i <=10; i++) {
            System.out.println(n+" X "+ i +" = "+ (n*i));  
          }
          sc.close();
    } 
}
