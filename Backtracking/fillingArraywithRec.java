package Backtracking;

public class fillingArraywithRec {
    public static void filler(int[] arr, int i) {
        if(i==arr.length){
            printArray(arr);
            return ;
        }
        arr[i]=i+1;
        filler(arr, i+1);
        arr[i]=arr[i]-2;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
       int[] arr = new int[5];
       filler(arr, 0);
       printArray(arr);
   }
}
