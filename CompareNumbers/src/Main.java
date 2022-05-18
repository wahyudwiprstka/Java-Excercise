import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
        System.out.print("Input second number: ");
        int secondNum = input.nextInt();

        // Check = or !=
        if(firstNum == secondNum){
            System.out.println(firstNum + " = " + secondNum);
        }else{
            System.out.println(firstNum + " != " + secondNum);
        }

        // Check > or <
        if(firstNum > secondNum){
            System.out.println(firstNum + " > " + secondNum);
        }else if(firstNum < secondNum){
            System.out.println(firstNum + " < " + secondNum);
        }

        // Check >= or <=
        if(firstNum >= secondNum){
            System.out.println(firstNum + " >= " + secondNum);
        }else{
            System.out.println(firstNum + " <= " + secondNum);
        }
    }
}
