import java.util.Scanner;

public class sumOfDigits {
    public static int sum(int num){
        int sum =0,res=0;
        while (num!=0) {
            res= num%10;
            sum= sum+res;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The sum of all digits in "+num+" = "+sum(num));
        sc.close();
    }
}
