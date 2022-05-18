import java.util.Scanner;

public class WithUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the Multiplier: ");
        int multiplier = input.nextInt();
        System.out.print("How Much The Number Will Be: ");
        int total = input.nextInt();

        for(int i = 0; i < total; i++){
            if(((i+1)%multiplier) != 0){
                System.out.print((i+1) + " ");
            }else{
                System.out.print("BINGO! ");
            }
        }
    }
}
