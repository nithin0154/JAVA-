package Recursion;

public class toRemoveDups {

    public static void nodups(int i,StringBuilder sb,boolean[] map,String str){
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a']==true){
            nodups(i+1, sb, map, str);
        }else{
            map[currChar-'a']=true;
            nodups(i+1, sb.append(currChar), map, str);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        StringBuilder sb = new StringBuilder();
        boolean [] map= new boolean[26];
        int i=0;
        nodups(i, sb, map, str);

    }
}
