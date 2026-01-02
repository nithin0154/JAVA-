package ArrayLists;

import java.util.ArrayList;


public class pairsum {

    //Brute force
    public static void pairSumBrute(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==target){
                    System.out.println("("+list.get(i)+","+list.get(j)+")");
                }
            }
        }
    }
    public static void pairsumTwoP(ArrayList<Integer>list, int target){
        int i =0;
        int j = list.size()-1;
        while (i!=j) {
            int m = list.get(i);
            int n = list.get(j);
            if (m+n==target) {
                System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
            }
            if (m+n<target) {
                i++;
            }
            else {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6 };
        int target=5;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        pairSumBrute(list, target);
        System.out.println("-------------");
        pairsumTwoP(list, target);
    }
}
