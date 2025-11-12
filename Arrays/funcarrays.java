package Arrays;

public class funcarrays {
    public static void  addon(int marks[]){
        for (int i = 0; i < marks.length; i++) {
           marks[i]= marks[i]+2 ;
        }
    }
    public static void main(String[] args) {
      int marks[]= {21,22,23} ; 
      addon(marks);
      for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
      }
    }
}
