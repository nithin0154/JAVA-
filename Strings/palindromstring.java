package Strings;

public class palindromstring {
    public static boolean isPalindrome(String str) {
        int mid = str.length() / 2;
        int i = 0;
        int j = str.length() - 1;
        while (i <= mid) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // using string builder
    public static void ispalindrome(String str) {
        StringBuilder res = new StringBuilder(str);
        String reversed = res.reverse().toString();
        System.out.println(str.equals(reversed));
    }

    public static void main(String[] args) {
        String str = "nitin";
        ispalindrome(str);
    }
}
