package levelSeven;

public class PrinterErrors {
    public static void main(String[] args) {
        System.out.println(printErrors("aaabbbbhaijjjm"));
        System.out.println(printErrors("aaaxbbbbyyhwawiwjjjwwm"));
    }

    static String printErrors(String input) {
        String[] array = input.split("");
        int count = 0;
        for (String s : array
        ) {
            if (s.matches("[n-z]")) {
                count++;
            }
        }
        return count + "/" + input.length();
    }

}
