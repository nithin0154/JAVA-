package OOPS;

public class Practice {
    public static void main(String[] args) {
        // Vehicle v = new Car();
        // v.print1();                   //Causes error as vehicle V cannot understand Print1()


        Vehicle v1 = new Vehicle();
        v1.print();

        //Book
        System.out.println(Book.count);
        Book b1 = new Book(25);
        Book b2 = new Book(25);
        System.out.println(Book.count);
    }
}

class Vehicle{
    void print(){
        System.out.println("The base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("The derived class(Car)");
    }
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price= price;
        count++;
    }
}

