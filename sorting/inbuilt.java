import java.util.*;


public class inbuilt {
    public static void main(String[] args) {
       Integer arr[]={56,85,5,201,2,154,144,1,2,5,4,5,3,85} ;
       Arrays.sort(arr,Collections.reverseOrder());
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
}
