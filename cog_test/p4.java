package cog_test;

import java.util.Scanner;
import java.util.Stack;

public class p4 {
    static boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        int n = s.length();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                store.push(c);
            } else {
                if (store.isEmpty())
                    return false;

                char top = store.peek();

                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
                if (c == ')' && top != '(')
                    return false;
                store.pop();
            }
           
        }
        return store.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = isValid(s);
        if (ans) {
            System.out.println("The string is valid");
        } else {
            System.out.println("The string is not valid");
        }

        sc.close();
    }
}
