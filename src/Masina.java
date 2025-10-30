public class Masina {

    // Câmpurile clasei
    public String marca;
    public String model;
    public int anFabricatie;
    public double vitezaCurenta;

    // Metodă care modifică viteza curentă
    public void accelereaza(double crestereViteza) {
        this.vitezaCurenta += crestereViteza;
        System.out.println("Mașina accelerează la " + this.vitezaCurenta + " km/h.");
    }

    // Metodă care returnează o descriere a mașinii
    public String getDescriere() {
        return "Mașina: " + this.marca + " " + this.model + " (" + this.anFabricatie + ")";
    }

    // Metodă care claxonează
    public void claxoneaza() {
        System.out.println("Beep! Beep!");
    }

    // Aici e metoda main care rulează tot
    static void main(String[] args) {
        // Creăm un obiect de tip Masina
        Masina masinaMea = new Masina();

        // Setăm valorile câmpurilor
        masinaMea.marca = "Dacia";
        masinaMea.model = "Duster";
        masinaMea.anFabricatie = 2022;
        masinaMea.vitezaCurenta = 0;

        // Afișăm descrierea mașinii
        System.out.println(masinaMea.getDescriere());

        // Facem mașina să claxoneze
        masinaMea.claxoneaza();

        // Accelerăm mașina
        masinaMea.accelereaza(50);
        masinaMea.accelereaza(30);
    }
}

