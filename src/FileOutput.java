import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args){
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hi there");
            pw.println("My name is Sahithi");
            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't write to the file");
        }
    }
}
