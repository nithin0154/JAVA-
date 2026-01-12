package Trees;

public class proble {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int temp=0,k=0;
        while(x>0){
            k=x%10;
            temp+=k*10;
            x=x/10;
        }
        System.out.println(temp);
        if (x==temp) {
            System.out.println(temp);
            return true;
        }
        return false;
    }
  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
    
}