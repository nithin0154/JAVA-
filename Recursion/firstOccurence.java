package Recursion;

public class firstOccurence {
    public static int firstOccurenceAt(int i , int[] arr, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurenceAt(i+1, arr, key);
    }
    
    public static int lastOccurenceAtOne(int i, int[] arr, int key) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurenceAtOne(i - 1, arr, key);
    }
    

    public static void main(String[] args) {
        int [] arr ={1,12,5,85,14,12};
        int key =12;
        System.out.println(firstOccurenceAt(0, arr, key));
        System.out.println(lastOccurenceAtOne(arr.length-1, arr, key));

    }
}
