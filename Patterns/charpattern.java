package Patterns;
import java.util.*;

public class charpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valn = sc.nextInt();
        char val ='A';
        System.err.println("-------------------------");
        for (int i = 1; i <= valn; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print(val+" ");
                val++;
            }
          System.out.println();  
        }
        System.err.println("-------------------------");
        sc.close();
    }
}
