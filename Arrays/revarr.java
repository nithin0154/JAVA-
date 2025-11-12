package Arrays;

import java.util.Scanner;

public class revarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count of numbers: ");
        int  n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int first=0,last =n-1;
        while(first<last){
                int temp= arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                first++;         
                last--;
        }
        System.out.println("********************");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
