package Patterns;

public class pmulti {
    public static void num(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void mulnum(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void revmulnum() {
       for (int i = 5; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j);
        }
        System.out.println();
       } 
    }
    public static void spacenumpyr() {
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
             for (int k = 1; k<=i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void proppyr() {
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
             for (int k = 1; k<=(2*i-1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void rombus() {
        int n=5;
        for (int i = 1; i <=n; i++) {
          for (int j = i; j <n; j++) {
            System.out.print(" ");
          } 
          for (int k = 1; k <=(2*i-1) ; k++) {
              System.out.print("*");
          }
          System.out.println();
        }
          for (int i = n-1; i>=1; i--) {
           for (int j = n-1; j >=i; j--) {
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
