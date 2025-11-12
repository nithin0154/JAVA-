package Arrays;

public class bruteforcemax {
    static int currentIndex=0;
    public static void addValue(int s[],int n){     
        if(currentIndex<s.length){
            s[currentIndex]=n;
            currentIndex++;
        }     
    }
    public static int maxFinder(int s[],int ind){
        int min= s[0],max= s[0];
       for (int i = 0; i < s.length; i++) {
       if(max<s[i]){
            max=s[i];
            ind=i;
        }
       }
       System.out.println();
       System.out.println("The minimum and maximum of sum of subarrays :"+ min+","+max);
       return ind;
    }
    public static void maxSubArray(int arr[], int max){
        int count=0;
        System.out.print("[");
         for (int i = 0; i < arr.length; i++) {
            for (int j =i; j <arr.length; j++) {
                
               if (count==max) {
                 for (int k = i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
               }
                count++;
            }
        }
        System.out.print("]");

    }
    public static void subarrays(int arr[],int count, int sumstore[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i; j <arr.length; j++) {
                System.out.print("[");
                int sum=0;
                for (int k = i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                addValue(sumstore,sum);
                count++;
                System.out.print("],");
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int max_index=0;
        int sumstore[]=new int[15];
        int count=0;
        subarrays(arr, count,sumstore);
        System.out.println("**************");
        for (int i = 0; i < sumstore.length; i++) {
            System.out.print(sumstore[i]+" ");
        }
      int value=maxFinder(sumstore,max_index);
      System.out.println("**********************");
      maxSubArray(arr, value);

    }
   
}
