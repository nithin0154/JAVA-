package TwoDimArrays;


//Time complexity for below function is O(n^2)
public class diagonal {
    public static void sumOfDiagonals(int[][] matrix){
        int sumP=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j){
                    sumP+=matrix[i][j];
                }
               else if((i+j)==matrix.length-1){
                    sumP+=matrix[i][j];
                }
            }
            
        }
        System.out.println("The sum of both diagonals is:"+sumP);
    }

//Time complexity for below function is O(n)    
public static void optiSum(int[][] matrix){
    int sum=0;
    for (int i = 0; i < matrix.length; i++) {
        //Primary diag
        sum+=matrix[i][i];
        //Secndary diag
        if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-i-1];
        }  
    }
    System.out.println("The total sum of both diagonals:"+sum);
}

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}};
        sumOfDiagonals(matrix);
        optiSum(matrix);
    }
}
