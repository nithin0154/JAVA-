package Arrays;

import java.util.Scanner;

public class linears {
    public static void main(String[] args) {
        int arr[]= new int[10];
        boolean temp =true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key element to searcch :");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if(key==arr[i]) {
           System.out.println("The element is found at "+i+" index!");
         temp=false;
            break;
           }
        }
        if(temp){
         System.out.println("The entered key doesn't exist in the gievn numbers!");
        }
        sc.close();
       
    }
}
