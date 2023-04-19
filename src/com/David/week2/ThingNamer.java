package com.David.week2;

import java.util.Scanner;

public class ThingNamer {
    public static void main(String[] args) {

        System.out.println("What are we talking about?");
        Scanner input = new Scanner(System.in);
        String person = input.next();
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String adjective = input.next();
        System.out.println("What does he wear?");
        String c= input.next();
        String d = "3000";
        System.out.println("The " + adjective + " " + person + " of " + c + " " + d + "!");

    }
}