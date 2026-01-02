package ArrayLists;

import java.util.ArrayList;

public class conwithMostWater {

    //The below function uses BRUTE FORCE APPORACH

    public static void finder(ArrayList<Integer> list) {
        Integer water_stored = 0;
        int m=0, n=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int width = j - i;
                int height = Math.min(list.get(i), list.get(j));
                int maxStore = width * height;
                if (water_stored < maxStore) {
                    water_stored = maxStore;
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println("Water stored amount:" + water_stored +"," +"with boundaries as "
                + list.get(n) + "," + list.get(m));
    }

    //The below function applies two pointer approch

    public static void twopointPrinter(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        int max_Water =0;
        while(i<j ){
            int width= j-i;
            int height = Math.min(list.get(i), list.get(j));
            int curr_water= width*height;
            max_Water = Math.max(max_Water, curr_water);
            if (list.get(i)<list.get(j)) {
                i++;
            }else if(list.get(i)>=list.get(j)){
                j--;
            }
        }
        System.out.println("The maximum a container can hold :"+max_Water);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        twopointPrinter(list);
        finder(list);
    }
}
