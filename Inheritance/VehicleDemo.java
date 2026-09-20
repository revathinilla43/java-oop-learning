package Inheritance;

class Vehicle{
    void start(){
        System.out.println("vehicle is strating");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is Driving");
    }
}
public class VehicleDemo {
    public static void main(String[] args){
        Car c=new Car();
        c.drive();
        c.start();
    }
    
}
