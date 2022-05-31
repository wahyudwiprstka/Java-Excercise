import java.io.FileInputStream;
import java.io.IOException;

public class FInputStream {

    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            fin.skip(5);
            int i;
            while ((i = fin.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
