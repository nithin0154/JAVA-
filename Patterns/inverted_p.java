package Patterns;
import java.util.*;

public class inverted_p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
          System.out.println();  
        }






        sc.close();
    }
}
