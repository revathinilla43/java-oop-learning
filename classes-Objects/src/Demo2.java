
import java.util.Scanner;
class Rectangle {

    int length;
    int width;

    int calculateArea() {
        // your code
        return length * width;
    }

    int calculatePerimeter() {
        // your code
        return 2 * (length + width);
    }
}

public class Demo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        int width1 = sc.nextInt();

        int length2 = sc.nextInt();
        int width2 = sc.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = length1;
        r1.width = width1;
        r2.length = length2;
        r2.width = width2;

        System.out.println("Area of rectangle 1: " + r1.calculateArea());
        System.out.println("Perimeter of rectangle 1: " + r1.calculatePerimeter());
        System.out.println("Area of rectangle 2: " + r2.calculateArea());
        System.out.println("Perimeter of rectangle 2: " + r2.calculatePerimeter());
        sc.close();
    }
}