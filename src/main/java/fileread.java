
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) {
        char[] data=new char[100];
        try
        {
            FileReader fileread=new FileReader("E:\\maskeen\\maskeeen.txt");
          fileread.read(data);
            System.out.println("data reaceved success fully");
            System.out.println(data);
            fileread.close();
            
        }
        catch(IOException e){
            System.out.println("Error occor");
        }
    }
   
}
