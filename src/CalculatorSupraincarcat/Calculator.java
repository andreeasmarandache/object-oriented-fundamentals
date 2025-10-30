package CalculatorSupraincarcat;

public class Calculator {

    //acceptă doi parametri int și returnează suma lor
    public int calculeazaSuma(int a, int b) {
        System.out.println("Se apelează versiunea cu int...");
        return a + b;
    }

    //acceptă doi parametri double și returnează suma lor
    public double calculeazaSuma(double a, double b) {
        System.out.println("Se apelează versiunea cu double...");
        return a + b;
    }

    //acceptă un array de int (int[]) și returnează suma tuturor elementelor din array

    public int calculeazaSuma(int[] numere) {
        System.out.println("Se apelează versiunea cu array...");
        int suma = 0;
        for (int numar : numere) {
            suma += numar;
        }
        return suma;
    }


}
