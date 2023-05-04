package simpleExercises.size10;

public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }

    private static boolean or35(int number){
        return (number % 3 == 0) || (number % 5 == 0);
    }

}
