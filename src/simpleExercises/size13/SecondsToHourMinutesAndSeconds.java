package simpleExercises.size13;

import java.time.Duration;
import java.util.Scanner;

public class SecondsToHourMinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println("Please give an amount of seconds. We will then calculate the amount of hours, minutes " +
                "and seconds");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        long hours = Duration.ofSeconds(seconds).toHours();
        long minutes = seconds % 60;
        long secondsLeft = minutes % 60;
        System.out.print("The amount of hours is " + hours);
        System.out.print(". The amount of minutes is " + minutes);
        System.out.print(". The amount of seconds is " + secondsLeft + ".");
    }
}
