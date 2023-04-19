package javaForBeginners.Chapter2;

public class GalToLit {
    public static void main(String[] args) {
        double liters, gallons;
        int counter;

        for(gallons = 1; gallons < 100; gallons++){
            liters = gallons * 3.70;
            System.out.println(gallons+" gallons is "+liters+" liters.");
        }

    }
}
