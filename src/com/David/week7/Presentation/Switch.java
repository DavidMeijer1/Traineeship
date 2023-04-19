package com.David.week7.Presentation;

public class Switch {
    public static void main(String[] args) {
        String browser = "";
        switch(browser){
            case "edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "chrome":
            case "firefox":
            case "opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");
                break;
            default:
                System.out.println("Je gebruikt een niet-ondersteunde browser");
        }
    }
}
