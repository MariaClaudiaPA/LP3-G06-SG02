package actividad03;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer[] intArray = {10, 2, 8, 6, 4, 7, 1, 9, 3, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingresa el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        try {
            imprimirArray(intArray, limiteInferior, limiteSuperior);
        } catch (LimiteInvalidoException e) {
            System.out.println("ERROR!!!!: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Sobrecarga 
    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Limites inválidos");
        }
        System.out.println("\nNúmero en el rango: ");

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println("\n¿Cuantos elementos hay en el rango?: " + (limiteSuperior - limiteInferior + 1));
    }
}

