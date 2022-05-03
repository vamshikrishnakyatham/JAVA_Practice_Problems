import java.io.File;
import java.util.Scanner;

public class FileSearchAssignment1 {
    private void findingaAFile()
    {

        // address of files or folder where to search
        File file = new File("/Users/santh");
        //string to store the name of the file
        String string ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        int flag = 0;
        System.out.println("Enter the file or folder name");
        //take input
        string = in.nextLine();
        //list of file is stored in string
        String[] files = file.list();
        //continuous check each file or folder
        for (String strings : files){
            //check the name of file present or not and store in boolean str1
            //System.out.println(string);
            Boolean str = string.equals(strings);
            // str1 is T than print the following
            if (str){
                flag = 1;
                System.out.println("File Found : ");
                System.out.println(string);
                //print the address of the file
                System.out.println("Path : "+ file.getAbsolutePath());
            }
        }
        //if file not found
        if(flag == 0) {
            System.out.println("File not find : Reenter the name of the file.");
        }
    }
    public static void main(String[] args){
        //object of Demo class is created
        FileSearchAssignment1 obj = new FileSearchAssignment1();
        //calling the findFile()
        obj.findingaAFile();
    }
}
