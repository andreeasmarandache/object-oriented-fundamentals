package CalculatorSupraincarcat;

public class TestCalculatorAvansat {
    public static void main(String[] args) {
        // Cream un obiect de tip Calculator pentru a putea folosi metodele clasei
        Calculator calc = new Calculator();

        // Apelăm metoda calculeazaSuma pentru două valori int
        // Se va folosi varianta metodei care primește doi int
        System.out.println("Suma (int): " + calc.calculeazaSuma(10, 20));

        // Apelăm metoda calculeazaSuma pentru două valori double
        // Se va folosi varianta metodei care primește doi double
        System.out.println("Suma (double): " + calc.calculeazaSuma(10.5, 20.2));

        // Definim un array de int-uri
        int[] arrayNumere = {1, 2, 3, 4, 5};

        // Apelăm metoda calculeazaSuma pentru un array de int-uri
        // Se va folosi varianta metodei care primește un array
        System.out.println("Suma (array): " + calc.calculeazaSuma(arrayNumere));
    }
}

