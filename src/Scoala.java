public class Scoala {

    public static void main(String[] args) {
        Student student1 = new Student("Mihai", 7);
        student1.afiseazaDetalii(); // Afișează: Student: Mihai, Nota: 7

        System.out.println("\nÎncercăm să schimbăm notele...");
        student1.setNota(9); // Valid
        student1.afiseazaDetalii(); // Afișează: Student: Mihai, Nota: 9

        student1.setNota(11); // Invalid
        student1.afiseazaDetalii(); // Afișează tot: Student: Mihai, Nota: 9 (nota nu s-a schimbat)
    }

}
