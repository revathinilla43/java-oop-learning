package Inheritance;

class Vehicle{
 void start(){
       System.out.println("Vehicle is starting"); 
 }
}
class car extends Vehicle{ 
    @Override 
    void start(){
        System.out.println("Car is starting");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
 
