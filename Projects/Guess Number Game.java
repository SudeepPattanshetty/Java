package Projects;
import java.util.Random;
import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("Enter your name: ");
    String name = in.next();
    int randomNumber = rand.nextInt(100);
    System.out.println("=====================================================");
    System.out.println("Guessing Number Game");
    System.out.println("=====================================================");

    for(int i=10; i>=0; i--){
        if(i==0){
            System.out.println("Failed! Better luck next time");
            break;
        }
        System.out.println("Remaining minimum number of guesses: " + i);
        System.out.println("Guess Your Number between 1 to 100: ");
        int num = in.nextInt();
        if(num == randomNumber){
            System.out.println("Congratulations "+name+" you won this game");
            break;
        }
        else if(randomNumber < num){
            System.out.println("Guessed number is too high");
        }
        else if(randomNumber > num){
            System.out.println("Guessed number is too low");
        }   
    }
    }
}
