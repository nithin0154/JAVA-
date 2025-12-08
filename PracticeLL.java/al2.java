
import java.util.*;

public class al2 {
    public static Integer secondLargestOfList(ArrayList<Integer> list) {
        // ArrayList<Integer> reversedList = new ArrayList<>();
        Integer largest =Integer.MIN_VALUE;
        Integer secLarg = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Integer m = list.get(i);
            if(m>largest){
                secLarg=largest;
                largest=m;
            }
            else if(m<largest && m>secLarg){
                secLarg=m;
            }
        }
        return secLarg;
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
        System.out.println(secondLargestOfList(list));
        sc.close();
    }
}
