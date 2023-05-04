package simpleExercises.size10;

public class CompareStringsByCountOfCharacters {
    public static void main(String[] args) {
        System.out.println(compareStringsByCountOfCharacters("AB", "CD"));
        System.out.println(compareStringsByCountOfCharacters("ABC", "DE"));
        System.out.println(compareStringsByCountOfCharacters("hello", "edabit"));
    }

    private static boolean compareStringsByCountOfCharacters(String stringOne, String stringTwo){
        return stringOne.length() == stringTwo.length();
    }
}
