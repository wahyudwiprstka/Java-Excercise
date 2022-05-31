import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float length;
        float breadth;
        int n1 = 10;
        int n2 = 15;
        int n3 = 19;
        float f1 = 4.23f;
        float f2 = 8.11f;
        Scanner input = new Scanner(System.in);

        Area rectangle1 = new Area();
        Calculate cal = new Calculate();

        System.out.print("Enter length: ");
        length = input.nextFloat();

        System.out.print("Enter breadth: ");
        breadth = input.nextFloat();

        rectangle1.setDim(length, breadth);
        System.out.println("Area of the rectangle is " + rectangle1.getArea());

        System.out.println(n1 + " + " + n2 + " = " + cal.sum(n1, n2));
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + cal.sum(n1, n2, n3));
        System.out.println(f1 + " + " + f2 + " = " + cal.sum(f1, f2));

    }
}
