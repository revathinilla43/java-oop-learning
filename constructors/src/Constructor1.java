//constructor overloading
//constructor overloading because we have multiple constructors with the same name but different parameter lists
package src;

 class Student1 {
    String name;
    int age;
   String course;
   Student1(){
    name="unknown";
    age=0;
    course="not specified";
   }
   Student1(String name, int age, String course){
    this.name=name;
    this.age=age;
    this.course=course;
   }
   Student1(String name,int age){
    this.name=name;
    this.age=age;
    this.course="not specified";
   }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class Constructor1 {
    public static void main(String[] args) {
    Student1 s1=new Student1();
    Student1 s2=new Student1("Revathi",18,"Aids");
    Student1 s3=new Student1("Rahul",19);
    s1.display();
    s2.display();
    s3.display();
}
}