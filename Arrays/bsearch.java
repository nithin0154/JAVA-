package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count of numbers: ");
        int  n=sc.nextInt();
        int arr[]= new int[n];
        boolean found =false;
        
        System.out.println("Enter the numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the key element to search :");
        int key = sc.nextInt();
        int start =0,end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found at "+(mid+1)+" postion");
                found=true;
                break;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }

        }
        if(!found){
            System.out.println("Element given is does not exist in the array!");
        }
      sc.close();  
    }
}
