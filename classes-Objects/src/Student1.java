
class StudentDetails{
    String name;
    int age;
    String course;
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }
}


public class Student1{
    public static void main(String[] args){
        StudentDetails stu1=new StudentDetails();
        StudentDetails stu2=new StudentDetails();
        stu1.name="Revathi";
        stu1.age=22;
        stu1.course="AI&DS";
        stu1.displayDetails();
        stu2.name="Rahul";
        stu2.age=23;
        stu2.course="CSE";
        stu2.displayDetails();
    }
}



