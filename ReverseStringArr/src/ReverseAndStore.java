import java.util.Scanner;

public class ReverseAndStore {
    public static String[] reverseArr(String arr[], int n){
        String reversedArr[] = new String[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            reversedArr[j] = arr[i];
            j++;
        }
        return reversedArr;
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
        System.out.println("ARRAY");
        System.out.print("[ ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        System.out.println("REVERSED ARRAY");
        // Call Method to reverse array and print it
        String reversedArr[] = reverseArr(arr, n);
        System.out.print("[ ");
        for(int i = 0; i < n; i++){
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println("]");
    }
}
