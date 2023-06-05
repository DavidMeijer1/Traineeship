package simpleExercises.size13;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    public static boolean doubleX(String string){
        return string.contains("xx");
    }

}
