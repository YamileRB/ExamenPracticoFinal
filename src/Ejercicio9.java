import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {
        String[] datos = {"antony", "32", "fredy", "45", "maria", "23"};
        List<String> nombres = new ArrayList<>();
        List<String> edades = new ArrayList<>();

        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0) {

                nombres.add(datos[i]);
            } else {

                edades.add(datos[i]);
            }
        }
        System.out.println("Nombres: " + nombres);
        System.out.println("Edades: " + edades);
    }
}


