package com.David.week5;

public class Reverse2 {
    public static void main(String[] args) {
        String unreversed = "tsest";

        StringBuilder builder = new StringBuilder();

        for (int i = unreversed.length(); i > 0; i--){
            builder.append(unreversed.charAt(i-1));
        }
        System.out.println(builder);

    }
}
