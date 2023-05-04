package simpleExercises.size12;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar2("kitten", 1));
        System.out.println(missingChar2("kitten", 0));
        System.out.println(missingChar2("kitten", 4));
    }

    public static String missingChar(String string, int n){
        char character = string.charAt(n);
        String newString = string.replace("" + character, "");
        return newString;
    }

    public static String missingChar2(String string, int n){
        return new StringBuilder(string).deleteCharAt(n).toString();
    }

}
