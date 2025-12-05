package Recursion;

public class clumsy {
    public static int clumsy(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 6;
        if (n == 4)
            return 7;
        return n*(n-1)/(n-2)+(n-3)-clumsy(n-4);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(clumsy(n));
    }
}
