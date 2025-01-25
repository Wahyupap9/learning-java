package projects;
import java.util.Scanner;

public class QuizGame {
    static Scanner scanner = new Scanner(System.in);
    static int point = 0;
    public static void main(String[] args) {
        question("What is 2 + 2?", 1, "4", "2", "5","idk");
        question("Who is the smartest", 4, "Bilo", "Jack", "Finn","Steven (me)");
        question("What is the most delicious food in the world?", 4, "shit", "ass", "Nasi Padang","her ass");
        question("Why do i want to learn coding?", 1, "money money money", "very fun and endearing", "my mom told me to","everyone said it's cool, so do i!");
        
        System.out.println("Your point is " + point);

        scanner.close();
    }

    static void question(String question, int answer, String... choices){
        System.out.println(question);
        for(int i = 0; i < choices.length; i++){
            System.out.printf("%d. %s", i + 1, choices[i] + "\n");
        }
        System.out.print("Your guess : ");
        int playerGuess = scanner.nextInt();

        if(playerGuess == answer) {
            System.out.println("Correct!\n");
            point++;
        } else {
            System.out.println("Incorrect!\n");
        }
    }
}
