package ValidatoareUtilitare;

public class RegistrationTest {

    public static void main(String[] args) {
        System.out.println("Validare Email:");
        System.out.println("test@test.com -> " + Validator.isEmailValid("test@test.com")); // true
        System.out.println("test.com -> " + Validator.isEmailValid("test.com")); // false

        System.out.println("\nValidare Parolă:");
        System.out.println("parola123 -> " + Validator.isPasswordStrong("parola123")); // true
        System.out.println("parola -> " + Validator.isPasswordStrong("parola")); // false
        System.out.println("1234567 -> " + Validator.isPasswordStrong("1234567")); // false
    }

}
