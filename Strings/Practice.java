package Strings;

public class Practice {
    public static int vowelCounter(String str) {
        StringBuilder sb = new StringBuilder(str);
        int count=0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a'|| ch=='i' || ch =='e' || ch =='o' || ch=='u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // String str = "My name is Nithin Dasari";
        // System.out.println("The total no of  lowercase vowels :"+vowelCounter(str));

        //Code2
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}
