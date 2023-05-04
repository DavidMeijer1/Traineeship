package simpleExercises.size14;

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String string){
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            newString = newString+string.substring(0, i+1);
        }
        return newString;
    }

}
