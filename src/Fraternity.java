import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        if(age >= 19 && gender=='M'){
            System.out.println("You can enjoy fraternity");
        }
        else{
            System.out.println("You can't enjoy fraternity");
        }
    }
}
