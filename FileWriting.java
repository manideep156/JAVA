import java.io.*;

public class FileWriting {
    public static void main(String[] args){
        try{
            File file = new File("hello.txt");
            FileWriter writer = new FileWriter(file,true);
            writer.write("HEllo world!");
            writer.close();
        }
        catch(IOException e){
            System.out.println("Caught exception");
        }
        
    }
}
