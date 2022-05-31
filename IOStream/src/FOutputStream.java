import java.io.*;

public class FOutputStream {
    public static void main(String[] args) throws IOException{
        try{
            File f = new File("file.txt");
            if (f.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File already exists");
            }

            String msg = "Hello World!\nI am Wahyu Dwi Prastika";
            byte[] msgByte = msg.getBytes();

            FileOutputStream fout = new FileOutputStream(f);
            fout.write(msgByte);
            fout.close();

        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
