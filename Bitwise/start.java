import java.util.Scanner;

public class start {
    public static int getIthBit(int num,int pos){
        return ((num&(1<<pos))!=0)?1:0;
    }
    public static int setIthBit(int num ,int pos){
        return (num|(1<<pos));
    }
    public static int clearithBit(int num , int pos){
        return (num & ~(1<<pos));
    }
    public static int updateIthBit(int num ,int pos, int newBit) {
        if(newBit==0){
            return clearithBit(num, pos);
        }else{
            return setIthBit(num, pos);
        }
    }
    public static int clearLastInoOfBits(int num, int pos){
        return (num & (-1<<pos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getIthBit(num, 2));
        System.out.println(setIthBit(num, 2));
        System.out.println(clearithBit(num, 2));
        System.out.println(clearLastInoOfBits(num, 2));

    }
}
