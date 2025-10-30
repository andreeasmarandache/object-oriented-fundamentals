public class ContBancar {

    private double sold; // Câmpul este privat, protejat!

    // Metodă publică pentru a depune bani (controlat)
    public void depune(double suma) {
        if (suma > 0) {
            this.sold += suma;
            System.out.println("S-au depus: " + suma);
        } else {
            System.out.println("Suma trebuie sa fie pozitivă!");
        }
    }

    // Metodă publică pentru a vedea soldul (doar citire)
    public double getSold() {
        return this.sold;
    }
}


