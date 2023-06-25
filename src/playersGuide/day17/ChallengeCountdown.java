package playersGuide.Day17;

public class ChallengeCountdown {
    public static void main(String[] args) {
        countdown(10);
    }
    public static int countdown(int n) {
        if (n == 0) {
            System.out.println("You have reached the end.");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
        return n;
    }
}