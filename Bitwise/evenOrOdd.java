import java.util.Scanner;

public class evenOrOdd {
public static void isOddEven(int num){
    int i =1 & num;
    if(i==1){
        System.out.println("The number is odd");
    }else{
        System.out.println("the number is even");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isOddEven(num);
        sc.close();
}}