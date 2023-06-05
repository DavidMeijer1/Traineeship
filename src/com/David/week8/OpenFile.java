package com.David.week8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            int x =  3/0;
        } catch (ArithmeticException e){
            System.out.println(e);
            }
        }

    }

