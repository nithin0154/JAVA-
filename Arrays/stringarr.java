package Arrays;

import java.util.Scanner;

public class stringarr {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String arr[]= new String[10];
    System.out.println("Enter the words :");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextLine();
    }
    System.out.println("********************");
    for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i]);
    }
    sc.close();
 }    
}