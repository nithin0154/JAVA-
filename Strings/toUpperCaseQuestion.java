package Strings;

public class toUpperCaseQuestion {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                ch = Character.toUpperCase(str.charAt(i + 1));
                sb.append(ch);
                i++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        str = sb.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "hello, my name is nithin";
        System.out.println(toUpperCase(str));

    }

}