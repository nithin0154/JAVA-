package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        Mustang m = new Mustang();
        Chicken c = new Chicken();
        System.out.println(m.color);
        h.eat();
        h.walk();
        h.setColor("Grey Hair");
        System.out.println(h.color);;
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    String color;
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
    Animal(){
        color= "brown";
        System.out.println("animal constructor fired");
    }
}

class Horse extends Animal{
    void setColor(String color){
        this.color= color;
    }
    void walk(){
        System.out.println("The horse runs and walks on four legs");
    }
    Horse(){
        System.out.println("Horse constructor firedd");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor firedd");
    }
}

class Chicken extends Animal{
    void setColor(String color) {
        this.color = color;
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
}