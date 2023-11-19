package ejercicio02;
import java.util.Scanner;

public class AppIntercambio {
    public static void main(String[] args) {
        Integer[] miArreglo = {10, 26, 39, 47, 53};

        System.out.print("Arreglo original:\n");
        imprimirArreglo(miArreglo);

        Scanner scanner = new Scanner(System.in);

        try {
            // Ingresar los índices desde la entrada estándar
            System.out.print("Ingrese el primer índice: ");
            int indice1 = scanner.nextInt();

            System.out.print("Ingrese el segundo índice: ");
            int indice2 = scanner.nextInt();

            // Intercambiar los elementos en los índices proporcionados
            intercambiarElementos(miArreglo, indice1, indice2);
            System.out.print("Arreglo después del intercambio:\n");
            imprimirArreglo(miArreglo);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static <T> void intercambiarElementos(T[] arreglo, int indice1, int indice2) throws IndexOutOfBoundsException {
        if (indice1 < 0 || indice1 >= arreglo.length || indice2 < 0 || indice2 >= arreglo.length) {
            throw new IndexOutOfBoundsException("Índices fuera de rango.");
        }
        T temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }

    public static <T> void imprimirArreglo(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.println(elemento + " ");
        }
        System.out.println();
    }

}
