import java.util.Scanner;

public class Main {
    public static void multiple(int input){
        int arr[] = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = input * (i + 1);
            System.out.println(input + " x " + (i+1) + " = " + arr[i]);
        }
    }
    public static void main(String[] args){
        boolean bool = true;
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = input.nextInt();
            multiple(num);
            System.out.print("You want to do it again? (Y/N): ");
            char confirm = input.next().charAt(0);
            if(confirm == 'y' || confirm == 'Y'){
                bool = true;
            }else if(confirm == 'n' || confirm == 'N'){
                bool = false;
                System.out.println("Thank you for use our program!");
            }else{
                System.out.println("You input the wrong keyword!");
            }
        }while(bool);
    }
}
