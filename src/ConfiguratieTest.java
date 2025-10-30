public class ConfiguratieTest {

    // O constantă publică, vizibilă de oriunde.
    // Valoarea ei nu mai poate fi schimbată după inițializare.
    // Constantele în Java sunt scrise, prin convenție, cu litere mari, iar cuvintele sunt separate prin _ (UPPER_SNAKE_CASE).
    public static final String BROWSER_DEFAULT = "Chrome";
    public static final int TIMEOUT_IN_SECUNDE = 30;

    public static void main(String[] args) {
        // Creăm un obiect de tip ConfiguratieTest
        ConfiguratieTest test = new ConfiguratieTest();

        // Apelăm metoda ruleazaTest()
        test.ruleazaTest();
    }

    public void ruleazaTest() {
        System.out.println("Se pornește testul pe browser-ul: " + BROWSER_DEFAULT);
        // TIMEOUT_IN_SECUNDE = 40; // EROARE DE COMPILARE! Cannot assign a value to final variable.
    }

}
