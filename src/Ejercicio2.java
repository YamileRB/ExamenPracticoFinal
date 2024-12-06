import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de cuenta (1, 2 , 3 ): ");
        int numeroCuenta = scanner.nextInt();

        switch (numeroCuenta) {
            case 1:
                System.out.println("La cuenta seleccionada es: Cuenta Corriente");
                break;
            case 2:
                System.out.println("La cuenta seleccionada es: Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("La cuenta seleccionada es: Cuenta Nómina");
                break;
            default:
                System.out.println("Número de cuenta no válido. Ingresa un número entre 1 y 3.");
                break;
        }

    }
}
