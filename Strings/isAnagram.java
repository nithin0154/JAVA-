package Strings;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "mana";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a anagram");
        }
    }
}
