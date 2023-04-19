package com.David.week6;

import java.nio.charset.Charset;

public class CharSets {
//    for (String charSetName : Carset.availableCharsets().keySet()) h{

    public static void main(String[] args) {
        String charSetName = Charset.availableCharsets().toString();
        System.out.println(charSetName);
        String string = Charset.defaultCharset().displayName();
        System.out.println(string);
    }

    }
