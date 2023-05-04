package simpleExercises.size11;

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    static String backAround(String string){
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.insert(0, sb.charAt(sb.length()-1));
        sb.append(sb.charAt(sb.length()-1));
        return String.valueOf(sb);
    }
}
