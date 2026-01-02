package GreedyApproach;
import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = { 100};
        int[] weight = {20};
        int W = 10;
        
        //Edge case
        if (W == 0) {
            System.out.println("Maximum value is :" + 0);
            return;
        }

        int weights[][] = new int[value.length][3];
        for (int i = 0; i < value.length; i++) {
            weights[i][0] = i;
            weights[i][1] = weight[i];
            weights[i][2] = value[i];
        }
        Arrays.sort(weights,
            Comparator.comparingDouble((int[]o)->(double)o[2]/o[1]).reversed());
            for (int j = 0; j < weights.length; j++) {
                for (int j2 = 0; j2 < weights[0].length; j2++) {
                    System.out.print(weights[j][j2]+" ");
                }
                System.out.println();
            }
        //Greedy approach starts 
        int Max =0;
        int currentWeight =0;
        int  i=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < weights.length; i++) {
            currentWeight += weights[i][1];
            if(currentWeight<=W){
                Max += weights[i][2];
                list.add(weights[i][0]);
            }
            if (currentWeight>=W) {
                currentWeight = currentWeight -weights[i][1];
                break;
            }
        }
        System.out.println(i);
        System.out.println(currentWeight);
        if (i<weights.length && W > currentWeight) {
            int reqWeight = W - currentWeight;
            Max +=((double)weights[i][2] / weights[i][1]) * reqWeight;
        }
        System.out.println("Maximum value is :"+Max); 
    }
}

