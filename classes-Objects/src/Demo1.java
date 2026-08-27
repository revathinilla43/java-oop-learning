
import java.util.Scanner;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int divide(int a,int b){
        return a/b;
    }
}
public class Demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Calculator calc=new Calculator();
        System.out.println("Addition: "+calc.add(num1, num2));
        System.out.println("Subtraction: "+calc.subtract(num1, num2));
        System.out.println("Multiplication: "+calc.multiply(num1, num2));
        System.out.println("Division: "+calc.divide(num1, num2));
        sc.close();
    }
}
