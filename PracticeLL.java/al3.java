
import java.util.*;

public class al3 {
    public static ArrayList<Integer> noDuplicateList(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer m = list.get(i);
            if (!newList.contains(m)) {
                newList.add(m);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        System.out.println(noDuplicateList(list));
        sc.close();
    }
}
