import java.util.Scanner;

public class Main {
    public static int calculateVowel(String text){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char textLowerCase = text.toLowerCase().charAt(i);
            if(textLowerCase == 'a' || textLowerCase == 'i' || textLowerCase == 'u' || textLowerCase == 'e' || textLowerCase == 'o') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
        System.out.println("Vowel count: " + calculateVowel(text));
    }
}
