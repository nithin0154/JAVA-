
import java.util.*;

public class al4 {
    public static ArrayList<Integer> mergeSortArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        System.out.println(list1);
        Collections.sort(list1);
        // ArrayList<Integer> newList = new ArrayList<>(list1);
        // int n = newList.size()-1;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-i; j++) {
                
            
        //     Integer temp =0;
        //     if(newList.get(j)>newList.get(j+1)){
        //         temp= newList.get(j);
        //         newList.set(j, newList.get(j+1));
        //         newList.set(j+1,temp);
        //     }
        // }
        // }
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of elements in list1:");
        System.out.print("Enter elements of list1:");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            list1.add(n);
        }
        System.out.print("Enter count of elements in list2:");
        System.out.print("Enter elements of list2:");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int n = sc.nextInt();
            list2.add(n);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mergeSortArrayList(list1, list2));
        sc.close();
    }
}
