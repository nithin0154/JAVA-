package Patterns;

public class hourglasspat {
    public static void rombus() {
        int n=5;
        
          for (int i = n; i>=1; i--) {
           for (int j = n-1; j >=i; j--) {
            System.out.print(" ");
          } 
          for (int k = 1; k <=(2*i-1) ; k++) {
              System.out.print("*");
          }
          System.out.println();
        }
        for (int i = 2; i <=n; i++) {
          for (int j = i; j <n; j++) {
            System.out.print(" ");
          } 
          for (int k = 1; k <=(2*i-1) ; k++) {
              System.out.print("*");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        rombus();
    }
}
