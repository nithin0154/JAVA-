package Arrays;

public class subarrays {
    static int currentIndex=0;
    public static void addValue(int s[],int n){
     
        if(currentIndex<s.length){
            s[currentIndex]=n;
            currentIndex++;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sumstore[]=new int[15];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i; j <arr.length; j++) {
                System.out.print("[");
                int sum=0;
                for (int k = i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    System.out.print("{"+sum+"}");
                }
                addValue(sumstore,sum);
                count++;
                System.out.print("],");
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+count);
        System.out.println("**************");
        for (int i = 0; i < sumstore.length; i++) {
            System.out.print(sumstore[i]+" ");
        }
       int min= sumstore[0],max= sumstore[0];
       for (int i = 0; i < sumstore.length; i++) {
        if(min>sumstore[i]){
            min=sumstore[i];
        } if(max<sumstore[i]){
            max=sumstore[i];
        }
       }
       System.out.println();
       System.out.println("The minimum and maximum of sum of subarrays :"+ min+","+max);
    }
}
