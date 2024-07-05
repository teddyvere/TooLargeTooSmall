import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){//feild declaration
      int randomNumber, guess, attempts;
      Scanner scanner = new Scanner(System.in);
      Random  random = new Random();
      randomNumber = random.nextInt((25) + 1);
      attempts = 1;
      // opening statement for game
      System.out.println("Thinking of a number between 1 - 25 pick one");
      // if else statement inside a while loop that determines the game logic
      guess = scanner.nextInt();
        while (guess != randomNumber) {
          if (guess > randomNumber) {
              System.out.println(guess + " is your guess");
              System.out.println("Lower! guess again");
              attempts += 1;
              ;
          } else {
              System.out.println(guess + " is your guess");
              System.out.println("Higher guess again");
              attempts += 1;
              }
          guess = scanner.nextInt();
          }
      System.out.println(randomNumber + " was the answer, it took you " + attempts + " attempts to get it");
      scanner.close();
      }
    }
