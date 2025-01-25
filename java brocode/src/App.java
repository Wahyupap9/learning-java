import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean keepLooping = true;

        while(keepLooping) {
            System.out.print("Do you want to keep looping? (true/false) :");
            keepLooping = scanner.nextBoolean();
        }

        scanner.close();
    }

}
