import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("name is : "+name+"\n age is : "+age);
    }
}
