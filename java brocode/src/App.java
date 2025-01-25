import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Calculate area of a rectangle
        double width, height, areaOfRectangle;

        System.out.println("Enter the WIDTH of the rectangle : ");
        width = scanner.nextDouble();
        System.out.println("Enter the HEIGHT of the rectangle : ");
        height = scanner.nextDouble();

        areaOfRectangle = width * height;
        System.out.println("The area of the rectangle is : " + areaOfRectangle);
        scanner.close();
    }

}
