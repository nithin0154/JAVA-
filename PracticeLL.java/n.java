import java.util.*;



public class n {
 public static void main(String[] args) {
    String str = "apnaaacollege";
    char[] chars = str.toCharArray();
    
    LinkedHashSet<Character> mist = new LinkedHashSet<>();
    for (char c : chars) {
        mist.add(c);
    }
    mist.toString();
    System.out.println(mist);
 }   
}
