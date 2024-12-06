public class Persona {
//Ejercicio 10

    private String nombre;
    private int edad;
    private double altura;


    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }


    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Antony", 32, 1.75);

        persona1.imprimirDatos();
    }
}


