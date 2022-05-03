import java.util.Scanner;

public class DivBy3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number : ");
        int n = sc.nextInt();
        if(n%3==0){
            System.out.println("Number is divisible by 3");
        }
        else{
            System.out.println("Number is not divisible by 3");
        }
    }
}
