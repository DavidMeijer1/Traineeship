package simpleExercises.size10;

import java.util.Scanner;

public class HelloMyLoveBug {
    public static void main(String[] args) {
        System.out.println(greeting("Matt"));
        System.out.println(greeting("Helen"));
        System.out.println(greeting("Mubashir"));
     }

    private static String greeting(String text) {
        if (text == "Mubashir") {
            return "Hello, my love!";
        } else {
            return "Hello " + text + "!";
        }
    }
}