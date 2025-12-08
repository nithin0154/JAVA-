import java.util.ArrayList;
import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,4,1,6));

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : list1) {
            if (!map.containsKey(x)){
                map.put(x, 1);
            }
        }
        System.out.println(map);

    }
    
}