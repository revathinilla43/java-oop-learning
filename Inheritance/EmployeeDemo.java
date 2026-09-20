// Hierarchical Inheritance Example

package Inheritance;

class Employee{
    String name;
   double salary;
   void displayEmployee(){
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
   }
}
class Developer extends Employee{
    String language;
    void displayLanguage(){
        System.out.println("Programming Language:"+language);
    }
}
class manager extends Employee{
    String department;
    void displayDepartment(){
        System.out.println("Department: "+department);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "John";
        d.salary = 50000;
        d.language = "Java";
        manager m = new manager();
        m.name = "Alice";
        m.salary = 60000;
        m.department = "IT";
        d.displayEmployee();
        d.displayLanguage();
        m.displayEmployee();
        m.displayDepartment();
    }
}
