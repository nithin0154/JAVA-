package ytproblemsofRaja;

public class p2 {
    public static void rotatedArrayRight(int[] arr,int k){
        int n  = arr.length;
        int[] temp= new int[n]; int j=0;
        k = k%n;
        for (int i = n-k; i < arr.length; i++) {
            temp[j]=arr[i];
            j++;
        }
        for (int i = 0; i < n-k; i++) {
            temp[j]=arr[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[i];
        }
         
    }
    
    public static void rotatedArrayLeft(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        k = k % n;
        for (int i =  k; i < arr.length; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

    }
  public static void main(String[] args) {
    int [] arr = {1,2,3};
    int  k = 2;
    // rotatedArrayRight(arr, k);
    rotatedArrayLeft(arr, k);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}