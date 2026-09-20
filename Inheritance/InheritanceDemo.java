package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal eat Food");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog is Barking");
    }
}
public class InheritanceDemo {
    public static void main(String[] args){
        Dog d=new Dog();
        d.Bark();
        d.eat();
    }
    
}
