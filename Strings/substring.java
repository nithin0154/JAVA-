package Strings;

public class substring {
    // public static String substring(String str , int si , int ei) {
    // String temp = "";
    // for (int i = si; i < ei; i++) {
    // temp += str.charAt(i);
    // }
    // return temp;
    // }
    public static void main(String[] args) {
        String str = "Hello,world!";
        // System.out.println(str.substring( 0, 5));
        String[] fruits = { "apple", "banana", "mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(str) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
