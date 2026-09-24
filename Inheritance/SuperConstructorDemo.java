package Inheritance;

class Person {

    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }
}

class Student extends Person {

    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
        System.out.println("Student constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class SuperConstructorDemo {

    public static void main(String[] args) {

        Student s = new Student("Revathi", 101);

        s.display();
    }
}
