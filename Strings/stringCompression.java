package Strings;

public class stringCompression {
    public static String compressor(String str) {
        StringBuilder sb= new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch); 
        int count=1;
        for (int i = 1; i < str.length(); i++) {
          if (ch!=(str.charAt(i))) {
            sb.append(count);
            ch=str.charAt(i);
            sb.append(ch);
            count=1;
          }else {
            count++;
          }
        }
        sb.append(count);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcddd";
        System.out.println(compressor(str));
        
    }
}
