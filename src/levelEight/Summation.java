package levelEight;

public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    static int summation(int number) {
        int sum = 0;
        for (int i = 0; i < number + 1; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }
}
