package package6;

public class Magazin {

    //o metodă main în care să creezi două produse, folosind ambii constructori, și să afișezi detaliile lor

    public static void main(String[] args) {
        Produs produs1 = new Produs("Laptop", 4500.0, "Electronice");
        Produs produs2 = new Produs("Caiet", 15.5);

        produs1.getProdus();
        produs2.getProdus();

    }
}
