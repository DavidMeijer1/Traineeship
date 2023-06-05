package simpleExercises.size12;

public class BrokenBridge {
    public static void main(String[] args) {
        System.out.println(isSafeBridge("####"));
        System.out.println(isSafeBridge("## ####"));
        System.out.println(isSafeBridge("#"));
        System.out.println(isSafeBridge("### ####"));
        System.out.println(isSafeBridge("#####"));
    }

    public static boolean isSafeBridge(String string){
        return !string.contains(" ");
}
}
