import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String target;
        boolean isFound = false;

        String[] fruits = {"apple", "banana","mango"};

        System.out.print("Enter the Target: ");
        target = scanner.nextLine().toLowerCase();

        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].toLowerCase().equals(target)){
                isFound = true;
            }
        }

        if(isFound) {
            System.out.println("Found Item!");
        }else {
            System.out.println("NOT Found Item!");
        }

        scanner.close();
    }

}
