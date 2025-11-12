package Arrays;

import java.util.Scanner;

public class largestinarr {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max= arr[i];
            }
             if (min>arr[i]) {
                min= arr[i];
            }
        }
        System.out.println("The largest of the given array of numbers :"+max);
        System.out.println("The smallest of the given array of numbers :"+min);
        sc.close();
    }
}
