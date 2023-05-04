package simpleExercises.size11;

public class UsingTheAndOperator {
    public static void main(String[] args) {
        System.out.println(and(true, false));
        System.out.println(and(true, true));
        System.out.println(and(false, true));
        System.out.println(and(false, false));
    }

    private static boolean and(boolean booleanOne, boolean booleanTwo){
        return booleanOne && booleanTwo;
        }
    }
