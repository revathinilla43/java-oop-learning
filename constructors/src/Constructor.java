package src;
//A constructor is a special block of code that runs automatically when you create an object.
class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor{

    public static void main(String[] args) {

        Student s1 = new Student("Revathi", 22);
        Student s2 = new Student("Rahul", 23);

        s1.display();
        s2.display();
    }
}