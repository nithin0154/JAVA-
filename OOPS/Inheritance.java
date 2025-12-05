package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.swim();
        // shark.eat();
        // shark.breathe();
        Dog Shitzu = new Dog("Shitzu",4) ;
        System.out.println(Shitzu.getLegs());
       System.out.println( Shitzu.getBreed());
    }
}

class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}

class Mammal  extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("flies");
    }
}

class Dog extends Mammal{
    String breed;
    Dog(String breed,int legs){
        this.breed=breed; 
        this.legs= legs;
    }
    String getBreed() {
        return breed;
    }
    int getLegs() {
        return legs;
    }
}