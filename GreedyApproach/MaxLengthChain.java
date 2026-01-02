package GreedyApproach;

import java.util.*;

public class MaxLengthChain {
    public static void main(String[] args) {
        int n = 5;
        int[][] values = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(values,Comparator.comparingDouble(o->o[1]));
        int lastSel =values[0][1];
        int counter =1;
        for (int i = 1; i < values.length; i++) {
            if (values[i][0]>lastSel) {
                counter++;
                lastSel = values[i][1];
            }
        }
        System.out.println(counter);
    }

}

// ArrayList<ArrayList> total = new ArrayList<>();
// int n = 5;
// Scanner sc = new Scanner(System.in);for(
// int i = 0;i<n;i++)
// {
// ArrayList<Integer> list = new ArrayList<>();
// for (int j = 0; j < 2; j++) {
// int k = sc.nextInt();
// list.add(k);
// }
// total.add(list);
// }System.out.println(total);
// int counter = 1;
// int finCount = 1;
// ArrayList<Integer> prev = total.get(0);for(
// int i = 1;i<total.size();i++)
// {
// ArrayList<Integer> curr = total.get(i);
// if (prev.get(1) <= curr.get(0)) {
// counter++;
// prev = curr;
// } else {
// finCount = Math.max(finCount, counter);
// counter = 1;
// prev = curr;
// }
// }finCount=Math.max(counter,finCount);sc.close();System.out.println(finCount);
