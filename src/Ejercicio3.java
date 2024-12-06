public class Ejercicio3 {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 5.2;
        double c = 0;

        double suma = a + b;
        System.out.println("Suma: " + suma);


        double resta = a - b;
        System.out.println("Resta: " + resta);


        double multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);


        try {
            double division = (a + b) / c;
            System.out.println("División (a + b) / c: " + division);
        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
