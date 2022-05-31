import java.util.ArrayList;
import java.util.Scanner;

public class HailstoneSequence {
    public static ArrayList hailstoneSequence(int num){
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(num);

        while(num > 1){
            if (num%2 == 0){
                num /= 2;
                sequence.add(num);
            }else{
                num = (num*3) + 1;
                sequence.add(num);
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(hailstoneSequence(num));
    }
}
