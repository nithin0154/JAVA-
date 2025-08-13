
import java.util.*;
public class problems_L1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(avg(10,12,13));
        System.out.println();
        System.out.println(areaofSquare(5));
        System.out.println();
        float i = sc.nextFloat();
        float j = sc.nextFloat();
        float k = sc.nextFloat();
        System.out.println("The total bill including the 18% GST is : "+bill(i,j,k));
        int $= 10;
        System.out.println($);
        sc.close();


        byte b = 4;
        char c = 'a';
        short s = 512;
        int m = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = ((f * b) + (m % c) - (d * s));
        System.out.println(result);

    }
    public static float avg(int a,int b,int c){
        int sum =a+b+c;
        float avg = sum/3;
        return avg;
    }
    public static float areaofSquare(float x){
        float area = x*x;
        return area;
    }
    public static float bill(float i,float j,float k){
        float sum = i+j+k;
        float gst = ((float)18/100)*sum;
        System.out.println(gst);
        return (sum+gst);
    }
}
