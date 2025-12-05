package OOPS;

public class Bank {
    public static void main(String[] args) {

        Student s1 = new Student("Mithilesh", 23);
        // System.out.println(s1.name+" "+s1.rollno);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.marks[2] = 888;
        System.out.println(s2.name + " " + s2.rollno);
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println();
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    int marks[];

    // This is the basic default constructor
    // This is non parametric
    Student() {
        marks = new int[3];
    }

    // Constructor with the parameters

    // With one
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }

    // With two parameters
    // The process of adding multiple types of constructors is called as---

    // CONSRUCTOR OVERLOADING (It is an example of Polymorphism)

    Student(String name, int rollno) {
        marks = new int[3];
        this.name = name;
        this.rollno = rollno;
    }

    // Shallow Copy constructor
    // Student(Student s){
    // marks = new int[3];
    // this.name = s.name;
    // this.rollno= s.rollno;
    // this.marks = s.marks;
    // }

    // Deep copy constructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.rollno = s.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}