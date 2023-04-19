package com.David.week3;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {

        final double KM_TO_MILES_FACTOR = 0.62;
        final double SECONDSPERMINUTE = 60;
        final double SECONDSPERHOUR=60*60;

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("What is the amount of meters?");
        double meters = inputKeyboard.nextDouble();

        System.out.println("What is the amount of hours?");
        double hours = inputKeyboard.nextDouble();

        System.out.println("What is the amount of minutes?");
        double minutes = inputKeyboard.nextDouble();

        System.out.println("What is the amount of seconds?");
        double seconds = inputKeyboard.nextDouble();

        double totalSeconds = (hours*SECONDSPERHOUR)+(minutes*SECONDSPERMINUTE)+seconds;
        System.out.println("The total amount of seconds is "+totalSeconds);

        double speedInMeterPerSecond = ((meters)/(totalSeconds));
        System.out.println("The speed in meters per second is "+speedInMeterPerSecond);

        double kilometersPerHour = speedInMeterPerSecond*3.6;
        System.out.println("The speed in kilometers per hour is "+kilometersPerHour);

        double milesPerHour = kilometersPerHour*0.62137;
        System.out.println("The speed in kilometers per hour is "+milesPerHour);


    }
}
