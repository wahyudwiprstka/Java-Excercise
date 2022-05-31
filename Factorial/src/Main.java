import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.println(num + " factorial is: " + factorial(num));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return n * (factorial(n-1));
        }
    }
}
