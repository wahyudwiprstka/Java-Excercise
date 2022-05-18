import java.util.Scanner;

public class Main {
    public static void convert(int decimal){
        int binary[] = new int[10];
        int index = 0;
        while(decimal>0){
            binary[index] = decimal%2;
            decimal /= 2;
            index++;
        }
        for(int i=index-1; i>=0; i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Make Scanner Object
        System.out.println("Program to Convert Decimal to Binary");
        System.out.print("Input the decimal number: ");
        int decimal = input.nextInt(); // Take user input

        System.out.print("Binary of " + decimal + " is: ");
        convert(decimal); // call method to convert decimal to binary
    }
}
