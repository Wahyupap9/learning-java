package projects;
import java.util.Scanner;

public class Hypotenuse{
    public static void main(String[] args) {
        // c=sqrt(a2 + b2)
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter the a length : ");
        a = scanner.nextDouble();
        System.out.print("Enter the b length : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The Hypotenuse is " + c);

        scanner.close();
    }
}