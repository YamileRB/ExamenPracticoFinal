import java.util.Scanner;

public class Ejercicio6 {
            public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa el número para la tabla de multiplicar: ");
            int numero = scanner.nextInt();
            int contador = 1;
            while (contador <= 20) {
                System.out.println(numero + " x " + contador + " = " + (numero * contador));
                contador = contador + 1;
            }

        }
    }


