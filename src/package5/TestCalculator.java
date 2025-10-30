package package5;

public class TestCalculator {
    public static void main(String[] args) {
        // Apelăm metodele direct pe clasă.
        int suma = MathHelper.aduna(5, 10);
        System.out.println("Suma este: " + suma);

        double arie = MathHelper.calculeazaArieCerc(10);
        System.out.println("Aria cercului este: " + arie);
    }
}