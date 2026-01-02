package ArrayLists;

import java.util.ArrayList;

public class pp1 {
    public static boolean isMonotonic(ArrayList<Integer> list){
    
        boolean counterAsc =true;
        boolean counterDesc =true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
                counterAsc= false;
            }
            if (list.get(i) < list.get(i + 1)) {
                counterDesc= false;
            }
        }
    
        return counterAsc || counterDesc;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,2,3};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(isMonotonic(list));;
    }
}
