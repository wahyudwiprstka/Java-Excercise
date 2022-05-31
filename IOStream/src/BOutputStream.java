import java.io.*;

public class BOutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("file.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String msg = "Hello! I am Wahyu Dwi Prastika";
            byte[] msgByte = msg.getBytes();

            bout.write(msgByte);
            bout.flush();
            bout.close();
            fout.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
