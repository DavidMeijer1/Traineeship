package levelSeven;

public class Accumulate {
    public static void main(String[] args) {
        System.out.println(accumulate("abcd"));
        System.out.println(accumulate("RqaEzty"));
        System.out.println(accumulate("cwAt"));
    }

    static String accumulate(String input) {
        String[] stringArray = input.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i].toUpperCase());
            sb.append(stringArray[i].repeat(i).toLowerCase());
            sb.append('-');
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

}
