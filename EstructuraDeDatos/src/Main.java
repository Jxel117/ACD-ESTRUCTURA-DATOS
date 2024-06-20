import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arbol Avl presentado en Orden, Preorden y Postorden.");
        System.out.print("Ingrese el numero de ramas para el arbol Avl: ");
        int numeroDeRamas = scanner.nextInt();

        Arbol arbol = new ArbolAvl();
        for (int i = 0; i < numeroDeRamas; i++) {
            arbol.ingresarValor("Rama " + (i + 1));
        }
        System.out.println("Orden:");
        arbol.enOrden();
        System.out.println("\nPreorden:");
        arbol.preOrden();
        System.out.println("\nPostorden:");
        arbol.postOrden();

        scanner.close();
    }
}