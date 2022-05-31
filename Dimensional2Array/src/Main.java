public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; // 1 dimensional array
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}}; // 2 dimensional array

        // access array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("[ ");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("] ");


    }
}
