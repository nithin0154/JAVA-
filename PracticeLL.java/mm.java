import java.util.*;
public class mm {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeioueAIEOU]", "");
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            System.out.println("aeiouAEIOU".indexOf(c));
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String largestString(String str) {
        String arr[] = str.split(" ");
        for (String m : arr) {
            System.out.println(m);
        }
        System.out.println(arr.length);
        String max = "";
        for (String s : arr) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        return max;
    }
    public static String swapCaseString(String str){
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c)){sb.append(Character.toLowerCase(c));

            }else{
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
    public static boolean isAnagram(String str1, String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1, s2);
    }
    
    public static String removeDupStr(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.add(c))
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "My name is Nithin Dasari";
        String str2 = "My name is Nithin Dasari";
        // String str1 = "racecar";
        // String str2 = "carrace";

        // System.out.println(removeVowels(str));
        // System.out.println(largestString(str1));
        // System.out.println(isAnagram(str1, str2));
        // System.out.println(countVowels(str));
        // System.out.println(swapCaseString(str1));
        System.out.println(removeDupStr(str1));

    }
}
