package Backtracking;
public class subsets {
    static int count =0;
    public static void printSubset(String str,String ans,int i) {
        if(i==str.length()){
            count++;
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //YES choice
        printSubset(str,ans+str.charAt(i), i+1);
        //No choice
        printSubset(str, ans, i+1);

    }
   public static void main(String[] args) {
     String str  = "ababaaa";
     printSubset(str,"",0);
     System.out.println("The total no of subsets:"+count);
   } 
}
