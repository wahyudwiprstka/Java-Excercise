import java.io.*;

public class FWriter {
    public static void main(String[] args) {
        try {
            String msg = "Welcome to Lithan!";
//            File f = new File("file2.txt");
            FileWriter fw = new FileWriter("file.txt");
            fw.write(msg);
            fw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
