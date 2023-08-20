import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = 25;
        
        System.out.println("¡Bienvenido al juego de adivina el numero!");
        System.out.print("Introduce tu suposicion: ");
        int suposicion = scanner.nextInt();
        
        if (suposicion == numeroAdivinar) {
            String premio = "EL PREMIO";
            System.out.println("¡Bien! ¡Has adivinado el número y ganaste un " + premio + "!");
        } else {
            System.out.println("Lo siento, no adivinaste el numero.");
        }
        
        scanner.close();
    }
}

