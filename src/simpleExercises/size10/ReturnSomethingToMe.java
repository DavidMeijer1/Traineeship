package simpleExercises.size10;

public class ReturnSomethingToMe {
    public static void main(String[] args) {
        System.out.println(giveMeSomething("is better than nothing"));
        System.out.println(giveMeSomething("Bob Jane"));
        System.out.println(giveMeSomething("is something"));
    }

    private static String giveMeSomething(String text){
        StringBuilder StringBuilder = new StringBuilder(text);
        StringBuilder.insert(0,"something ");
        return StringBuilder.toString();
    }
}
