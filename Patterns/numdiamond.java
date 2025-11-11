package Patterns;

public class numdiamond {
    public static void main(String[] args) {
        int n=69;
        for (int i = 65; i <=n; i++) {
           for (int j = i; j <n ; j++) {
            System.out.print(" ");
           } 
           int temp=0;
           for (int k = 65; k <=(2*i-1); k++) {
            if(k<=((2*i)/2)){
                System.out.print((char)k);
                temp=k;
            }
           }
           for (int m = temp-1; m >=65; m--) {
                System.out.print((char)m);
            }
           System.out.println();
        }
        for (int i = n-1; i>=1; i--) {
           for (int j = n; j >i ; j--) {
            System.out.print(" ");
           } 
           int temp=0;
           for (int k = 65; k <=(2*i-1); k++) {
            if(k<=((2*i)/2)){
                System.out.print((char)k);
                temp=k;
            }
           }
           for (int m = temp-1; m >=65; m--) {
                System.out.print((char)m);
            }
           System.out.println();
        }
        
    }
}
