package ValidatoareUtilitare;

public class Validator {

    public static boolean isEmailValid(String email) {
        if (email == null) return false;
        return email.contains("@") && email.endsWith(".com");
    }

    public static boolean isPasswordStrong(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        // Verificăm dacă există cel puțin o cifră
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; // Am găsit o cifră, e ok
            }
        }
        return false; // Nu am găsit nicio cifră
    }

}
