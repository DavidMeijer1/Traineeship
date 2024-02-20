package levelEight;

public class NeedleInTheHayStack {
    public static void main(String[] args) {
        System.out.println(findNeedle(new String[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }

    static String findNeedle(String[] array) {
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].equals("needle")) {
                position = i;
            }
        }
        return "Found the needle at position " + position + ".";
    }
}
