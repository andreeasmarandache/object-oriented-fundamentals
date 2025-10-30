package package5;

public class MathHelper {

    // O constantă statică
    public static final double PI = 3.14159;

    // O metodă statică utilitară. Primește tot ce are nevoie prin parametri.
    public static int aduna(int a, int b) {
        return a + b;
    }

    public static double calculeazaArieCerc(double raza) {
        // O metodă statică poate accesa un câmp static.
        return PI * raza * raza;
    }
}

