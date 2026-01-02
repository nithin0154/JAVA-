package GreedyApproach;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("The value of N :");
        int[] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9 };

        //Sorting according to the end time if not given in the problem
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //Sorting using lamba function
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        //Greedy approach
        ArrayList<Integer> list = new ArrayList<>();
        int notAvilableTill =0;
        
        for (int i = 0; i < start.length; i++) {
            if (activities[i][1] >= notAvilableTill) {
                list.add(activities[i][0]);
                notAvilableTill =activities[i][2];
            }
        }
        int size = list.size();
        System.out.println("Max Activities:"+size);
        for (int i = 0; i < size; i++) {
            System.out.print("A"+list.get(i)+" ");
        }
    }
}
