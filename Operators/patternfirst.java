public class patternfirst {
    public static void main(String[] args) {
        p1();
        System.out.println();
        p2();
    }
    public static void p1(){
        for(int i =1 ;i<=5;i++){
            for(int j=6-i;j>=1;j-- ){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void p2(){
        for(int i =1 ;i<=5;i++){
            for(int j=i;j>=1;j-- ){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
