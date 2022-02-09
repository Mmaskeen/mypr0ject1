
import java.io.FileWriter;
import java.io.IOException;


public class filewrite {
    public static void main(String[] args) {
        try{
            FileWriter filewrite=new FileWriter("E:\\maskeen\\maskeeen.txt");
            filewrite.write("Muhammad Maskeen PMA ARID UNIVERSTY");
            System.out.println("data written success fully");
            filewrite.close();
        }
        catch(IOException e){
            System.out.println("Error occor");
        }
    }
  
}
