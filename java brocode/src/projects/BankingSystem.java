package projects;
import java.util.Scanner;

public class BankingSystem {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 1000;
    static boolean isRunning = true;
    public static void main(String[] args) {


        // Welcome and give the user some choices
        System.out.println("Welcome to Wahyu Bank!");
        System.out.println("**********************\n");

        while(isRunning) {
        System.out.println("Choose the method =>");
        System.out.println("1. Show Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit\n");
        
        int choice = scanner.nextInt();
        System.out.println("");

        switch (choice) {
            case 1 -> showBalance();
            case 2 -> withDraw();
            case 3 -> deposit();
            case 4 -> exit();
            default -> System.out.println("Invalid");
        }
    }
        scanner.close();
    }
    // Showing balance
    static void showBalance() {
        System.out.printf("Your balance is $%.2f\n\n", balance);
    }

    // WithDraw 
    static void withDraw(){
        System.out.print("Enter the amount of money : ");
        double amount = scanner.nextDouble();
        
        balance -= amount;
        System.out.println("You withdraw $" + amount + " and your balance is now $" + balance + "\n");
        return;
    }

    // Deposit
    static void deposit(){
        System.out.print("Enter the amount of money : ");
        double amount = scanner.nextDouble();
        System.out.println("");
        
        balance += amount;
        System.out.println("You deposit $" + amount + " and your balance is now $" + balance + "\n");
        return;
    }

    // Exit
    static void exit() {
        isRunning = false;
        return;
    }
}
