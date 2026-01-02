package ArrayLists;

import java.util.ArrayList;


public class pp2 {
    public static boolean isSafe(int x, ArrayList<Integer> list ) {
        if(list.contains(x) || list.contains(x-1) || list.contains(x+1)){
            return false;
        }
        return true;
    }
    public static ArrayList<Integer> isLonely(ArrayList<Integer> list ){
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i <= list.size()-1; i++) {
            int x = list.get(i);
            ArrayList<Integer> temp = new ArrayList<>(list);
            temp.remove(i);
            if (isSafe(x, temp)) {
                nums.add(x);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,3,5,3};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
       System.out.println(list);
       System.out.println(isLonely(list));
    }
}
