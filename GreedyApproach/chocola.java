package GreedyApproach;

import java.util.*;

public class chocola {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        Integer[] vCuts = { 4, 1, 2};
        Integer[] hCuts = { 2,1,3,1,4};
        ArrayList<Integer> list = new ArrayList<>();
        int hps= 1, vps= 1;
        int i=0,j=0;
        int Totalcost = 0;
        int incount = 1;
        int outcount = 1;
        Arrays.sort(vCuts,Collections.reverseOrder());
        Arrays.sort(hCuts,Collections.reverseOrder());
        while (i<vCuts.length && j< hCuts.length) {
            // int currCut = Math.max(vCuts[i], hCuts[j]);
            if(vCuts[i]>= hCuts[j]){
            list.add(vCuts[i]);
            Totalcost+=vCuts[i]*hps;
            vps++;
            i++;
            }else{
                list.add(hCuts[j]);
                Totalcost += hCuts[j] * vps;
                hps++;
                j++;
            }

        }
        while (i<vCuts.length) {
            list.add(vCuts[i]);
            Totalcost += vCuts[i] * hps;
            vps++;
            i++; 
        }
        while (j<hCuts.length) {
            list.add(hCuts[j]);
            Totalcost += hCuts[j] * vps;
            hps++;
            j++;
        }
        System.out.println("the minimal cost "+Totalcost);
        System.out.println("the order is :"+list);
    }
}
