package playersGuide.day27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordValidator passwordValidator = new PasswordValidator();

        do {
            System.out.println("Please give a password.");
            String password = scanner.nextLine();
            
            try {
                boolean isValid = passwordValidator.passwordValidator(password);
                System.out.println(isValid + " The password is correct.");
            } catch (PasswordValidationException e) {
                System.out.println(e.getMessage());
            }

        } while (true);
    }


}
