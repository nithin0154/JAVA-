package GreedyApproach;

import java.util.*;

public class jobsProfitMax {
    public static void main(String[] args) {
        int [][] jobs = {{1,2,100},{2,1,19},{3,2,27},{4,1,25},{5,3,15}};
        Arrays.sort(jobs, Comparator.comparingDouble((int[] o)-> o[2]).reversed());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            for (int j = 0; j < jobs[0].length; j++) {
               System.out.print(jobs[i][j]+" "); 
            }
            System.out.println();
        }
        list.add(jobs[0][0]);
        int time  =0;
        int deadline = jobs[0][1];
        for (int i = 1; i < jobs.length; i++) {
            if(deadline<=jobs[i][1]){
                deadline = jobs[i][1];
                list.add(jobs[i][0]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            char c = (char)(64+list.get(i));
            System.out.print(c+" ");
        }
    }
}
