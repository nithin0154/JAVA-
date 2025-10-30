package Loops;
import java.util.*;

public class factorial {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
System.out.println("Enter the value :");
    int value = sc.nextInt();
    int factorial =1;
   if(value==0){
    factorial=1;
   }else if(value<0){
   System.out.println("The factorial for negative doesn't exist");
   
   }
   else{
    for (int i =value; i >=1; i--) {
        factorial*=i;
    }
   }
    if(value>=0){
         System.out.println("The factorial of "+value+" is : "+factorial);
    }
     sc.close();
  }

}
