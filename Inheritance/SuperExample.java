package Inheritance;

class Person {

    String name = "Parent";

    void display() {
        System.out.println("This is Person");
    }
}

class Student extends Person {

    String name = "Student";

    void displayNames() {

        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);

        super.display();
    }
}

public class SuperExample {

    public static void main(String[] args) {

        Student s = new Student();

        s.displayNames();
    }
}