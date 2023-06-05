package simpleExercises.size14;

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
    }

     static String everyNth(String string, int n){
        String result = "";
        for (int i = 0; i < string.length(); i = i + n) {
            result = result + string.charAt(i);
        }
        return result;
    }

}
