package projects;
import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pizza = 7.99, donut = 3.99, totalPrice;
        int totalItem;
        String item;

        System.out.println("Welcome to Wahyu Shopping Place!!");
        System.out.println("We Serve Pizza and Donut!");

        System.out.println("What would you like?");
        item = scanner.nextLine().toLowerCase();

        System.out.println("How many would you like?");
        totalItem = scanner.nextInt();
        
        
        if(item.equals("pizza")) {
            totalPrice = totalItem * pizza;
            System.out.println("The price is " + totalPrice);
        } else if (item.equals("donut")){
            totalPrice = totalItem * donut;
            System.out.println("The price is " + totalPrice);
        } else {
            System.out.println("We dont serve that food");
        }
        
        scanner.close();
    }
}
