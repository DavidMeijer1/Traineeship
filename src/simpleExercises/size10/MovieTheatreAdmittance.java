package simpleExercises.size10;

public class MovieTheatreAdmittance {
    public static void main(String[] args) {
        System.out.println(acceptIntoMovie(16, false));
    }

    private static boolean acceptIntoMovie(int age, boolean isSupervised){
        return age > 14 || isSupervised;
    }
}
