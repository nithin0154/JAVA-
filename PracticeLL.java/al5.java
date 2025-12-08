
import java.util.*;

public class al5 {
    public static ArrayList<Integer> newIntegers(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer x= list1.get(i);
            if(list2.contains(x) && !newList.contains(x)){
                newList.add(x);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter count of elements in list1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of list1:");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            list1.add(n);
        }
        System.out.print("Enter count of elements in list2:");
        int b = sc.nextInt();
        System.out.println("Enter elements of list2:");
        for (int i = 0; i < b; i++) {
            int n = sc.nextInt();
            list2.add(n);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(newIntegers(list1, list2));
        sc.close();
    }
}
