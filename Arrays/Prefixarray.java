package Arrays;

public class Prefixarray {
    public static void maxSubArray(int arr[]){
        int prefix[]=new int[arr.length];
        int max_index=0,min_index=0;
        int currSum=0;
        int maxSum=0;
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=arr[i]+prefix[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
           for (int j = i; j < arr.length; j++) {
            currSum=i==0?prefix[j]: prefix[j]-prefix[i-1];
            System.out.println(currSum);
            if(currSum>maxSum){
                maxSum=currSum;
                max_index=j;
                min_index=i; 
            }
           } 
        }
        System.out.println("The max sum is:"+maxSum);
        System.out.print("The sub array with max Sum is : ");
        for (int i = min_index; i <max_index; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        maxSubArray(numbers);
    }
}
