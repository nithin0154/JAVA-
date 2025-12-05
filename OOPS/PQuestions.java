package OOPS;

public class PQuestions {
    public static void main(String[] args) {
        Complex c1 = new Complex(12, 2);
        Complex c2 = new Complex(1, 3);
        Complex c3 = new Complex(0, 0);
        c3 =  Complex.sub(c1, c2);
        c3.printComplex();
    }
}

class Complex{
   int real ;
   int img;
   public Complex(int r ,int i ){
    real = r;
    img = i;
   }
   public static Complex sum(Complex a, Complex b){
    return new Complex((a.real+b.real), (a.img+b.img));
   }

   public static Complex sub(Complex a, Complex b) {
       return new Complex((a.real - b.real), (a.img - b.img));
   }

   public Complex product(Complex a, Complex b) {
       return new Complex(((a.real*b.real)-(a.img*b.img)), ((a.real*b.img)+(a.img*b.real)));
   }
   public void printComplex(){
    if(real==0 && img!=0){
        System.out.println(img+"i");
    }else if (real!=0 && img==0) {
        System.out.println(real);
    }else{
        System.out.println(real+"+"+img + "i");
    }
   }
}