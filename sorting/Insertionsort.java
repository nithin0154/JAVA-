public class Insertionsort {

    public static void main(String[] args) {
         int arr[]={1,8,55,54,4541,2,0,5};
         for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            //Finding position to insert
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Inserting into the position
            arr[prev+1]=curr;
         }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
         }
    }
}