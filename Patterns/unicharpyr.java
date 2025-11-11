package Patterns;

public class unicharpyr {
   public static void main(String[] args) {
    int n=5;
    for (int i = 1; i < n; i++) {
        for (int j = 5; j >i ; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2*i-1); k++) {
            // System.out.print(k);1
            if(k==1||k==(2*i-1)){
                System.out.print("1");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for (int j= 1; j <=(2*n-1); j++) {
                System.out.print("1");
            }
   } 
}
