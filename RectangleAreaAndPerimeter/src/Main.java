import java.util.Scanner;

public class Main {
    public static double perimeter(double width, double height){
        double result = (2*width) + (2*height);
        return result;
    }
    public static double area(double width, double height){
        double result = width * height;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Width: ");
        double width = input.nextDouble();
        System.out.print("Input Height: ");
        double height = input.nextDouble();

        System.out.println("Perimeter: " + perimeter(width, height));
        System.out.println("Area: " + area(width, height));
    }
}
