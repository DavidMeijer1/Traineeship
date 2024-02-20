package levelSeven;

public class RegexValidatePIN {
    public static void main(String[] args) {
        System.out.println(validate("1234"));
        System.out.println(validate("12345"));
        System.out.println(validate("a234"));
    }

    static boolean validate(String input) {
        return input.matches("\\d+") && (input.length() == 4 || input.length() == 6);
    }

}
