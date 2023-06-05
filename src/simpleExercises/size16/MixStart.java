package simpleExercises.size16;

public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    static boolean mixStart(String string){
        if(string.substring(1,3).equals("ix")){
            return true;
        } else return false;
    }
}
