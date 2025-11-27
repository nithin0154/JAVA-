package TwoDimArrays;
import java.util.Scanner;

public class test {
    public static void search(int matrix[][], int key){
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
           if (matrix[i][j]==key) {
            System.out.println("Element found at index :"+"["+i+"]"+"["+j+"]");
            break;
           }
           } 
        }
        if(!found){
            System.out.println("Element not found in the matrix");
        }
    }
    public static int matrixMax(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               largest = Math.max(largest, matrix[i][j]) ;
            }
        }
        return largest;

    }
    public static int matrixMin(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               smallest = Math.min(smallest, matrix[i][j]) ;
            }
        }
        return smallest;

    }
    
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
            System.out.print("Enter the value for this element :"+"["+i+"]"+"["+j+"]"+":");
            matrix[i][j]=sc.nextInt();
           } 
        }
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j]+" ");
           } 
           System.out.println();
        }
        search(matrix, 25);
       System.out.println( matrixMax(matrix));
       System.out.println( matrixMin(matrix));
        sc.close();
    }
    
}