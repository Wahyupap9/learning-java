package projects;
import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerInput, originNum = 0;

        System.out.print("Enter the # of dice to roll : ");
        playerInput = scanner.nextInt();
        
        if(playerInput <= 0){
            System.out.print("Please enter a positive number");
            scanner.close();
            return;
        }

        if(playerInput > 10000){
            System.out.print("Too many number");
            scanner.close();
            return;
        }
        
        for(int i = 0; i < playerInput; i++) {
            int randomNum = random.nextInt(1, 7);
            System.out.printf("You rolled: %d\n", randomNum);
            originNum += randomNum;
        }
        
        System.out.printf("Total Number : %d", originNum);
        scanner.close();
    }
}
