package TRIES;

// import java.util.*;

public class clsrm2 {
    static Node root = new Node();

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq = 0;
    }

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr.children[idx].freq++;
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, StringBuilder ans) {
        if (root == null)
            return;

        if (root.freq == 1) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 25; i>=0; i--) {
            if (root.children[i] != null) {
                ans.append((char) (i + 'a'));
                findPrefix(root.children[i], ans);
                ans.deleteCharAt(ans.length() - 1);
            }
        }
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] != null) {
                curr = curr.children[idx];
                continue;
            } else {
                return false;
            }

        }
        return true;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char)(i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // String[] test = { "apple", "app", "man", "woman","mango" };
        // Below lines are for LongestWord

        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        // Arrays.sort(words);
        for (String s : words) {
            insert(s);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

        // Below lines are unique substrings

        // String str = "ababa";
        // for (int i = 0; i < str.length(); i++) {
        // insert(str.substring(i));
        // }

        // System.out.println(countNodes(root));
        // findPrefix(root, new StringBuilder());
        // System.out.println();
        // System.out.println( startsWith("moon"));
        // System.out.println();
    }
}
