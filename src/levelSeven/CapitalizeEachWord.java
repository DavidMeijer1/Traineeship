package levelSeven;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        System.out.println(capitalizeEachWord("Most trees are green."));
    }

    static String capitalizeEachWord(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return null;
        }
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace(array[i].substring(0, 1), array[i].substring(0, 1).toUpperCase());
            sb.append(array[i]).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
