
import java.io.*;
import java.io.IOException;

public class Filehandel {
    public static void main(String[] args) throws IOException {
        File myfile=new File("E:\\maskeen\\maskeeen.txt");
        if(myfile.createNewFile()){
            System.out.println("new file has been creaded");
        }
        else if(myfile.exists())
        {
            System.out.println("file already exist");
            myfile.canRead();
        }
        else{
            System.out.println("file not created");
        }
    }

    public Filehandel() {
    }
}
