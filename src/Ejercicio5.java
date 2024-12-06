import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de su compra: ");
        double totalCompra = scanner.nextDouble();
        double descuento = 0;
        if (totalCompra >= 1000) {
            descuento = totalCompra * 0.20;
        } else if (totalCompra >= 500) {
            descuento = totalCompra * 0.10;
        } else {
            descuento = 0;
        }
        double totalConDescuento = totalCompra - descuento;
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total final a pagar: " + totalConDescuento);


    }
}


