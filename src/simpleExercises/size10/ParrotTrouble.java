package simpleExercises.size10;

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(false, 5));
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    private static boolean parrotTrouble(boolean isTalking, int hour){
        return isTalking && (hour < 7 || hour > 20);
    }
}
