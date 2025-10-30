package package1;

public class Canisa {

    public static void main(String[] args) {
        Animal caine = new Animal();
        // DA: `numePublic` este public, accesibil de oriunde.
        System.out.println(caine.numePublic);

        // DA: `varstaProtected` este protected, deci vizibil în același pachet.
        System.out.println(caine.varstaProtected);

        // DA: `culoareDefault` are vizibilitate default (package-private), deci vizibil în același pachet.
        System.out.println(caine.culoareDefault);

        // NU: `esteMamiferPrivate` este private, deci este vizibil DOAR în interiorul clasei Animal.
        // System.out.println(caine.esteMamiferPrivate); // Ar da eroare de compilare
    }

}
