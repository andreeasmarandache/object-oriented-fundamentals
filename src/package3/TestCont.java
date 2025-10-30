package package3;

public class TestCont {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        // cont.sold = 100; // EROARE DE COMPILARE! 'sold' has private access.
        cont.depune(500);
        cont.depune(-50); // Afișează eroare, soldul rămâne neschimbat.
        System.out.println("Sold curent: " + cont.getSold());
    }

}
