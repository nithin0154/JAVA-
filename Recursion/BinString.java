package Recursion;

public class BinString {
    public static void printBInaryStrings(int n,int lastplace,String sb){
        if(n==0){
            System.out.println(sb);
            return;
        }
        printBInaryStrings(n-1, 0, sb+"0");
        if (lastplace==0) {
            printBInaryStrings(n-1, 1, sb+"1");
        }
    }
    public static void main(String[] args) {
        printBInaryStrings(3, 0,"") ;
    }
}
