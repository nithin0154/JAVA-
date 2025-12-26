package Recursion;

public class Practice {
    static String[] digits ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printOccurence(int[] arr, int key,int  i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printOccurence(arr, key, i+1);
    }
    public static void printNum(int num){
       if(num==0){
        return;
       }
       int lastdigit = num%10;
       printNum(num/10);
       System.out.print(digits[lastdigit]+" ");
    }
    public static int lengthOfString(String str,String str2,int count){
        if(str.equals(str2)){
            return count;
        }
        
        str2 = str2+str.charAt(count);
        return lengthOfString(str,str2, count+1);
      
    }
    public static void main(String[] args) {
        int[] arr= {3,2,4,5,6,2,7,2,2};
        printNum(2019);
        // System.out.println(lengthOfString("Nithin", "", 0));
    }
}
