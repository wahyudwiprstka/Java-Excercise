import java.io.*;

public class FReader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("file.txt");
            int i;

            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
