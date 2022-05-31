public class Main {
    public static void main(String[] args) {
        // Program to print odd number 1 - 99
        for(int i = 1; i < 100; i++){
            if((i%2) != 0){
                System.out.print(i + " ");
            }else{
                continue;
            }
        }
    }
}
