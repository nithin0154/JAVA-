package ArrayLists;

import java.util.ArrayList;

public class s2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        mainlist.add(list3);
        System.out.println(mainlist);
        for (ArrayList l : mainlist) {
            System.out.println(l.get(0));
            System.out.println(l.get(1));
        }
    }
}
