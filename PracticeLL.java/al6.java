
import java.util.*;

public class al6 {
    public static ArrayList<Integer> fIntegers(ArrayList<Integer> list) {
        int n = Collections.max(list);
        ArrayList<Integer> uniqArrayList = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            uniqArrayList.add(0);
        }
        System.out.println(uniqArrayList);
        for (int i = 0; i < list.size(); i++) {
            Integer m = list.get(i);
            Integer x= uniqArrayList.get(m);
                uniqArrayList.set(m, x+1);
            }
        
        return uniqArrayList;
    }
    public static ArrayList<Integer> kRotations(ArrayList<Integer> list,int k){
        int n = list.size();
        k = k%n;
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = n-k; i <n; i++) {
            newList.add(list.get(i));
        }
        for (int i = 0; i <n-k; i++) {
            newList.add(list.get(i));
        }
        return newList;
    }
    
    public static boolean isPalindrome(ArrayList<Integer> list) {
        int end = list.size() - 1;
        int start = 0;
        while (start <= end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static ArrayList<Integer> allZerostoEnd(ArrayList<Integer> list){
        ArrayList<Integer> uniqArrayList = new ArrayList<>();
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            Integer m = list.get(i);
            if(m!=0){
                uniqArrayList.add(m);
            }else{
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            uniqArrayList.add(0);
        }
        return uniqArrayList;
    }
    public static void pairsofSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i; j < list.size(); j++) {
                if((list.get(i)+list.get(j))==target){
                    System.out.println("("+ list.get(i)+","+list.get(j)+")");
                }
            }
        }
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter count of elements in list1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of list1:");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            list1.add(n);
        }
        System.out.println(list1);
        // System.out.println(kRotations(list1,2));
        // System.out.println(allpZerostoEnd(list1));
        pairsofSum(list1, 6);
        sc.close();
    }
}
