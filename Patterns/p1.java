package Patterns;
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i<=count ; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
