package TRIES;

//This code assumes that all the input strings are in lower case and no othe characters

public class ClassRoom {
    static Node root = new Node();

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static void insertWord(Node curr, String str, int i) {
        if (i == str.length()) {
            curr.eow = true;
            return;
        }
        int idx = str.charAt(i) - 'a';
        if (curr.children[idx] == null) {
            Node c = new Node();
            curr.children[idx] = c;
            curr = c;
            insertWord(curr, str, i + 1);
        } else {
            curr = curr.children[idx];
            insertWord(curr, str, i + 1);
        }
    }
//Using the recursion
    public static boolean searchTrie(Node curr, String key, int i) {
        if (i == key.length() && curr.eow) {      
            return true;
        }
        int idx = key.charAt(i) - 'a';
        if (curr.children[idx] != null) {
            return searchTrie(curr.children[idx], key, i + 1);
        }
        return false;
    }
// using the iterative process 
    public static boolean search(String key){
        Node cr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i)-'a';
            if (cr.children[idx]==null) {
                return false;
            }
            cr = cr.children[idx];
        }
        return cr.eow == true;
    }

   public static boolean wordBreak(String key){
    if(key.length()==0){
        return true;
    }
    for (int j = 1; j <=key.length(); j++) {
        String sp = key.substring(0, j);
        if (search(sp) && wordBreak(key.substring(j))) {
            return true;
        }
    }
    return false;
   }
   public static void prefixProblem(String str){
      Node curr = root;
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < str.length(); i++) {
        int idx = str.charAt(i)-'a';
        sb.append(str.charAt(i));
        int count =0;
        curr = curr.children[idx];
        for (int j = 0; j < curr.children.length; j++) {
            if (curr.children[j]!=null) {
                count++;   
            }
            if (count>1) {
                break;
            }
        }
        if (count==1 || count==0) {
            System.out.print(sb+" ");
            sb.setLength(0);
            break;
        }
      }
   }

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any", "thee" };
        String[] samWords = {"i","like","sam","samsung","mobile","ice"};
        String[] kms = {"zebra","dog","duck","dove"};
        String[] test ={"apple","app"};
        for (int i = 0; i < test.length; i++) {
            insertWord(root, test[i], 0);
        }
        //Below calls are for searching operations:
        // System.out.println(searchTrie(root, "samsung", 0));
        // System.out.println(search( "dog"));
        
        //For WordBreak Problem
        // System.out.println(wordBreak("nithindasari"));
        for (int i = 0; i < test.length; i++) {
            prefixProblem( test[i]);
        }
    }
}
