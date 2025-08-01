import java.util.*;

public class app {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // System.out.println(name);
    
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    int r = sc.nextInt();
    // System.out.println(sum(a,b));
    // System.out.println(sub(a,b));
    // System.out.println(mul(a,b));
    // System.out.println(div(a,b));
    System.out.println(areaOfCircle(r));

    sc.close();
    }

    public static int sum(int a, int b){
        
      int sum= a+b;
        return sum;
    }
    public static int sub(int a,int b){
        int sub =a-b;
        return sub;
    }
    public static int mul(int a,int b){
        int mul =a*b;
        return mul;
    }
    public static int div(int a,int b){
        int div =a/b;
        return div;
    }
    public static float areaOfCircle(int r){
        float area = 3.14f * r * r;
        return area;
    }
    
}

