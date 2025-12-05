package Recursion;

public class powerOfn {
    public static int valueofPower(int base, int power) {
        if (power == 1)
            return base;
        return base * valueofPower(base, power - 1);
    }
    public static int optimizedPower(int a,int x){
        if(x==0){
            return 1;
        }
        int halfSquare = optimizedPower(a, x/2);
        halfSquare=halfSquare*halfSquare;
        if(x%2!=0){
            halfSquare=halfSquare*a;
        }
        return halfSquare;
    }

    public static void main(String[] args) {
        int base = 2, power = 2;
        System.out.println(valueofPower(base, power));
        System.out.println(optimizedPower(base, power));
    }
}
