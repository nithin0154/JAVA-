public class typepromote {
    public static void main(String[] args) {
        byte a = 10;
        char b='b';
        byte c=12;
        byte bt = (byte)(a+ b+c);//Gives the error as "possible lossy conversion from int to byte"
                        // Even though there is no int type variable present 
                        //It is happend because the compiler automatically converts  
                        //byte,char,short to int when evaluating the expression
        System.out.println(bt);


        //and second type of promotion

        int i=10;
        float j=3.24f;
        double k = 20.4;
        double db = (i+j+k);
        System.out.println(db);
    }
}
