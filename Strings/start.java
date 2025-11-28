package Strings;

import java.util.Scanner;

public class start {
    public static void print(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // char array[]={'a','b','c'};
        String name = "Nithin";
        // String arr2 = new String("Nithin Dasari") ;
        // Scanner sc = new Scanner(System.in);
        // String name2 = sc.nextLine();
        // System.out.println(name);
        print(name);

    }
}
