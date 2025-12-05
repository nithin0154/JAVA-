package OOPS;

public class polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum((float) 8.5, (float) 9.7));
        System.out.println(cal.sum(8, 9));
        System.out.println(cal.sum(8, (float) 9.9));
        System.out.println(cal.sum((float) 9.2, 3));

        //Over-riding
        Deer d1 = new Deer();
        d1.eat();
        d1.movement();

    }
}


//Example for OVER-LOADING CASE

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    float sum(float a, int b) {
        return a + b;
    }

    float sum(int a, float b) {
        return a + b;
    }

}
 
//EXAMPLE FOR OVER-RIDING CASE

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
    void movement(){
        System.out.println("Depends on the class of the animal");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grasss, leaves and fruits");
    }
    @Override
    void movement() {
       System.out.println("It walks on its four legs!");
    }
}