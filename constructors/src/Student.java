package src;

class Classroom{
    int age;
    String name;
    String course;
    Classroom() {
        name = "Unknown";
        age = 0;
        course = "Not specified";
    }

    Classroom(int a,String n,String c){
        age=a;//without this keyword
       this.name=n;//with this keyword
       this.course=c;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
 }
 public class Student{
    
    public static void main(String[] args) {
        Classroom c1=new Classroom(22,"Revathi","Java");
        Classroom c2=new Classroom(23,"Rahul","Python");
        Classroom c3=new Classroom();
        c1.Display();
        c2.Display();
        c3.Display();
    }
 }

 //default and parameterized constructor
 /*Default constructor

A constructor with no parameters:
Student() {
    name = "Unknown";
    age = 0;
}*/
/*Parameterized constructor

A constructor with parameters
 Student(String name, int age) {
    this.name = name;
    this.age = age;
}
*/