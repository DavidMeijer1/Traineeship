package playersGuide.day27;

public class PasswordValidator {

    boolean passwordValidator(String password) throws PasswordValidationException {
        if (!containsDigits(password)) {
            throw new PasswordValidationException("Error: The password must contain at least one digit.");
        } else if (passwordTooShort(password)) {
            throw new PasswordValidationException("Error: The password is too short.");
        } else if (passwordTooLong(password)) {
            throw new PasswordValidationException("Error: The password is too long.");
        } else if (!containsUpperCaseLetters(password)) {
            throw new PasswordValidationException("Error: The password must contain at least one upper case letter.");
        } else if (!containsLowerCaseLetters(password)) {
            throw new PasswordValidationException("Error: The password must contain at least one lower case letter.");
        } else if (!containsAmpersand(password)) {
            throw new PasswordValidationException("Error: The password can't contain ampersands.");
        } else if (!containsCapitalLetterT(password)) {
            throw new PasswordValidationException("Error: The password can't contain capital T letters.");
        } else
            return true;
    }

    private static boolean containsDigits(String password) {
        long numberOfDigits = password.chars().filter(c -> Character.isDigit(c)).count();
        return numberOfDigits != 0;
    }

    private static boolean passwordTooShort(String password) {
        return password.length() < 6;
    }

    private static boolean passwordTooLong(String password) {
        return password.length() > 13;
    }

    private static boolean containsUpperCaseLetters(String password) {
        long numberOfUpperCaseLetters = password.chars().filter(c -> Character.isUpperCase(c)).count();
        return numberOfUpperCaseLetters != 0;
    }

    private static boolean containsLowerCaseLetters(String password) {
        long numberOfLowerCaseLetters = password.chars().filter(c -> Character.isLowerCase(c)).count();
        return numberOfLowerCaseLetters != 0;
    }

    private static boolean containsAmpersand(String password) {
        long numberOfAmpersand = password.chars().filter(c -> c == '&').count();
        return numberOfAmpersand < 1;
    }

    private static boolean containsCapitalLetterT(String password) {
        long numberOfCapitalLettersT = password.chars().filter(c -> c == 'T').count();
        return numberOfCapitalLettersT < 1;
    }


    private static long numberOfDigitsWithLoop(String password) {
        long count = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                count += 1;
            }
        }
        return count;
    }

}

//    public PasswordValidator(String password) {
//        this.password = password;
//    }
//
//    String validator(String password) {
//        if (password.length() < 6) {
//            return "The password is too short.";
//        } else if (password.length() > 13) {
//            return "The password is too long.";
//        }
//        for (char ch : password.toCharArray()) {
//            if (!Character.isUpperCase(ch)) {
//                return "The password must contain at least one uppercase letter.";
//            } else if (!Character.isLowerCase(ch)) {
//                return "The password must contain at  least one lowercase letter.";
//            } else if (!Character.isDigit(ch)) {
//                return "The password must contain at least one number";
//            }
//        }
//        return "The password is correct.";
//    }
//
//    public static void main(String[] args) {
//        String password = "hallo";
//        for (char ch : password.toCharArray()) {
//            if (Character.isLowerCase(ch)) {
//                System.out.println("The password must contain at least one uppercase letter.");
//                break;
//            }

//        }
//    }
//         long amount = password.chars().count();
//
//        System.out.println(amount);

//    Make a method that returns a boolean and has exceptions. Make sure the exceptions give the error messages.
