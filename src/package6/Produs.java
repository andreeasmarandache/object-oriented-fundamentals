package package6;

public class Produs {

    // Adaugă câmpurile private: nume (String), pret (double) și categorie (String)

    private String nume;
    private double pret;
    private String categorie;

    // Creează un constructor care acceptă toți cei trei parametri și inițializează obiectul
    // Supraîncarcă constructorul pentru a crea o variantă care acceptă doar nume și pret.
    // În acest caz, categorie ar trebui setată la valoarea implicită "General".

    public Produs(String nume, Double pret, String categorie) {
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
    }

    public Produs(String nume, double pret) {
        this(nume, pret, "General"); // Folosim constructor chaining pentru a evita duplicarea
    }

    public void getProdus() {
        System.out.println("Produs: " + nume + ", Preț: " + pret + " RON, Categorie: " + categorie);
    }

}
