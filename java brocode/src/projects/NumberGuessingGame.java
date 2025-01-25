package projects;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num, playerNum, attempt = 0;
        boolean playerAgain = true;

        Random random = new Random();
        num = random.nextInt(0,11);

        while(playerAgain) {
            System.out.print("Enter a number to guess : ");
            playerNum = scanner.nextInt();

            attempt++;
            playerAgain = playerNum == num ? false : true;
            System.out.println("Wrong, try again\n");
        }
        System.out.println("Congrats! you guessed the number " + num + " for " + attempt + " times!");

        scanner.close();
    }
}
