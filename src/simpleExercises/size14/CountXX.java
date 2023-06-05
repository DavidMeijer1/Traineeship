package simpleExercises.size14;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    static int countXX(String string){
        int result = 0;
        for (int i = 0; i < string.length()-1; i++) {
            if(string.startsWith("xx", i)){
                result++;
            }
        }
        return result;
    }
}
