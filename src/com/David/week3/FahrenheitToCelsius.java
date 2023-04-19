package com.David.week3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("What is the temperature in Fahrenheit?");
        double Fahrenheit = inputKeyboard.nextDouble();

        double Celsius = ((Fahrenheit-32)/1.8);
        System.out.println("Then the temperature in Celsius is "+Celsius+" degrees.");

    }
}
