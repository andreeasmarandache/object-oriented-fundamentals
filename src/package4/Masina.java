package package4;

public class Masina {
    // Câmp de instanță: fiecare mașină are propria marcă.
    private String marca;

    // Câmp static: un singur contor pentru TOATE mașinile.
    private static int numarMasiniCreate = 0;

    public Masina(String marca) {
        this.marca = marca;
        numarMasiniCreate++; // Incrementăm contorul static de fiecare dată când creăm o mașină nouă.
        System.out.println("S-a creat mașina cu marca " + this.marca);
    }

    // Metodă statică pentru a accesa un câmp static
    public static int getNumarMasiniCreate() {
        return numarMasiniCreate;
    }
}

