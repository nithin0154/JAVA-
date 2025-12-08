
import java.util.*;

public class AL {
    public static ArrayList reverseArrayList(ArrayList list){
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            Integer m = (Integer)list.get(i);
            reversedList.add(m);
        }
        return reversedList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        System.out.println(reverseArrayList(list));
        sc.close();
    }
}
