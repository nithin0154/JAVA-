package Backtracking;
import java.util.Scanner;

public class pp2 {
    static char[][] digits={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
                            {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                            {'t','u','v'},{'w','x','y','z'}};
    public static void mapper(String str, int n){
        if(str.length()==0){
            System.out.println("");
            return;
        }
        printer(0,n,new StringBuilder(),str);
        
    }
    public static void printer(int pos, int n , StringBuilder sb, String str ) {
        if(pos==n){
            System.out.println(sb.toString());
        }else{
            char[] letters=digits[Character.getNumericValue(str.charAt(pos))];
           for (int i = 0; i < letters.length; i++) {
               printer(pos + 1, n, new StringBuilder(sb).append(letters[i]), str);
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        mapper(str,n);
        sc.close();
    }
}
