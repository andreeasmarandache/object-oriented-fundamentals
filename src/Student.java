public class Student {

    private String nume;
    private int nota;

    // Constructor pentru a initializa studentul
    public Student(String nume, int nota) {
        this.nume = nume;
        this.setNota(nota); // Folosim metoda setNota pentru a valida de la inceput
    }

    public void afiseazaDetalii() {
        System.out.println("Student: " + this.nume + ", Nota: " + this.nota);
    }

    public void setNota(int nouaNota) {
        if (nouaNota >= 1 && nouaNota <= 10) {
            this.nota = nouaNota;
        } else {
            System.out.println("Eroare: Nota " + nouaNota + " este invalidă. Trebuie să fie între 1 și 10.");
        }
    }

}
