
public class f1 {
    public static void printFn(){
        System.out.println("Hello, World!");
    }
    public static int sum(int a ,int b){
        return a+b;
    }
     public static int multiply(int a ,int b){
        System.out.println("Multiplied value is: "+a*b);
        return 0;
    }
    public static int factorial (int a){
        if(a==0){
            return 1;
        }else{ 
            int start =1;
            for (int i = 1; i <= a; i++) {
            start = start*i;
            
        }
        return start;
        }
    }
    public static void main(String[] args) {
      printFn();
      System.out.println(sum(66,3));
      multiply(5, 56);
     System.out.println( factorial(5));;
} 
}