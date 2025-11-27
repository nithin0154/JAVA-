package TwoDimArrays;

public class spiramatrix {
    public static void Spiral(int matrix[][]){
        int startCol=0;
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow= matrix.length-1;
        while (startRow<=endRow &&  startCol<= endCol) {
            
            //Top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
            }

            //Right
            for (int j = startRow+1; j <=endRow; j++) {
                System.out.print(matrix[j][endCol]+" ");
            }

            //Bottom
            for (int i = endCol-1; i >= startCol; i--) {
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }

            //Left
            for (int j =endRow-1 ; j >= startRow+1; j--) {
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }

            startCol++;
            endCol--;
            startRow++;
            endRow--;

        }
    }
  public static void main(String[] args) {
      int matrix[][]={{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}};
    Spiral(matrix);
  }
}
