public class Main {
    public static void main(String[] args) {
        int lines = 10;
        for (int i = 0; i <= 10; i+=2){
            for (int k = (lines-i); k >= 0; k-=2){
                    System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
