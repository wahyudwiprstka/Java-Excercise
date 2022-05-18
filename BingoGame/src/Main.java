public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++){
            if((i+1)%5 != 0){
                System.out.print((i+1) + " ");
            }else{
                System.out.print("BINGO! ");
            }
        }
    }
}
