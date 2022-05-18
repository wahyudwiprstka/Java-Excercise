import java.util.Scanner;

public class Main {
    public static double perimeter(double radius){
        double result = 2 * 3.14 * radius;
        return result;
    }
    public static double area(double radius){
        double result = 3.14 * radius * radius;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Radius: ");
        double radius = input.nextDouble();
        System.out.println("Perimeter: " + perimeter(radius));
        System.out.println("Area: " + area(radius));
    }
}
