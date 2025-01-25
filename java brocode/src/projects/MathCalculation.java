package projects;
import java.util.Scanner;

public class MathCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Math Class");
        System.out.println("1. Hypotenuse");
        System.out.println("2. Circle");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                double a, b, c;

                System.out.print("Enter the a length : ");
                a = scanner.nextDouble();
                System.out.print("Enter the b length : ");
                b = scanner.nextDouble();
    
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                System.out.println("The Hypotenuse is " + c);
                break;
            case 2:
                double radius,circumference, area, volume;

                System.out.print("Enter the radius : ");
                radius = scanner.nextDouble();

                circumference = 2 * Math.PI * radius;
                area = Math.PI * Math.pow(radius, 2);
                volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

                System.out.println("Circumference : " + circumference);
                System.out.println("Area : " + area);
                System.out.println("Volume : " + volume);
                break;
            default:
                System.out.println("Method is not defined");
        }
        


        scanner.close();
    }
}