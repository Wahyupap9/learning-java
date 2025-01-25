package projects;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAmount, interest, compoundPerYear, year, totalMoney, profit;

        System.out.print("Enter the money Amount : ");
        moneyAmount = scanner.nextDouble();
        System.out.print("Enter the Interest rate (in %) : ");
        interest = scanner.nextDouble()/100;
        System.out.print("Enter the # of times compounded per year : ");
        compoundPerYear = scanner.nextDouble();
        System.out.print("Enter the # of years : ");
        year = scanner.nextDouble();

        totalMoney = moneyAmount * Math.pow((1 + interest / compoundPerYear), year);
        profit = totalMoney - moneyAmount;
        System.out.printf("The total money you will get is $%.2f\n", totalMoney);
        System.out.printf("The profit you will get is %+.0f", profit);

        scanner.close();

    }
}
