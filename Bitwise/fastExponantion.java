import java.util.Scanner;

public class fastExponantion {
    public static int powerOf(int num ,int power){
        int ans=1;
        while (power>0) {
            if((power&1)!=0){
                ans=ans*num;
            }
            num=num*num;
            power=power>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power =sc.nextInt();
        System.out.println(powerOf(num,power));
        sc.close();
    }
}
