import java.io.*;

public class BReader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);

            int i;

            while((i = br.read()) != -1){
                System.out.print((char)i);
            }

            fr.close();
            br.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
