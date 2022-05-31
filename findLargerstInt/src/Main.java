import java.util.Scanner;

public class Main {
    public static int largerstDivider(int num){
        int result=1;
        for (int i = 1; i <= num/2; i++){
            if ((num%i == 0) && (i > result)){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 1){
            throw new Exception("Cannot Input Negative Number");
        }
        System.out.println(largerstDivider(num));
    }
}
