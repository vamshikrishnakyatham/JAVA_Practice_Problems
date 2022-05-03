import java.util.Scanner;

public class Prj2_2_MadLibsClone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String adj1;
        String girlName;
        String occupation1;
        String adj2,adj3,place;
        String boyName,Mans_Name;
        String occupation2,cloth,hobby;
        System.out.println("Enter adjective1 : ");
        adj1=sc.nextLine();
        System.out.println("Enter girlName : ");
        girlName=sc.nextLine();
        System.out.println("Enter Occupation1 : ");
        occupation1=sc.nextLine();
        System.out.println("Enter adjective2 : ");
        adj2= sc.nextLine();
        System.out.println("Enter boyName : ");
        boyName= sc.nextLine();
        System.out.println("Enter occupation2");
        occupation2= sc.nextLine();
        System.out.println("Enter adjective3 : ");
        adj3= sc.nextLine();
        System.out.println("Enter name of the piece of cloth");
        cloth= sc.nextLine();
        System.out.println("Enter the name of hobby");
        hobby= sc.nextLine();
        System.out.println("Enter the name of place : ");
        place= sc.nextLine();
        System.out.println("Enter the man name");
        Mans_Name= sc.nextLine();
        System.out.println("There once was a "+adj1+" girl named "+girlName+" who was a "+adj2+" "+occupation1+" in the kingdom of "+place);
        System.out.print("She loved to wear "+cloth+" and to "+hobby+".She wanted to marry the "+adj3+" "+occupation2+" named "+boyName);
        System.out.print(" but her father, King "+Mans_Name+" forbid him from seeing him.");

    }
}
