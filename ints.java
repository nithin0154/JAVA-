import java.util.*;

public class ints {
    public static void main(String[] args) {
        float evenSum =0;
        float oddSum =0;
        System.out.println("Enter the value of the array size :");
        Scanner sc = new Scanner(System.in);
        int count  = sc.nextInt();
        System.out.println("Enter "+count+" Integers :");
        for (int i = 0; i < count; i++) {
            int num=  sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
        }
        System.out.println("The even sum is : "+evenSum);
        System.out.println("The even sum is : "+oddSum);

     sc.close();
;    }
}
