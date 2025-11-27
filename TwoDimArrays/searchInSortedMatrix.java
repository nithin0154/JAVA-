package TwoDimArrays;
public class searchInSortedMatrix {
    public static void find(int[][] matrix,int key){
        int i=0;
        int j=matrix[0].length-1;
       while (i<matrix.length && j>=0) {
        if(key==matrix[i][j]){
          System.out.println("the element found at: ("+i+","+j+")");
          return;
          
        }else if (key<matrix[i][j]) {
            j--;
        }else if(key>matrix[i][j]){
            i++;
        }
       }
       System.out.println("The key you're trying to find does'nt exist in the matrix!");
       
    }
    public static void find2(int[][] matrix,int key){
        int i=matrix.length-1;
        int j=0;
       while (i>=0 && j<matrix.length) {
        if(key==matrix[i][j]){
          System.out.println("the element found at: ("+i+","+j+")");
          return;
          
        }else if (key<matrix[i][j]) {
            i--;
        }else if(key>matrix[i][j]){
            j++;
        }
       }
       System.out.println("The key you're trying to find does'nt exist in the matrix!");
       
    }
    public static void main(String[] args) {
        int matrix[][]= {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        find2(matrix, 33);
    }
    
}
