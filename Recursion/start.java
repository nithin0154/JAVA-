package Recursion;

public class start {
    public static void print(int i,int n) {
        System.out.print(i+" ");
        if(n==i){
            return;
        }
        print(i+1, n);
    }
    public static void printAsc(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printAsc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n =10,i=1;
        // print(i,n);
        printAsc(n);
    }
}
