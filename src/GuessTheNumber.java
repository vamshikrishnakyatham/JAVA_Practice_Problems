import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        int ourGuess;
        int computerNumber;
        int guessCount=0;
        Random random = new Random();
        boolean guessNumber = false;
        Scanner sc = new Scanner(System.in);
        computerNumber= random.nextInt(100)+1;
        while (!guessNumber){
            System.out.println("Enter a integer guess : ");
            ourGuess=sc.nextInt();
            guessCount++;
            if(ourGuess>1 && ourGuess<=100) {
                if (ourGuess == computerNumber) {
                    System.out.println("You have guessed correct number " + guessCount);
                    guessNumber = true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("Your guess is too high");
                } else {
                    System.out.println("Your guess is too low");
                }
            }
            else {
                System.out.println("Your guess is wasted");
            }
        }
    }
}
