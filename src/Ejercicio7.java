import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int contadorNotas = 0;
        double nota;

        do {
            System.out.print("Ingresa una nota (-1 para terminar): ");
            nota = scanner.nextDouble();
            if (nota != -1) {
                sumaNotas += nota;
                contadorNotas++;
            }
        } while (nota != -1);
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }


    }
}


