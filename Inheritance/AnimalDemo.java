package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal eat Food");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("Mammal is Walking");
    }
}
class Dog extends mammal{
    void Bark(){
        System.out.println("Dog is Barking");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.Bark();
    }
}
