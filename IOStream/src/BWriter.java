import java.io.*;

public class BWriter {
    public static void main(String[] args) {
        try{
            String msg = "ABCDEF";

            File f = new File("file1.txt");
            if (f.createNewFile()){
                System.out.println("File is created");
            }

            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(msg);

            bw.flush();
            bw.close();
            fw.flush();
            fw.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
