import java.util.Scanner;

public class even {
 public static boolean even(int num){
  return (num%2==0);
 } 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a numbe to check");
            int num = sc.nextInt();
            boolean res = even(num);
            if (res) {
               System.out.println("Number is even"); 
            } else {
                               System.out.println("Number is ODD"); 
            }
            sc.close();
    }
}
