package ArrayLists;

import java.util.ArrayList;

public class pairsum2 {
    public static void pairsum(ArrayList<Integer> list , int target){
        int bpoint =0;
        int k = list.size();
        for (int j2 = 0; j2 < k; j2++) {
            if(list.get(j2)>list.get(j2+1)){
                bpoint=j2;
                break;  
         }
        }
        int i = bpoint+1, j = bpoint;
        while (i!=j) {
            int n = list.get(i);
            int m = list.get(j);
            if(m+n==target){
                System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
            }
            if ((m + n) < target) {
                i = (i + 1) % k;
            } else {
                j = (k + j - 1) %k;
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = { 11,15,6,8,9,10};
        int target=16;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        pairsum(list, target);
    }
}
