package Recursion;

public class tilingproblem {
    public static int countTileWays(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int verticalTiles = countTileWays(n-1);
        int horizantalTiles = countTileWays(n-2);
        return verticalTiles+horizantalTiles;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countTileWays(n));
    }
    
}