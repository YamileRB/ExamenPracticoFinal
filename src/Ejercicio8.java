import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        String str = "antony|fredy|julian|marcos";

        String[] partes = str.split("\\|");
        List<String> lista = new ArrayList<>();

        for (String parte : partes) {
            lista.add(parte);
        }

        System.out.println(lista);
    }
}
