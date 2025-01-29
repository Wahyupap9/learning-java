package projects;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer{
    public static void main(String[] args) {

        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many seconds to start the timer : ");
        int response = scanner.nextInt();
        System.out.println("");

        TimerTask timerTask = new TimerTask() {

            int count = response;

            @Override
            public void run(){
                if(count <= 0){
                    System.out.println("Happy New Year!!");
                    timer.cancel();
                } else{
                    System.out.println(count);
                    count--;
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        scanner.close();
    }
}