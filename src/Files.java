import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args){
        Scanner inFile;
        try{
            inFile=new Scanner(new File("input.txt"));
            int input;
            while(inFile.hasNext()){
                input=inFile.nextInt();
                System.out.println(input);
            }
            inFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file!");

            e.printStackTrace();
        }
    }
}
