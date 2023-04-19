package com.David.week6;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        System.out.println("Please give a decimal number that should be converted to an octal number.");
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        System.out.println("The decimal number is " + decimalNumber + ".");

        String s = Integer.toOctalString(decimalNumber);
        System.out.println("The octal number is " + s +".");

        int formerDecimalNumber = Integer.parseUnsignedInt(s, 8);
        System.out.println("The decimal number was :" + formerDecimalNumber + ".");

    }
}
