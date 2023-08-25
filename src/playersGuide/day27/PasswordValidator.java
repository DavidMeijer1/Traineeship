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

    private boolean containsDigits(String password) {
        long numberOfDigits = password.chars().filter(c -> Character.isDigit(c)).count();
        return numberOfDigits != 0;
    }

    private boolean passwordTooShort(String password) {
        return password.length() < 6;
    }

    private boolean passwordTooLong(String password) {
        return password.length() > 13;
    }

    private boolean containsUpperCaseLetters(String password) {
        long numberOfUpperCaseLetters = password.chars().filter(c -> Character.isUpperCase(c)).count();
        return numberOfUpperCaseLetters != 0;
    }

    private boolean containsLowerCaseLetters(String password) {
        long numberOfLowerCaseLetters = password.chars().filter(c -> Character.isLowerCase(c)).count();
        return numberOfLowerCaseLetters != 0;
    }

    private boolean containsAmpersand(String password) {
        long numberOfAmpersand = password.chars().filter(c -> c == '&').count();
        return numberOfAmpersand < 1;
    }

    private boolean containsCapitalLetterT(String password) {
        long numberOfCapitalLettersT = password.chars().filter(c -> c == 'T').count();
        return numberOfCapitalLettersT < 1;
    }
}