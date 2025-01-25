package projects;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double firstNum, secondNum, result;
        char operator;

        System.out.print("Enter the first number : ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter the operator : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number : ");
        secondNum = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case 'x':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            default:
                result=0;
                System.out.println("Wrong Choice");
                break;
        }

        System.out.println(result);

        scanner.close();
    }
}
