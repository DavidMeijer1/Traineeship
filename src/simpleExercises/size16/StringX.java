package simpleExercises.size16;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
    static String stringX(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'x' || i ==0 || i==string.length()-1){
                result += string.charAt(i);
            }
        }
        return result;
    }
}