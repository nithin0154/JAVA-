package Backtracking;
public class perms {

    public static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        boolean[] used = new boolean[256]; // ASCII characters

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (used[ch])
                continue; // skip duplicate choice
            used[ch] = true;

            String newStr = str.substring(0, j) + str.substring(j + 1);
            permutations(newStr, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "RRDD";
        permutations(str, "");
    }
}
