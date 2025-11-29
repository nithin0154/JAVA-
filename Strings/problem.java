package Strings;

public class problem {
    public static void shortestPath(String str) {
        int i = 0, j = 0;
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'N') {
                j++;
            } else if (str.charAt(k) == 'S') {
                j--;
            } else if (str.charAt(k) == 'E') {
                i++;
            } else if (str.charAt(k) == 'W') {
                i--;
            }
        }
        float distance = (float) Math.sqrt((j*j)+(i*i));
        System.out.println("The shortest path is :"+ distance);
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        shortestPath(direction);
    }
}
