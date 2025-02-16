package main;

// Importamos las clases necesarias:
import java.util.Scanner;

// Scanner scanner = new Scanner(System.in);
// System.out.println("Introduce un número: ");
// int numero = scanner.nextInt();
// scanner.nextLine();
// scanner.close();

/**
 * @description: Clase principal del programa
 * @author edela
 */
public class Main {
    /**
     * @param args Tendremos una clase vaia
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables:
        float numero = 3, operador = 6;
        // Realizamos las operaciones:
        float suma = numero + operador;
        float resta = numero - operador;
        float multiplicacion = numero * operador;
        double division = numero / operador;
        // Mostramos los resultados:
        System.out.println("La suma de " + numero + " + " + operador + " es: " + suma);
        System.out.println("La resta de " + numero + " - " + operador + " es: " + resta);
        System.out.println("La multiplicación de " + numero + " * " + operador + " es: " + multiplicacion);
        System.out.println("La división de " + numero + " / " + operador + " es: " + division);

        if (numero > operador) {
            System.out.println("El número " + numero + " es mayor que " + operador);
        } else {
            System.out.println("El número " + numero + " es menor que " + operador);
        }
        if (suma > 10) {
            System.out.println("La suma es mayor que 10");
        } else {
            System.out.println("La suma es menor que 10, en esta caso es: " + suma);
        }

    }

}

public class Ederlara {

    public static void main(String[] args) {

    }
}
