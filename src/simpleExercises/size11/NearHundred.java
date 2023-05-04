package simpleExercises.size11;

public class NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }

    public static boolean nearHundred(int n){
        return n >= 90 && n <= 110;
    }

}
