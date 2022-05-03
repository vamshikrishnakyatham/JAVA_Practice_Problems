import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=21){
            System.out.println("You can drink");
        }
        else if(age>=16){
            System.out.println("You can have drink and can't drive");
        }
        else{
            System.out.println("You have water");
        }
    }
}
