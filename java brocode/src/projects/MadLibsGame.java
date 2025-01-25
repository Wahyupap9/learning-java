package projects;
import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1, adjective2, adjective3, noun, verb;

        System.out.println("Enter first adjective : ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter second adjective : ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter third adjective : ");
        adjective3 = scanner.nextLine();
        System.out.println("Enter first noun : ");
        noun = scanner.nextLine();
        System.out.println("Enter a verb : ");
        verb = scanner.nextLine();

        // Story
        System.out.println("Today I went to a " + adjective1 + " zoo!");
        System.out.println("I'm an exhibit, I saw a " + noun + ".");
        System.out.println(noun + " was " + adjective2 + " and " + verb);
        System.out.println("I was " + adjective3);
        
        scanner.close();
    }
}
