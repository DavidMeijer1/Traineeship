package simpleExercises.size15;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("Kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    static String front22(String string){
        String firstTwoLetters = string.substring(0,2);
        return firstTwoLetters + string + firstTwoLetters;
    }

}
