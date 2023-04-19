package com.David.week4;

public class Exponent{
    static int base = 3;
    static int exp = 4;
    public static void main(String[] args) {
        System.out.println(OddEvenTest.isOdd(calculateExponent(base,exp)));
    }
    public static int calculateExponent(int base, int exp){
        return (int)Math.pow(base,exp);
    }
}
