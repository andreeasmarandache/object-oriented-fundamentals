package package4;

public class Fabrica {

    public static void main(String[] args) {
        System.out.println("Numărul inițial de mașini: " + Masina.getNumarMasiniCreate());

        Masina masina1 = new Masina("Dacia");
        Masina masina2 = new Masina("Ford");

        // Putem apela metoda statică direct pe clasă, nu avem nevoie de un obiect.
        System.out.println("Numărul total de mașini create: " + Masina.getNumarMasiniCreate()); // Va afișa 2
    }

}
