import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            System.out.println("bytes available: " + bin.available());
            for (int i = 0; i < 3; i++){
                int ch = bin.read();
                System.out.print((char)ch);
            }
            System.out.println();
            System.out.println("bytes available: " + bin.available());
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
