package TwoDimArrays;

import Arrays.funcarrays;

public class Practice {

    //Counter of a key
    public static void Counter(int[][] array){
        int key=7,count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(key==array[i][j]){
                    count++;
                }
            }
        }
        System.out.println("The total no of 7's in Arrays:"+count);
    }
   
    //Sum finder
    public static void SumFinder(int[][] matrix){
        int sum=0;
        for (int i = 1; i <=1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println("The sum of numbers in the 2nd row is :"+sum);
    }

    //Tranpose finder
    public static void transpose(int [][] matrix) {
        int temp[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][i]=matrix[i][j];
            //   System.out.print(matrix[i][j]+" ");
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int[][] array = { {4,7,8},{8,8,7} };
         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

         
        Counter(array);
        SumFinder(nums);
        transpose(array);
    }
}
