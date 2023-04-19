package com.David.week7.Presentation;

public class WhileLoop {
    public static void main(String[] args) {
        int [] list = new int[5];

        for (int i = 0; i < 5; i++) {
            list[i] = i + 2;
            System.out.println(list[i]);

        }

        int i = 0;
        while (i < 5){
            list[i] =  i + 2;
            i++;
            System.out.println(list[4]);
        }

        i = 0;

        do {
            list[i] =  i + 2;
            ++i;
            System.out.println(list[4]);
        } while ( i < 5);

    }
}
