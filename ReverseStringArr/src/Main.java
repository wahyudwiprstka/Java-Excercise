import java.util.Scanner;

public class Main {
    public static void reverseArr(String arr[], int n){
        System.out.print("[ ");
        for(int i = n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array Length: ");
        int n = input.nextInt();

        // Add Value To Array
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            System.out.print("Value-" + (i+1) + ": ");
            arr[i] = input.next();
        }

        // Print Array (not reversed)
        System.out.print("[ ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        // Call Method to reverse array and print it
        reverseArr(arr, n);
    }
}
