public class bubblesort {
 public static void main(String[] args) {
    // int arr []={1,5,8,9,7,10};
    int arr[]={1,2,3,4,5};
    int tep= 0;
    for (int i = 0; i < arr.length-1; i++) {
        int swap=0;
                System.out.println("runned outer");

        for (int j = 0; j < arr.length-i-1; j++) {
            if (arr[j]>arr[j+1]) {
                tep=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tep;
                swap++;
                System.out.println("runned inner");
            }
        }
        if (swap==0) {
            System.out.println("already sorted arrray!");
            break;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
    }
 }   
}
