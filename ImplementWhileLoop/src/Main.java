import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean item = true;
        int price = 20;
        int itemCount = 0;

        while(item){
            itemCount++;
            System.out.println("Item Count: " + itemCount);
            System.out.print("Is there more item? (y/n): ");
            char confirm = input.next().charAt(0);
            if(confirm == 'y' || confirm == 'Y'){
                item = true;
            }else{
                break;
            }
        }
        System.out.println("Your item count: " + itemCount);
        System.out.println("Total Price: " + "USD " + price + " x " + itemCount);
        System.out.println("USD " + (price*itemCount));
    }
}
