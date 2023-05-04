package simpleExercises.size12;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String string){
        if(string.length()==1){
            return string;
        } else {
            String stringWithoutFirstAndLastCharacter = string.substring(1, string.length() - 1);
            return string.charAt(string.length() - 1) + stringWithoutFirstAndLastCharacter + string.charAt(0);
        }
    }
}
