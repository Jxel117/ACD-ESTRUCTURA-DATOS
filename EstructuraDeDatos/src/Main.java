import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ramas: ");
        int numeroDeRamas = scanner.nextInt();

        Arbol arbol = new ArbolAvl();
        for (int i = 0; i < numeroDeRamas; i++) {
            arbol.ingresarValor("Rama " + (i + 1));
        }

        System.out.println("Valores en el árbol en orden:");
        arbol.enOrden();
        System.out.println("\nValores en el árbol en preorden:");
        arbol.preOrden();
        System.out.println("\nValores en el árbol en postorden:");
        arbol.postOrden();

        scanner.close();
    }
}