import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        saludar(nombre);
    }

    public static void saludar(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            System.out.println("Hola, " + nombre + "!");
        } else {
            System.out.println("Hola, Mundo!");
        }
    }
}



