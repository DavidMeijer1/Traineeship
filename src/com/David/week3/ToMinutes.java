package com.David.week3;

import java.util.Scanner;

public class ToMinutes {
    public static void main(String[] args) {

        final int YEARS_TO_MONTHS = 12;
        final int MONTHS_TO_WEEKS = 4;
        final int WEEKS_TO_DAYS = 7;
        final int DAYS_TO_HOURS = 24;
        final int HOURS_TO_MINUTES = 60;

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Hoeveel jaren zijn er?");
        short years = inputKeyboard.nextShort();

        System.out.println("Hoeveel maanden zijn er?");
        byte months = inputKeyboard.nextByte();

        System.out.println("Hoeveel weken zijner ?");
        byte weeks = inputKeyboard.nextByte();

        System.out.println("Hoeveel dagen zijn er?");
        byte days = inputKeyboard.nextByte();

        System.out.println("Hoeveel uren zijn er?");
        byte hours = inputKeyboard.nextByte();

        int total = (years * YEARS_TO_MONTHS)+(months * MONTHS_TO_WEEKS)*(weeks * WEEKS_TO_DAYS)*(days * DAYS_TO_HOURS)*(hours * HOURS_TO_MINUTES);
        System.out.println("The total amount of minutes is :"+total);

    }
}