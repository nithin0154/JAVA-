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
    public static boolean isPowerOfTwo(int num){
        return ((num & (num-1))==0)?true:false;
    }
    public static int countOfSetBitsf(int num){
        int count=0,i=0,temp=0;
        while (num!=0) {
            temp=getIthBit(num, i);
            System.out.println("TEMP:"+ temp);
            if(temp==1){
                count++;
            }
           num>>=1;  
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getIthBit(num, 0));
        System.out.println(setIthBit(num, 2));
        System.out.println(clearithBit(num, 2));
        System.out.println(clearLastInoOfBits(num, 2));
        System.out.println(isPowerOfTwo(num));
        System.out.println(countOfSetBitsf(num));
        sc.close();
    }
}
