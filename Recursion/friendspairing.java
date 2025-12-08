package Recursion;

public class friendspairing {
    public static int nofWays(int n){
        if(n==1||n==2){
            return n;
        }
        return nofWays(n-1)+(n-1)*nofWays(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(nofWays(n));
    }
}
