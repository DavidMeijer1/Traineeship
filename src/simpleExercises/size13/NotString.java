package simpleExercises.size13;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString2("candy"));
        System.out.println(notString2("x"));
        System.out.println(notString2("not bad"));
    }

    public static String notString(String string){
        if (string.startsWith("not")){
            return string;
        } else {
            return "not " + string;
        }
    }

    public static String notString2(String string){
        if(string.length()<=2){
            return "not " + string;
        }
        String substring = string.substring(0,3);
        if(substring.equals("not")){
            return string;
        } else {
            return "not " + string;
        }
    }

}
